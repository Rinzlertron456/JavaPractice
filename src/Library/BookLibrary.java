package Library;

import java.util.ArrayList;

public class BookLibrary {
    private static ArrayList<Book> books;
    public BookLibrary() {
        books=new ArrayList<>();
    }
    public static void addBook(Book book){
        books.add(book);
    }

    public static ArrayList<Book> getBooks(){
        return books;
    }
    public static ArrayList<String> getBooksByAuthor(String author){
        ArrayList<String> authorbooks=new ArrayList<>();
        for (Book book: books){
            if(book.getAuthor().equals(author)) authorbooks.add(book.getTitle());
        }
        return authorbooks;
    }
    public static Double getTotalValue(){
        Double TotalValue=0.0d;
        for (Book book:books){
            TotalValue+=book.getPrice();
        }
        return TotalValue;
    }
}
