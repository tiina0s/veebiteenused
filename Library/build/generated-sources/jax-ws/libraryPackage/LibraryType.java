
package libraryPackage;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for libraryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="libraryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="internetOption" type="{http://www.ttu.ee/idu0075/2017/library}hasInternetUseOption"/&gt;
 *         &lt;element name="libraryBookList" type="{http://www.ttu.ee/idu0075/2017/library}libraryBookListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "libraryType", propOrder = {
    "id",
    "name",
    "address",
    "internetOption",
    "libraryBookList"
})
public class LibraryType {

    @XmlElement(required = true)
    protected BigInteger id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String address;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected HasInternetUseOption internetOption;
    @XmlElement(required = true)
    protected LibraryBookListType libraryBookList;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the internetOption property.
     * 
     * @return
     *     possible object is
     *     {@link HasInternetUseOption }
     *     
     */
    public HasInternetUseOption getInternetOption() {
        return internetOption;
    }

    /**
     * Sets the value of the internetOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link HasInternetUseOption }
     *     
     */
    public void setInternetOption(HasInternetUseOption value) {
        this.internetOption = value;
    }

    /**
     * Gets the value of the libraryBookList property.
     * 
     * @return
     *     possible object is
     *     {@link LibraryBookListType }
     *     
     */
    public LibraryBookListType getLibraryBookList() {
        return libraryBookList;
    }

    /**
     * Sets the value of the libraryBookList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LibraryBookListType }
     *     
     */
    public void setLibraryBookList(LibraryBookListType value) {
        this.libraryBookList = value;
    }

}
