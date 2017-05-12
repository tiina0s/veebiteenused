/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryPackage;

import ee.ttu.idu0075._2017.library.AddBookRequest;
import ee.ttu.idu0075._2017.library.AddLibraryBookRequest;
import ee.ttu.idu0075._2017.library.AddLibraryRequest;
import ee.ttu.idu0075._2017.library.BookType;
import ee.ttu.idu0075._2017.library.GetBookListRequest;
import ee.ttu.idu0075._2017.library.GetBookListResponse;
import ee.ttu.idu0075._2017.library.GetBookRequest;
import ee.ttu.idu0075._2017.library.GetLibraryBookListRequest;
import ee.ttu.idu0075._2017.library.GetLibraryListRequest;
import ee.ttu.idu0075._2017.library.GetLibraryListResponse;
import ee.ttu.idu0075._2017.library.GetLibraryRequest;
import ee.ttu.idu0075._2017.library.LibraryBookListType;
import ee.ttu.idu0075._2017.library.LibraryBookType;
import ee.ttu.idu0075._2017.library.LibraryType;
import java.math.BigInteger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Kasutaja
 */
@Path("librarys")
public class LibrarysResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of LibraryResource
     */
    public LibrarysResource() {
    }

    @GET
    @Produces("application/json")
    public GetLibraryListResponse getLibraryList(@QueryParam("token") String token) {
        LibraryWebServiceFromWSDL2 ws = new LibraryWebServiceFromWSDL2();
        GetLibraryListRequest request = new GetLibraryListRequest();
        request.setToken(token);
        return ws.getLibraryList(request);
    }
    
    @GET
    @Path("{id : \\d+}") //supports digits only
    @Produces("application/json")
    public LibraryType getLibrary(@PathParam("id") String id,
            @QueryParam("token") String token) {
        LibraryWebServiceFromWSDL2 ws = new LibraryWebServiceFromWSDL2();
        GetLibraryRequest request = new GetLibraryRequest();
        request.setId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return ws.getLibrary(request);
    }
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public LibraryType addLibrary(LibraryType content, 
                                @QueryParam("token") String token) {
        LibraryWebServiceFromWSDL2 ws = new LibraryWebServiceFromWSDL2();
        AddLibraryRequest request = new AddLibraryRequest();
        request.setToken(token);
        request.setAddress(content.getAddress());
        request.setInternetOption(content.getInternetOption());
        request.setName(content.getName());
        return ws.addLibrary(request);
    }
    
    @GET
    @Path("{id : \\d+}/books")
    @Produces("application/json")
    public LibraryBookListType getLibraryBookList(@PathParam("id") String id, 
            @QueryParam("token") String token) {
        LibraryWebServiceFromWSDL2 ws = new LibraryWebServiceFromWSDL2();
        GetLibraryBookListRequest request = new GetLibraryBookListRequest();
        request.setLibraryId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return ws.getLibraryBookList(request);
    }
    
    @POST
    @Path("{id : \\d+}/books")
    @Consumes("application/json")
    @Produces("application/json")
    public LibraryBookType addLibraryBook(AddLibraryBookRequest content, 
                                @QueryParam("token") String token,
                                @PathParam("id") String id) {
        LibraryWebServiceFromWSDL2 ws = new LibraryWebServiceFromWSDL2();
        AddLibraryBookRequest request = new AddLibraryBookRequest();
        request.setToken(token);
        request.setLibraryId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setBookId(content.getBookId());
        request.setLengthOfLendingInDays(content.getLengthOfLendingInDays());
        return ws.addLibraryBook(request);
    }
}
