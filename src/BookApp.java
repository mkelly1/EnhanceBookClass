

public class BookApp {
    public static void main(String[] args) {
        Book myBook = new Book("Americanah","Adichie, Chimamanda","Fiction", 13.95, true);
        System.out.println(myBook.getDisplayText());
    }
}
