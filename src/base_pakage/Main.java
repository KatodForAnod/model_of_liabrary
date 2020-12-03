package base_pakage;

import class_page.BookPage;
import class_page.MainPage;
import models.Book;
import services.BookServices;
import services.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MainPage mainPage = new MainPage();
        UserService userService = new UserService();
        BookServices bookServices = new BookServices();
        BookPage bookPage = new BookPage();

        Scanner scanner = new Scanner(System.in);
        List<Book> bookList = new ArrayList<>();

        while (true) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("1. authorized");
            System.out.println("2. change filter");
            System.out.println("3. getBooks");
            System.out.println("4. selectBook");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    mainPage.authorize(userService);
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    bookList = mainPage.getBooks(bookServices);
                    for (int i = 0; i < bookList.size(); i++) {
                        System.out.println(i + ". " + bookList.get(i).getName());
                    }
                    System.out.println();
                    break;
                }
                case 4: {
                    int choice2 = scanner.nextInt();
                    mainPage.selectBook(bookList.get(choice2), bookPage);
                    break;
                }
            }
        }
    }
}
