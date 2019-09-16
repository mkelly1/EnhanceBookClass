import java.util.ArrayList;

public class BookDatabase {
    private Book book;
    private ArrayList<Book> books;

    public BookDatabase(){
        books = new ArrayList<>();
        books.add(new Book("Americanah","Adichie, Chimamanda","Fiction", 13.95, true));
        books.add(new Book("Giovanni's Room", "Baldwin, James", "Fiction", 11.55, false));
        books.add(new Book("Technical Difficulties", "Jordan, June", "Essays", 20.19, true));
        books.add(new Book("Core Java", "Hortsman, Cary", "Textbook", 40.95, true));
        books.add(new Book("Who Fears Death", "Okorafor, Nnedi", "SciFi", 15.35, true));
    }
    public int getLength(){
        return books.size();
    }
}
