package pl.sigitarius.dorel.model.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class FeatureImageWebsite {

    private long article_number;
    private int id;
    private String path;
}
