import java.util.Scanner;

public class Prompt {
    Scanner scan = new Scanner(System.in);

    public int numPrompt() {
        System.out.println("How many books to enter?");
        int numBooks = scan.nextInt();
        return numBooks;
    }

    public String bookPrompt(int id){
        String info = "" + id;
            System.out.println("Enter the book information. ");
            System.out.println("Title: ");
            String title = scan.nextLine();
            info = info + "," + title;
            System.out.println("Author: ");
            String author = scan.nextLine();
            info = info + "," + author;
            System.out.println("Description: ");
            String description = scan.nextLine();
            info = info + "," + description;
            System.out.println("Price: ");
            Double price = scan.nextDouble();
            info = info + "," + price;
            System.out.println("Is the book in stock? true|false ");
            String inStock = scan.next();
            info += "," + inStock;
            return info;
        }

    }




