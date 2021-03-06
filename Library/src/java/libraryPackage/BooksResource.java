/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryPackage;

import ee.ttu.idu0075._2017.library.AddBookRequest;
import ee.ttu.idu0075._2017.library.BookType;
import ee.ttu.idu0075._2017.library.GetBookListRequest;
import ee.ttu.idu0075._2017.library.GetBookListResponse;
import ee.ttu.idu0075._2017.library.GetBookRequest;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

/**
 * REST Web Service
 *
 * @author Kasutaja
 */
@Path("books")
public class BooksResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of BooksResource
     */
    public BooksResource() {
    }

    @GET
    @Produces("application/json")
    public GetBookListResponse getBookList(@QueryParam("token") String token, 
            @QueryParam("author") String author, @QueryParam("published") String published) {
        try {
        LibraryWebServiceFromWSDL2 ws = new LibraryWebServiceFromWSDL2();
        GetBookListRequest request = new GetBookListRequest();
        request.setToken(token);
        request.setAuthor(author);
            if (request.getAuthor() != null){
                DateFormat formatter; 
                formatter = new SimpleDateFormat("yyyy");
                Date date = formatter.parse(published);
                GregorianCalendar gregory = new GregorianCalendar();
                gregory.setTime(date);
                request.setPublished(DatatypeFactory.newInstance().newXMLGregorianCalendar(gregory));
                return ws.getBookList(request);
            }
        } catch (ParseException | DatatypeConfigurationException ex) {
            Logger.getLogger(BooksResource.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return null;
    }
    
    @GET
    @Path("{id : \\d+}") //supports digits only
    @Produces("application/json")
    public BookType getBook(@PathParam("id") String id,
            @QueryParam("token") String token) {
        LibraryWebServiceFromWSDL2 ws = new LibraryWebServiceFromWSDL2();
        GetBookRequest request = new GetBookRequest();
        request.setId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return ws.getBook(request);
    }
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public BookType addBook(BookType content, 
                                @QueryParam("token") String token) {
        LibraryWebServiceFromWSDL2 ws = new LibraryWebServiceFromWSDL2();
        AddBookRequest request = new AddBookRequest();
        request.setISBN(content.getISBN());
        request.setTitle(content.getTitle());
        request.setAuthor(content.getAuthor());
        request.setDescription(content.getDescription());
        request.setPublished(content.getPublished());
        request.setToken(token);
        return ws.addBook(request);
    }
}
