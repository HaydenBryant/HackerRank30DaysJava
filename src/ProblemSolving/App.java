import java.util.*;

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

    // Declare your class here. Do not use the 'public' access modifier.
    // Declare the price inse variable
    int price;

    /**
     *   Class Constructor
     *
     *   @param title The book's title.
     *   @param author The book's author.
     *   @param price The book's price.
     **/
    // Write your constructor here
    MyBook(String title, String author, int price){
        super(title, author);
        this.price = price;
    }

    /**
     *   Method Name: display
     *
     *   Print the title, author, and price in the specified format.
     **/
    // Write your method here
    public void display(){
        System.out.println(
                "Title: " + this.title + "\n"
                        +   "Author: " + this.author + "\n"
                        +   "Price: " + this.price
        );
    }

// End class

public class Solution {