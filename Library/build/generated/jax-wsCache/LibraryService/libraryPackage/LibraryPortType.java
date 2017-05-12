
package libraryPackage;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "LibraryPortType", targetNamespace = "http://www.ttu.ee/idu0075/2017/library")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LibraryPortType {


    /**
     * 
     * @param parameter
     * @return
     *     returns libraryPackage.LibraryType
     */
    @WebMethod
    @WebResult(name = "getLibraryResponse", targetNamespace = "http://www.ttu.ee/idu0075/2017/library", partName = "parameter")
    public LibraryType getLibrary(
        @WebParam(name = "getLibraryRequest", targetNamespace = "http://www.ttu.ee/idu0075/2017/library", partName = "parameter")
        GetLibraryRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns libraryPackage.LibraryType
     */
    @WebMethod
    @WebResult(name = "addLibraryResponse", targetNamespace = "http://www.ttu.ee/idu0075/2017/library", partName = "parameter")
    public LibraryType addLibrary(
        @WebParam(name = "addLibraryRequest", targetNamespace = "http://www.ttu.ee/idu0075/2017/library", partName = "parameter")
        AddLibraryRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns libraryPackage.GetLibraryListResponse
     */
    @WebMethod
    @WebResult(name = "getLibraryListResponse", targetNamespace = "http://www.ttu.ee/idu0075/2017/library", partName = "parameter")
    public GetLibraryListResponse getLibraryList(
        @WebParam(name = "getLibraryListRequest", targetNamespace = "http://www.ttu.ee/idu0075/2017/library", partName = "parameter")
        GetLibraryListRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns libraryPackage.BookType
     */
    @WebMethod
    @WebResult(name = "getBookResponse", targetNamespace = "http://www.ttu.ee/idu0075/2017/library", partName = "parameter")
    public BookType getBook(
        @WebParam(name = "getBookRequest", targetNamespace = "http://www.ttu.ee/idu0075/2017/library", partName = "parameter")
        GetBookRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns libraryPackage.BookType
     */
    @WebMethod
    @WebResult(name = "addBookResponse", targetNamespace = "http://www.ttu.ee/idu0075/2017/library", partName = "parameter")
    public BookType addBook(
        @WebParam(name = "addBookRequest", targetNamespace = "http://www.ttu.ee/idu0075/2017/library", partName = "parameter")
        AddBookRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns libraryPackage.GetBookListResponse
     */
    @WebMethod
    @WebResult(name = "getBookListResponse", targetNamespace = "http://www.ttu.ee/idu0075/2017/library", partName = "parameter")
    public GetBookListResponse getBookList(
        @WebParam(name = "getBookListRequest", targetNamespace = "http://www.ttu.ee/idu0075/2017/library", partName = "parameter")
        GetBookListRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns libraryPackage.LibraryBookType
     */
    @WebMethod
    @WebResult(name = "addLibraryBookResponse", targetNamespace = "http://www.ttu.ee/idu0075/2017/library", partName = "parameter")
    public LibraryBookType addLibraryBook(
        @WebParam(name = "addLibraryBookRequest", targetNamespace = "http://www.ttu.ee/idu0075/2017/library", partName = "parameter")
        AddLibraryBookRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns libraryPackage.LibraryBookListType
     */
    @WebMethod
    @WebResult(name = "getLibraryBookListResponse", targetNamespace = "http://www.ttu.ee/idu0075/2017/library", partName = "parameter")
    public LibraryBookListType getLibraryBookList(
        @WebParam(name = "getLibraryBookListRequest", targetNamespace = "http://www.ttu.ee/idu0075/2017/library", partName = "parameter")
        GetLibraryBookListRequest parameter);

}
