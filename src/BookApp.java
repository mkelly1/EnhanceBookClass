
public class BookApp {
    public static void main(String[] args) {
        String sku;
        BookDatabase bookdB = new BookDatabase();
        double price = bookdB.getInStock() * 20.0;
        //System.out.println("There are "+bookdB.getInStock()+" books in stock.");
        //System.out.println("The total price at $20.00 per book is $"+price);
        Book book = new Book("Orcl1003", bookdB);
        //User this method to look through db?
        System.out.println("New book is "+ book.getDisplayText());
    }
}