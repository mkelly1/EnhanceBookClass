public class Book {
    private String title;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;

    public Book(){}
    public Book(String t, String a, String d, double p, boolean in ){
        this.title = t;
        this.author = a;
        this.description = d;
        this.price = p;
        this.isInStock = in;
    }
    public String getDisplayText(){
        return "Author: "+ this.getAuthor() + "\nTitle: "+ this.getTitle()
        + "\nDescription: "+ this.getDescription();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }
}
