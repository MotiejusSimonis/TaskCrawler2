package servises.impl;

import models.businessLogic.SegmentModel;
import servises.ISegmentFinder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This class collects information of segment objects, from source code.
 */
public class SegmentFinder implements ISegmentFinder {

    public List<SegmentModel> getAllSegments(String sourceCode) {
        List<String> splitted = spiltBySegments(sourceCode);
        List<SegmentModel> segments = getListFromSourceCodeSegments(splitted);
        return removeRepeatingModels(segments);
    }


    private List<String> spiltBySegments(String sourceCode) {
        return Arrays.asList(sourceCode.split("var segment = new Object"));
    }


    private List<SegmentModel> getListFromSourceCodeSegments(List<String> segments) {
        List<SegmentModel> newList = new ArrayList<>();
        for (String segment : segments) {
            if (isSegmentContainsAllVariables(segment)) {
                newList.add(addValuesToModelFromSegment(segment));
            }
        }
        return newList;
    }


    public List<SegmentModel> removeRepeatingModels(List<SegmentModel> list) {
        List<SegmentModel> newList = new ArrayList<>();
        if(list.isEmpty()) {
            return newList;
        }
        newList.add(list.get(0));
        for (SegmentModel model : list) {
            boolean isModelAlreadyExists = false;
            for (int i = 0; i < newList.size(); i++) {
                if (!isModelAlreadyExists && isModelsAreEqual(model, newList.get(i))) {
                    isModelAlreadyExists = true;
                }
                if (i == newList.size() - 1 && !isModelAlreadyExists) {
                    newList.add(model);
                }
            }
        }
        return newList;
    }


    public boolean isModelsAreEqual(SegmentModel m1, SegmentModel m2) {
        if (m1.getFlightId().equals(m2.getFlightId())
                && m1.getBLocation().equals(m2.getBLocation())
                && m1.getELocation().equals(m2.getELocation())
                && m1.getBDate().equals(m2.getBDate())
                && m1.getEDate().equals(m2.getEDate())) {
            return true;
        }
        return false;
    }


    private boolean isSegmentContainsAllVariables(String st) {
        if (st.contains("segment.flightId") && st.contains("segment.bLocation")
                && st.contains("segment.eLocation") && st.contains("segment.bDate")
                && st.contains("segment.eDate")) {
            return true;
        }
        return false;
    }


    private SegmentModel addValuesToModelFromSegment(String segment) {
        SegmentModel model = new SegmentModel();
        String[] lines = segment.split(System.getProperty("line.separator"));
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].contains("segment.flightId")) {
                model.setFlightId(findVariableValueInLine(lines[i], "segment.flightId"));
            }
            if (lines[i].contains("segment.bLocation")) {
                model.setBLocation(findVariableValueInLine(lines[i], "segment.bLocation"));
            }
            if (lines[i].contains("segment.eLocation")) {
                model.setELocation(findVariableValueInLine(lines[i], "segment.eLocation"));
            }
            if (lines[i].contains("segment.bDate")) {
                model.setBDate(findVariableValueInLine(lines[i], "segment.bDate"));
            }
            if (lines[i].contains("segment.eDate")) {
                model.setEDate(findVariableValueInLine(lines[i], "segment.eDate"));
            }
        }
        return model;
    }


    private String findVariableValueInLine(String line, String variable) {
        int index = line.lastIndexOf(variable);
        boolean isStartingPointFound = false;
        StringBuilder sb = new StringBuilder();
        for (int j = index; j < line.length(); j++) {
            if (isStartingPointFound && line.charAt(j) == '\"') {
                break;
            }
            if (isStartingPointFound) {
                sb.append(line.charAt(j));
            }
            if (line.charAt(j) == '\"') {
                isStartingPointFound = true;
            }
        }
        return sb.toString();
    }
}
