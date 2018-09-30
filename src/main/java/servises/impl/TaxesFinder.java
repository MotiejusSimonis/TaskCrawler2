package servises.impl;

import models.constants.RegEx;
import servises.ITaxesFinder;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Finds Tax value, by given price
 */
public class TaxesFinder implements ITaxesFinder {


    /**
     * This method searches in source code line with price, and prices with taxes are found in recommendation
     * objects. In which second line after first found line with price is always taxes line. From which we can
     * find the value of taxes.
     * Example of object:
     * recommendation['ADT'] = {
     * 'price':'265.42',
     * 'tax':'95.42',
     * 'priceWithoutTax':'170.00',
     * 'fee':'0.0'
     * }
     * @priceFound if this one found, then next line should look like this: 'tax':'95.42',
     */
    public BigDecimal find(String sourceCode, BigDecimal price) {
        String[] lines = sourceCode.split(System.getProperty("line.separator"));
        boolean priceFound = false;
        for (int i = 0; i < lines.length; i++) {
            if (priceFound) {
                return findTaxValueFromName(lines[i]);
            }
            if(lines[i].contains("'price':'" + price.setScale(2, RoundingMode.CEILING) + "'")) {
                priceFound = true;
            }
        }
        return null;
    }


    /**
     * @param line example of incoming line: 'tax':'95.42',
     */
    private BigDecimal findTaxValueFromName(String line) {
        StringBuilder sb = new StringBuilder();
        //need com
        String newLine = line.substring(7);
        for (int i = 0; i < newLine.length(); i++) {
            if(newLine.charAt(i) == '\'') {
                break;
            }
            sb.append(newLine.charAt(i));
        }
        if (sb.toString().matches(RegEx.DOUBLE)) {
            BigDecimal val = new BigDecimal(Double.valueOf(sb.toString()), MathContext.DECIMAL64);
            return val.setScale(2, RoundingMode.CEILING);
        }
        return null;
    }
}
