package pl.sigitarius.dorel.model.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class FeatureImagesWebsite {

    private long articleNumber;
    private int id;
    private int imageId;
    private String path;
}
