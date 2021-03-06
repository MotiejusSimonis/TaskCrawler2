package models.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CrawlDTO {
    private String message;
    private boolean success;
    private String sourceCode;

    public CrawlDTO(String Message, boolean Success, String SourceCode) {
        message = Message;
        success = Success;
        sourceCode = SourceCode;
    }
}
