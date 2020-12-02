package base_pakage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Database {
    List<Book> listOfBooks = new ArrayList<Book>();

    public Database() {
        new Book("0.book",
                "A.S. Johnsom",
                0,
                8.0,
                "The book about world",
                Arrays.asList(new String[]{"Hey", "Ya"})
        );
        new Book("0.book",
                "A.S. Johnsom",
                0,
                8.0,
                "The book about world",
                Arrays.asList(new String[]{"Hey", "Ya"})
        );
        new Book("0.book",
                "A.S. Johnsom",
                0,
                8.0,
                "The book about world",
                Arrays.asList(new String[]{"Hey", "Ya"})
        );
    }

    public String downloadBook(int idBook) {

        switch (idBook) {
            case 0: {
                return "Its a 0.book";
            }
            case 1: {
                return "Its a 1.book";
            }
            case 2: {
                return "Its a 2.book";
            }
            default: {
                return "Its a default.book";
            }
        }
    }

    public Boolean rateBook(int idBook, Integer rate) {
        return false;
    }

    public Boolean leaveComment(int idBook, String comment) {
        return false;
    }

    public List<Book> getBooks(List<String> filter) {
        return Collections.emptyList();
    }

    public Boolean registrate(String name, Integer password) {
        return false;
    }

    public List<String> authorizate(String name, Integer password) {
        return Collections.emptyList();
    }
}
