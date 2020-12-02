package base_pakage;

import java.util.*;

public class Database {
    List<Book> listOfBooks = new ArrayList<>();

    public Database() {
        listOfBooks.add(new Book("Qbook.0",
                "A.S. Johnsom",
                0,
                8.0,
                "The book about world",
                Arrays.asList("Hey", "Ya")
        ));
        listOfBooks.add(new Book("Vbook.1",
                "D.M. Qwert",
                1,
                6.4,
                "The book about young man",
                Arrays.asList("Salam", "Ya", "Aleikum")
        ));
        listOfBooks.add(new Book("Rbook.2",
                "Q.A. Berts",
                2,
                4.5,
                "The book about engines",
                Arrays.asList("Normal", "Boring")
        ));
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
        if (idBook < listOfBooks.size() && idBook >= 0) {

            for (Book listOfBook : listOfBooks) {
                if (listOfBook.getId() == idBook) {
                    double prevRate = listOfBook.getRating();
                    listOfBook.setRating((prevRate + rate) / 2);
                }
            }

            return true;
        } else {
            return false;
        }
    }

    public Boolean leaveComment(int idBook, String comment) {

        if (idBook < listOfBooks.size() && idBook >= 0) {
            List<String> listTmp = new ArrayList<>();

            for (Book listOfBook : listOfBooks) {
                if (listOfBook.getId() == idBook) {

                    listTmp.addAll(listOfBook.getComments());
                    listTmp.add(comment);

                    listOfBook.setComments(listTmp);
                }
            }

            return true;
        } else {
            return false;
        }
    }

    public List<Book> getBooks(List<String> filter) {
        if (filter.size() == 0) {
            return Collections.emptyList();
        }

        switch (filter.get(0)) {
            case "alphabetSort": {
                Collections.sort(listOfBooks, new Comparator<Book>() {
                    @Override
                    public int compare(Book o1, Book o2) {
                        return String.CASE_INSENSITIVE_ORDER.compare(o1.getName(), o2.getName());
                    }
                });
                break;
            }
            case "countCommentSort": {
                Collections.sort(listOfBooks, new Comparator<Book>() {
                    @Override
                    public int compare(Book o1, Book o2) {
                        return o1.getComments().size() - o2.getComments().size();
                    }
                });
                break;
            }
            case "rateSort": {
                Collections.sort(listOfBooks, new Comparator<Book>() {
                    @Override
                    public int compare(Book o1, Book o2) {
                        return (int) (o1.getRating() - o2.getRating());
                    }
                });
                break;
            }
            default: {

            }
        }


        return listOfBooks;
    }

    public Boolean registrate(String name, Integer password) {
        return false;
    }

    public List<String> authorizate(String name, Integer password) {
        List<String> tmp = Arrays.asList(name, "75 kg");
        return tmp;
    }
}
