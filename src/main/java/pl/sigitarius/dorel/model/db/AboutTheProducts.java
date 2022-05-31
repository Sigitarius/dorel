package pl.sigitarius.dorel.model.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class AboutTheProducts {

    private long articleNumber;
    private String ean;
    private String introTextConsumer;
    private String longDescription2NdPart;

}
