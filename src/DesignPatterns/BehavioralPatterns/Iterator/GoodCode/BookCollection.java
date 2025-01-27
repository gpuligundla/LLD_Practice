package DesignPatterns.BehavioralPatterns.Iterator.GoodCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookCollection {

    private List<Book> bookList;

    public BookCollection(){
        bookList = new ArrayList<>();
    }

    public void addBook(Book book){
        bookList.add(book);
    }

    public List<Book> getBooks(){
        return bookList;
    }

    public Iterator<Book> createIterator(){
        return new BookIterator(this.bookList);
    }

    private class BookIterator implements Iterator<Book>{

        private List<Book> bookList;
        private int position = 0;

        public BookIterator(List<Book> books){
            bookList = books;
        }

        @Override
        public boolean hasNext() {
           return position < bookList.size();
        }

        @Override
        public Book next() {
            return bookList.get(position++);
        }
    }
}
