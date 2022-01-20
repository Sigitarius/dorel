package pl.sigitarius.dorel.model.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class SellingPoints {

    private long articleNumber;
    private int uspId;
    private String uspTitle;
    private String uspLongText;
    private String uspImageWebsite;

}
