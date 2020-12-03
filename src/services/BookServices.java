package services;

import database_package.Database;
import models.Book;

import java.util.List;

public class BookServices {
    public String download(Database database, int idBook) {
        return database.downloadBook(idBook);
    }

    public Boolean rateBook(Database database, int idBook, Integer rate) {
        return database.rateBook(idBook, rate);
    }

    public Boolean leaveComment(Database database, int idBook, String comment){
        return database.leaveComment(idBook, comment);
    }

    public List<Book> getBooks(Database database, List<String> filter){
        return database.getBooks(filter);
    }
}
