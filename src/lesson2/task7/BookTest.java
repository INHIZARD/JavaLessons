package lesson2.task7;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("Pushkin", "Tales", 1800);
        Book book2 = new Book("Lermontov", "Animals", 1777);
        Book book3 = new Book("Pupin", "BeBetter", 2001);

        Bookshelf bookshelf = new Bookshelf(new Book[] {book1, book2, book3});

        System.out.printf("Самая ранняя книжка на полке: %s\n", bookshelf.earliestBook());
        System.out.printf("Самая поздняя книжка на полке: %s\n", bookshelf.latestBook());
        bookshelf.sortByDate();
        System.out.printf("Отсортированные книжки на полке: %s\n", bookshelf);
    }
}
