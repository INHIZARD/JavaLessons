package lesson2.task7;

import java.util.Arrays;
import java.util.Comparator;

public class Bookshelf {
    private final Book[] books;
    private final int count;

    Bookshelf(Book[] books){
        this.books = books;
        this.count = books.length;
    }

    public Book earliestBook() {
        Book earliest = new Book(null, null, 2024);
        for (Book b: books) {
            if (b.getDateOfWriting() < earliest.getDateOfWriting()) {
                earliest = b;
            }
        }
        return earliest;
    }

    public Book latestBook(){
        Book latest = new Book(null, null, 0);
        for (Book b: books) {
            if (b.getDateOfWriting() > latest.getDateOfWriting()) {
                latest = b;
            }
        }
        return latest;
    }

    public void sortByDate(){
        Arrays.sort(books, Comparator.comparingInt(Book::getDateOfWriting));
    }

    @Override
    public String toString() {
        return "Bookshelf{" +
                "books=" + Arrays.toString(books) +
                ", count=" + count +
                '}';
    }
}
