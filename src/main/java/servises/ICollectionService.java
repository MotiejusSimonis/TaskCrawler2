package servises;

import models.DTO.CollectionDTO;
import models.businessLogic.CollectionModel;

public interface ICollectionService {
    CollectionDTO collect(CollectionModel model);
}
