package pl.sigitarius.dorel.model.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class FeaturesOverview {

    private long articleNumber;
    private String shortText;
    private String longText;
}
