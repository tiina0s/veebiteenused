/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryPackage;

import ee.ttu.idu0075._2017.library.AddBookRequest;
import ee.ttu.idu0075._2017.library.AddLibraryRequest;
import ee.ttu.idu0075._2017.library.BookType;
import ee.ttu.idu0075._2017.library.GetBookListRequest;
import ee.ttu.idu0075._2017.library.GetBookListResponse;
import ee.ttu.idu0075._2017.library.GetBookRequest;
import ee.ttu.idu0075._2017.library.GetLibraryListRequest;
import ee.ttu.idu0075._2017.library.GetLibraryListResponse;
import ee.ttu.idu0075._2017.library.LibraryBookListType;
import ee.ttu.idu0075._2017.library.LibraryBookType;
import ee.ttu.idu0075._2017.library.LibraryType;
import java.math.BigInteger;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author Kasutaja
 */
@WebService(serviceName = "LibraryService", portName = "LibraryPort", endpointInterface = "ee.ttu.idu0075._2017.library.LibraryPortType", targetNamespace = "http://www.ttu.ee/idu0075/2017/library", wsdlLocation = "WEB-INF/wsdl/LibraryWebServiceFromWSDL2/Service.wsdl")
public class LibraryWebServiceFromWSDL2 {

    static int nextBookId = 1;
    static int nextLibraryId = 1;
    static List<BookType> bookList = new ArrayList<BookType>();
    static List<LibraryType> libraryList = new ArrayList<LibraryType>();
    static List<BigInteger> isbnList = new ArrayList<BigInteger>();
    
    public LibraryType getLibrary(ee.ttu.idu0075._2017.library.GetLibraryRequest parameter) {
       LibraryType lt = null;
       if (parameter.getToken().equalsIgnoreCase("salajane")) {
           for (int i = 0; i < libraryList.size(); i++) {
               if (libraryList.get(i).getId().equals(parameter.getId())) {
                   lt = libraryList.get(i);
               }
           }
       } return lt;
    }

    public LibraryType addLibrary(AddLibraryRequest parameter) {
        LibraryType lt = new LibraryType();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            lt.setAddress(parameter.getAddress());
            lt.setInternetOption(parameter.getInternetOption());
            lt.setId(BigInteger.valueOf(nextLibraryId++));
            lt.setName(parameter.getName());
            lt.setLibraryBookList(new LibraryBookListType());
            libraryList.add(lt);
       }
       return lt;
    }

    public GetLibraryListResponse getLibraryList(GetLibraryListRequest parameter) {
        GetLibraryListResponse response = new GetLibraryListResponse();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (LibraryType libraryType : libraryList){
                response.getLibrary().add(libraryType);
            }
        }
        return response;
    }

    public BookType getBook(GetBookRequest parameter) {
        BookType bt = null;
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (int i = 0; i < bookList.size(); i++){
                if (bookList.get(i).getId().equals(parameter.getId())) {
                    bt = bookList.get(i);
                }
            }          
        }
        return bt;
    }

    public BookType addBook(AddBookRequest parameter) {
        BookType bt = new BookType();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
         //   for (int i = 0; i < isbnList.size(); i++){
           //     if (!parameter.getISBN().equals(isbnList.get(i))){
                    bt.setISBN(parameter.getISBN());
                    bt.setPublished(parameter.getPublished());
                    bt.setDescription(parameter.getDescription());
                    bt.setAuthor(parameter.getAuthor());
                    bt.setId(BigInteger.valueOf(nextBookId++));
                    bt.setTitle(parameter.getTitle());
                    bookList.add(bt);
                //    isbnList.add(bt.getISBN());
            //    }
         //   }
        }
        return bt;
    }

    public GetBookListResponse getBookList(GetBookListRequest parameter) {
        GetBookListResponse response = new GetBookListResponse();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (BookType bookType : bookList) {
                response.getBook().add(bookType);
            }
        }
        return response;
    }

    public LibraryBookType addLibraryBook(ee.ttu.idu0075._2017.library.AddLibraryBookRequest parameter) {
        LibraryBookType libraryBook = new LibraryBookType();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            GetBookRequest bookRequest = new GetBookRequest();
            bookRequest.setId(parameter.getBookId());
            bookRequest.setToken(parameter.getToken());
            libraryBook.setBook(getBook(bookRequest));
            libraryBook.setLengthOfLendingInDays(parameter.getLengthOfLendingInDays());
        
            for (int i = 0; i < libraryList.size(); i++) {
                if (libraryList.get(i).getId().equals(parameter.getLibraryId())) {
                    libraryList.get(i).getLibraryBookList().getLibraryBook().add(libraryBook);
                }
            }
            return libraryBook;
        }
        return null;
    }

    public ee.ttu.idu0075._2017.library.LibraryBookListType getLibraryBookList(ee.ttu.idu0075._2017.library.GetLibraryBookListRequest parameter) {
        LibraryBookListType libraryBookList = null;
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (int i = 0; i < libraryList.size(); i++){
                if (libraryList.get(i).getId().equals(parameter.getLibraryId())) {
                    libraryBookList = libraryList.get(i).getLibraryBookList();
                }
            }
        }
        return libraryBookList;
    }
    
}
