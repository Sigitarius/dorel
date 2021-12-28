
package pl.sigitarius.dorel.model.pim;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.sigitarius.dorel.model.pim2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Data_QNAME = new QName("", "data");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.sigitarius.dorel.model.pim2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Data }
     * 
     */
    public Data createData() {
        return new Data();
    }

    /**
     * Create an instance of {@link TechnicalDrawingsWebsite }
     * 
     */
    public TechnicalDrawingsWebsite createTechnicalDrawingsWebsite() {
        return new TechnicalDrawingsWebsite();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link LabelItem }
     * 
     */
    public LabelItem createLabelItem() {
        return new LabelItem();
    }

    /**
     * Create an instance of {@link UspItem }
     * 
     */
    public UspItem createUspItem() {
        return new UspItem();
    }

    /**
     * Create an instance of {@link LengthClassExt }
     * 
     */
    public LengthClassExt createLengthClassExt() {
        return new LengthClassExt();
    }

    /**
     * Create an instance of {@link Range }
     * 
     */
    public Range createRange() {
        return new Range();
    }

    /**
     * Create an instance of {@link ImageItem }
     * 
     */
    public ImageItem createImageItem() {
        return new ImageItem();
    }

    /**
     * Create an instance of {@link FeatureImagesWebsite }
     * 
     */
    public FeatureImagesWebsite createFeatureImagesWebsite() {
        return new FeatureImagesWebsite();
    }

    /**
     * Create an instance of {@link Brand }
     * 
     */
    public Brand createBrand() {
        return new Brand();
    }

    /**
     * Create an instance of {@link Line }
     * 
     */
    public Line createLine() {
        return new Line();
    }

    /**
     * Create an instance of {@link ApproximateAgeTextExt }
     * 
     */
    public ApproximateAgeTextExt createApproximateAgeTextExt() {
        return new ApproximateAgeTextExt();
    }

    /**
     * Create an instance of {@link USP }
     * 
     */
    public USP createUSP() {
        return new USP();
    }

    /**
     * Create an instance of {@link Family }
     * 
     */
    public Family createFamily() {
        return new Family();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Data }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "data")
    public JAXBElement<Data> createData(Data value) {
        return new JAXBElement<Data>(_Data_QNAME, Data.class, null, value);
    }

}
