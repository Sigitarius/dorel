package pl.sigitarius.dorel.model.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Attribute {

    private long articleNumber;
    private int brandId;
    private String brandLabel;
    private int familyId;
    private String familyLabel;
    private int lineId;
    private String lineLabel;
    private int rangeId;
    private String rangeLabel;
    private int approximateAgeTextExtId;
    private String approximateAgeTextExtLabel;
    private int lengthClassExtId;
    private String lengthClassExtLabel;

}
