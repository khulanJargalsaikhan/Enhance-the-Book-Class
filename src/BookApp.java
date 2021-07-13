import java.util.ArrayList;

public class BookApp {
    public static void main(String[] args){

        Book b1 = new Book("Java1001", "Head First Java", "Kathy Sierra and Bert Bates",
                "Easy to read Java workbook", 47.50, true);

        Book b2 = new Book("Java1002", "Thinking in Java", "Bruce Eckel",
                "ADetails about Java under the hood", 20.0, false);

        Book b3 = new Book("Orcl1003", "OCP: Oracle Certified Professional Java SE",
                "Jeanne Boyarsky", "Everything you need to know in one place", 45.0, true);

        BookDB database = new BookDB();

        database.addBook(b1);
        database.addBook(b2);
        database.addBook(b3);

        for (Book book : database.bookList) {
            System.out.println(book.getDisplayText());
            System.out.println("----------------");
        }

        System.out.println(database.getBook("Orcl1003"));

    }
}