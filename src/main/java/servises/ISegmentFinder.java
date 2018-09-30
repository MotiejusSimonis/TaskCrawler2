package servises;

import models.businessLogic.SegmentModel;
import java.util.List;

public interface ISegmentFinder {
    List<SegmentModel> getAllSegments(String sourceCode);
}
