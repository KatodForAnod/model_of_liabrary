package base_pakage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPage {
    private Filter filter;
    private User user;

    public MainPage() {
        filter = new Filter();
        user = new User();
    }

    public List<Book> getBooks(BookServices bookServices) {
        //объект в spring должен был создоваться
        Database database = Database.getObject();

        List<String> filterList = new ArrayList<>();
        if (filter.getAlphabetSort()) {
            filterList.add("alphabetSort");
        }

        return bookServices.getBooks(database, filterList);
    }

    public void selectBook(Book book, BookPage bookPage) {
        //запускается другая страница

        //через spring
        BookServices bookServices = new BookServices();

        if (user.getAuthorized()) {
            bookPage.setUserIsAuthorized(true);
        }
        bookPage.setIdBook(book.getId());

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Author: " + book.getAuthor());
        System.out.println("Rating: " + book.getRating());
        System.out.println("Description: " + book.getDescription());
        System.out.println("NameBook: " + book.getName());
        System.out.println("Comments: " + book.getComments().toString());

        System.out.println("1. download book");
        System.out.println("2. rate book");
        System.out.println("3. leave comment");
        System.out.println("4. exit");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: {
                bookPage.downloadBook(bookServices);
                return;
            }
            case 2: {
                System.out.println("rate : ");
                int rate = scanner.nextInt();

                if (bookPage.rateBook(bookServices, rate)) {
                    System.out.println("success");
                } else {
                    System.out.println("fail");
                }

                return;
            }
            case 3: {
                System.out.println("comment : ");
                String comment = scanner.next();

                if (bookPage.leaveComment(bookServices, comment)) {
                    System.out.println("success");
                } else {
                    System.out.println("fail");
                }

                return;
            }
            case 4: {
                return;
            }
        }
    }

    public Boolean authorize(UserService userService) {
        //объект в spring должен был создоваться
        Database database = Database.getObject();
        String userName = new String();
        Integer password = new Integer(0);

        User auth_user = userService.authorizate(userName, password, database);

        if (!auth_user.getAuthorized()) {
            System.out.println("false");

            return false;
        } else {
            user = auth_user;
            System.out.println("success");

            return true;
        }
    }

    public Boolean registrate(UserService userService) {
        //объект в spring должен был создоваться
        Database database = Database.getObject();
        String userName = new String();
        Integer password = new Integer(0);

        return userService.registrate(userName, password, database);
    }

}
