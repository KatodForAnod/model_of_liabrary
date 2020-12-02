package base_pakage;

import java.util.ArrayList;
import java.util.List;

public class MainPage {
    private Filter filter;
    private User user;

    public MainPage() {
        filter = new Filter();
        user = new User();
    }

    public List<Book> getBooks(BookServices bookServices) {
        //объект в spring должен был создоваться
        Database database = new Database();
        List<String> filterList = new ArrayList<>();

        return bookServices.getBooks(database, filterList);
    }

    public void selectBook(Book book, BookPage bookPage) {
        //зарускается другая страница
    }

    public Boolean authorize(UserService userService) {
        //объект в spring должен был создоваться
        Database database = new Database();
        String userName = new String();
        Integer password = new Integer(0);

        User auth_user = userService.authorizate(userName, password, database);

        if( auth_user.getAuthorized()== false){
            return false;
        }else {
            user = auth_user;
            return true;
        }
    }

    public Boolean registrate(UserService userService){
        //объект в spring должен был создоваться
        Database database = new Database();
        String userName = new String();
        Integer password = new Integer(0);

        return userService.registrate(userName, password, database);
    }

}
