public class Book {
    //private attributes
    private String SKU;
    private String bookTitle;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;

    //default constructor
    public Book(){

    }

    //overloaded constructor
    public Book(String SKU, String bookTitle, String author, String description, double price, boolean isInStock){
        this.SKU = SKU;
        this.bookTitle = bookTitle;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    //getters and setters
    public void setSKU(String SKU){
        this.SKU = SKU;
    }
    public String getSKU(){
        return this.SKU;
    }

    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }
    public String getBookTitle(){
        return this.bookTitle;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public void setIsInStock(boolean isInStock){
        this.isInStock = isInStock;
    }

    public boolean getIsInStock(){
        return this.isInStock;
    }

    //display method
    public void displayText(){
        System.out.printf("Boot Title: %s, Author: %s, Description: %s\n", bookTitle, author, description);
    }

    //display method with return String
    public String getDisplayText(){
        String printBook = "Title: " + bookTitle + "\nAuthor: " + author + "\nDescription: " + description;
        return printBook;
    }

}