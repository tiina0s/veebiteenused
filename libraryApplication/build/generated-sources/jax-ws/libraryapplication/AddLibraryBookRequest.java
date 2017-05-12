
package libraryapplication;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="libraryId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="bookId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="lengthOfLendingInDays" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "token",
    "libraryId",
    "bookId",
    "lengthOfLendingInDays"
})
@XmlRootElement(name = "addLibraryBookRequest")
public class AddLibraryBookRequest {

    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected BigInteger libraryId;
    @XmlElement(required = true)
    protected BigInteger bookId;
    @XmlElement(required = true)
    protected BigInteger lengthOfLendingInDays;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the libraryId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLibraryId() {
        return libraryId;
    }

    /**
     * Sets the value of the libraryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLibraryId(BigInteger value) {
        this.libraryId = value;
    }

    /**
     * Gets the value of the bookId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBookId() {
        return bookId;
    }

    /**
     * Sets the value of the bookId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBookId(BigInteger value) {
        this.bookId = value;
    }

    /**
     * Gets the value of the lengthOfLendingInDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLengthOfLendingInDays() {
        return lengthOfLendingInDays;
    }

    /**
     * Sets the value of the lengthOfLendingInDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLengthOfLendingInDays(BigInteger value) {
        this.lengthOfLendingInDays = value;
    }

}
