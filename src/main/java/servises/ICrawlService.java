package servises;

import models.DTO.CrawlDTO;
import models.businessLogic.CollectionModel;

public interface ICrawlService {
    CrawlDTO getSourceCode(CollectionModel model);
}
