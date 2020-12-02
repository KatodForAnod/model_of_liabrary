package base_pakage;


public class BookPage {
    private Boolean userIsAuthorized;
    private int idBook;

    public String downloadBook(BookServices bookServices){
        //объект в spring должен был создоваться
        Database database = new Database();
        return bookServices.download(database, idBook);
    }

    public Boolean leaveComment(BookServices bookServices, String comment){
        if(userIsAuthorized == false){
            return false;
        }

        //объект в spring должен был создоваться
        Database database = new Database();
        return bookServices.leaveComment(database, idBook, comment);
    }

    public Boolean rateBook(BookServices bookServices, Integer rate){
        if(userIsAuthorized == false){
            return false;
        }

        //объект в spring должен был создоваться
        Database database = new Database();
        return bookServices.rateBook(database, idBook, rate);
    }

    public BookPage() {
        userIsAuthorized = false;
    }

    public void setUserIsAuthorized(Boolean userIsAuthorized) {
        this.userIsAuthorized = userIsAuthorized;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }
}
