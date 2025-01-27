package DesignPatterns.BehavioralPatterns.Iterator.GoodCode;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("java"));
        bookCollection.addBook(new Book("python"));
        bookCollection.addBook(new Book("CPP"));

        Iterator<Book> bookIterator = bookCollection.createIterator();

        while (bookIterator.hasNext()){
            Book book = bookIterator.next();
            System.out.println("The book is "+ book.getName());
        }
    }
}
/*
If you see here we have defined the iterator logic as private class inside bookscollection and we have added a public
method to create the object for this private iterator i.e createIterator here.

now in the client code, we have created a iterator object and acess all the items in the list.

even now let say we need to change the datastructure of the books collection from list to set. we only change the library
code and client code still works without any issue.

In java, we have inbuilt iterable interaface which has a standard method called iterable instead of createIterable which
we defined. also we no need to write our own custom iterable private class  unless custom logic is needed. java collections
objects return the iterable object.
 */