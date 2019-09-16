import java.util.ArrayList;

public class BookDatabase {
    private Book book;
    private ArrayList<Book> books;

    public BookDatabase() {
        books = new ArrayList<>();
        books.add(new Book("Java1001", "Head First Java", "Kathy Sierra and Bert Bates", "Easy to read Java workbook", 47.50, true));
        books.add(new Book("Java1002", "Thinking in Java", "Bruce Eckel", "Details about Java under the hood", 20.00, false));
        books.add(new Book("Orcl1003", "OCP: Oracle Certified Professional Java SE", "Jeanne Boyarsky", "Everything you need to know in one place", 20.19, true));
        books.add(new Book("Python1004", "Automate the Boring Stuff with Python", "Al Sweigart", "Fun with Python", 45.00, true));
        books.add(new Book("Zombie1005", "The Maker's Guide to the Zombie Apocalypse", "Simon Monk", "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi", 16.50, true));
        books.add(new Book("Rasp1006", "Raspberry Pi Projects for the Evil Genius", "Donald Norris", "A dozen fiendishly fun projects for the Raspberry Pi!", 14.75, true));
    }

    public int getInStock() {
        int count = 0;
        for (int i = 0; i < books.size(); i++) {
            book = books.get(i);
            if (book.isInStock()) {
                count++;
            }
        }
        return count;
    }

    public Book getBook(String sku) {
        boolean foundBook = false;
        for (int i = 0; i < books.size(); i++) {
            book = books.get(i);
            if (book.getSku().equalsIgnoreCase(sku)) {
                this.book = book;
                foundBook = true;
                break;
            }
        }
        if (foundBook) {
            return book;
        } else {
            return null;
        }
    }
    public ArrayList<Book> getBooks(){
        return books;
    }
    public void setBooks(ArrayList<Book> books){
        this.books = books;
    }
}

