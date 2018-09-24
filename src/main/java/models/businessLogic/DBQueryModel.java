package models.businessLogic;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DBQueryModel {
    private String table;
    private String[] where;
    private String[][] whereValue;

    public DBQueryModel(String Table, String[] Where, String[][] WhereValue) {
        table = Table;
        where = Where;
        whereValue = WhereValue;
    }
}
