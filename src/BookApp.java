
public class BookApp {
    public static void main(String[] args) {
        BookDatabase bookdB = new BookDatabase();
        double price = bookdB.getLength() * 20.0;
        System.out.println("There are "+bookdB.getLength()+" books.");
        System.out.println("The total price at $20.00 per book is $"+price);
    }
}