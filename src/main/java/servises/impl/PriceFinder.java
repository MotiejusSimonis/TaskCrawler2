package servises.impl;

import models.constants.FlightDirection;
import models.constants.RegEx;
import servises.IPriceFinder;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class PriceFinder implements IPriceFinder {

    public BigDecimal findCheapestPrice(String sourceCode, FlightDirection direction, String flightId) {
        List<String> lines = findLinesWithPrices(sourceCode, direction, flightId);
        List<Double> prices = findValuesFromLines(lines);
        return findLowestValue(prices);
    }


    /**
     * This method finds lines which contains prices.
     * Examples:
     * 1. $('#price_1_9_PREMB').attr('data-price','279.44');    <-- stands for "SAS Plus" price in page
     * 2. $('#price_0_0_ECOA').attr('data-price','153.67');     <-- stands for "SAS Go" price in page
     * 3. $('#price_1_0_ECONBG').attr('data-price','156.99');   <-- stands for "SAS Go Light" price in page
     */
    private List<String> findLinesWithPrices(String sourceCode, FlightDirection direction, String flightId) {
        List<String> list = new ArrayList<>();
        String[] lines = sourceCode.split(System.getProperty("line.separator"));
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].contains(direction.getTableNumber() + "_" + flightId + "_PREMB').attr('data-price','")
                    || lines[i].contains(direction.getTableNumber() + "_" + flightId + "_ECOA').attr('data-price','")
                    || lines[i].contains(direction.getTableNumber() + "_" + flightId + "_ECONBG').attr('data-price','")) {
                list.add(lines[i]);
            }
        }
        return list;
    }


    private List<Double> findValuesFromLines(List<String> lines) {
        List<Double> values = new ArrayList<>();
        for (String line : lines) {
            values.add(findValue(line));
        }
        return values;
    }


    /**
     * @param line, then example of line from source code in which info is contained would look like this:
     * $('#price_1_15_ECONBG').attr('data-price','264.98');
     */
    private Double findValue(String line) {
        //settings
        int index = line.lastIndexOf(".attr('data-price','") + 20;
        StringBuilder sb = new StringBuilder();
        for (int i = index; i < line.length(); i++) {
            if (line.charAt(i) == '\'') {
                break;
            }
            sb.append(line.charAt(i));
        }
        if (sb.toString().matches(RegEx.DOUBLE)) {
            return Double.valueOf(sb.toString());
        }
        return null;
    }


    private BigDecimal findLowestValue(List<Double> prices) {
        if (prices == null || prices.isEmpty()) {
            return null;
        }
        Double smallestValue = null;
        for (int i = 0; i < prices.size(); i++) {
            if (prices.get(i) != null && smallestValue == null) {
                smallestValue = prices.get(i);
            }
            if (prices.get(i) != null && smallestValue > prices.get(i)) {
                smallestValue = prices.get(i);
            }
        }
        BigDecimal val = new BigDecimal(smallestValue, MathContext.DECIMAL64);
        return val.setScale(2, RoundingMode.CEILING);
    }
}
