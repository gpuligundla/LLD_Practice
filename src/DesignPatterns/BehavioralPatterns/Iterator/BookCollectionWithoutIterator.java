package DesignPatterns.BehavioralPatterns.Iterator;

import java.util.ArrayList;
import java.util.List;

class Book{
    private String name;
    public Book(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}

class BookCollection {
    private List<Book> books;

    public BookCollection(){
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> getBooks(){
        return books;
    }
}

public class BookCollectionWithoutIterator{
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("Java"));
        bookCollection.addBook(new Book("CPP"));
        bookCollection.addBook(new Book("Python"));


        for(int i = 0; i < bookCollection.getBooks().size(); i++){
            System.out.println(bookCollection.getBooks().get(i));
        }

    }

}

/*
If you see here we are maintain a books collection using the list datatype. all the logic in the main class is
tightly coupled with it. if we change it from list to set it needs modification in all other places.

To solve this we can use the iterator design pattern.
 */