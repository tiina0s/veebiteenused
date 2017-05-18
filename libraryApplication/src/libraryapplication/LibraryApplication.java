/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryapplication;

import java.math.BigInteger;

/**
 *
 * @author Kasutaja.
 */
public class LibraryApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GetBookRequest bookRequest = new GetBookRequest();
        bookRequest.setToken("salajane");
        bookRequest.setId(BigInteger.ONE);
        System.out.println("Id: " + getBook(bookRequest).getId() + ", author: " + getBook(bookRequest).getAuthor() +
                ", title: " + getBook(bookRequest).getTitle() + ", published: " + getBook(bookRequest).getPublished());
        
        GetLibraryRequest libraryReq = new GetLibraryRequest();
        libraryReq.setToken("salajane");
        libraryReq.setId(BigInteger.ONE);
        System.out.println("Nimi: " + getLibrary(libraryReq).getName() 
                            + ", aadress: " + getLibrary(libraryReq).getAddress());
    
    }

    private static BookType getBook(libraryapplication.GetBookRequest parameter) {
        libraryapplication.LibraryService service = new libraryapplication.LibraryService();
        libraryapplication.LibraryPortType port = service.getLibraryPort();
        return port.getBook(parameter);
    }

    private static LibraryType getLibrary(libraryapplication.GetLibraryRequest parameter) {
        libraryapplication.LibraryService service = new libraryapplication.LibraryService();
        libraryapplication.LibraryPortType port = service.getLibraryPort();
        return port.getLibrary(parameter);
    }
    
}
