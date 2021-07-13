import java.util.ArrayList;

public class BookDB {
    //attribute
    ArrayList<Book> bookList = new ArrayList<>();

    public BookDB(){
        this.bookList = new ArrayList<>();
    }

    public BookDB(String SKU){
        this.bookList = new ArrayList<>();
    }

    public void addBook(Book b){
        bookList.add(b);
    }

    public String getBook(String SKU){
        String book;

        for (int i=0; i< bookList.size(); i++ ){
            if (bookList.get(i).getSKU() == SKU)
                return book = bookList.get(i).getDisplayText();
        }
        return null;
    }

}
