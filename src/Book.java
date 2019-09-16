

public class Book {
    private String sku;
    private String title;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;
    //private BookDatabase mybooks= new BookDatabase();

    public Book(){}

    public Book(String mySku, BookDatabase mybooks){
        //this.mybooks = mybooks;
        this.sku = mySku;
        this.title = mybooks.getBook(sku).getTitle();
        this.author = mybooks.getBook(sku).getAuthor();
        this.description = mybooks.getBook(sku).getDescription();
        this.price = mybooks.getBook(sku).getPrice();
        this.isInStock = mybooks.getBook(sku).isInStock();
    }
    public Book(String sku, String title, String author, String descrip, double price, boolean inStock ){
        this.sku = sku;
        this.title = title;
        this.author = author;
        this.description = descrip;
        this.price = price;
        this.isInStock = inStock;
    }
    public String getDisplayText(){
        return "\nSKU: "+this.getSku()+"\nAuthor: "+ this.getAuthor() + "\nTitle: "+ this.getTitle()
        + "\nDescription: "+ this.getDescription();
    }

    public String getSku(){
        return sku;
    }
    public void setSku(String sku){
        this.sku = sku;
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
