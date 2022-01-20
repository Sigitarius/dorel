package pl.sigitarius.dorel.model.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@ToString
public class Pim {

    private int id;
    private LocalDateTime created;
    private LocalDateTime changed;
    private long parentId;
    private long pdmarticleId;
    private String label;
    private String firstCollectionYear;
    private String seoProductName;
    private String seoDescription;
    private long articleNumber;
    private String externalKey;
    private String sku;
    private String ean13BarcodeText;
    private String erpFullProductName;
    private String commercialProductName;
    private String grossWeight;
    private String netWeight;
    private String volume;
    private String productWeight;

}
