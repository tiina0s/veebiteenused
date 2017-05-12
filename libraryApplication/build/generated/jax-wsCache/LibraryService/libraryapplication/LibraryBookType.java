
package libraryapplication;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for libraryBookType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="libraryBookType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="book" type="{http://www.ttu.ee/idu0075/2017/library}bookType"/>
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
@XmlType(name = "libraryBookType", propOrder = {
    "book",
    "lengthOfLendingInDays"
})
public class LibraryBookType {

    @XmlElement(required = true)
    protected BookType book;
    @XmlElement(required = true)
    protected BigInteger lengthOfLendingInDays;

    /**
     * Gets the value of the book property.
     * 
     * @return
     *     possible object is
     *     {@link BookType }
     *     
     */
    public BookType getBook() {
        return book;
    }

    /**
     * Sets the value of the book property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookType }
     *     
     */
    public void setBook(BookType value) {
        this.book = value;
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
