package Lesson_20;

import java.util.Arrays;

public class DemoBook {
    public static void main(String[] args) {
        Book[] books = {new Book("garry", "potter"),
                new Book("dzuma", "20 let"),
                new Book("remark", "arka"),
                new Book("remark", "tri"),
                new Book("garry", "grotter")};

        printBokks(books);
        Arrays.sort(books);
        printBokks(books);


    }

    public static void printBokks(Book[] books) {
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    static void sort(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            for (int j = 1; j < books.length; j++) {
                if(books[j -1].getAuthor().compareTo(books[j].getAuthor()) > 0) {
                    Book temp = books[j];
                    books[j] = books[j-1];
                    books[j-1] = temp;
                }else if (books[j -1].getAuthor().compareTo(books[j].getAuthor()) == 0 &&
                        books[j -1].getTittle().compareTo(books[j].getTittle()) > 0) {
                    Book temp = books[j];
                    books[j] = books[j-1];
                    books[j-1] = temp;

                }

            }

        }

    }
}
