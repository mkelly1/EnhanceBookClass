
public class BookApp {
    public static void main(String[] args) {
        BookDatabase bookdB = new BookDatabase();
        double price = bookdB.getInStock() * 20.0;
        System.out.println("There are "+bookdB.getInStock()+" books in stock.");
        System.out.println("The total price at $20.00 per book is $"+price);
    }
}