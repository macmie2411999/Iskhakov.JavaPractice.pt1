package ru.mirea.lab1;

import java.util.Scanner;

public class TestBook {
    public static void main(String args[]) {
        System.out.println("Do you want to import data of book? (yes/no)");
        Scanner sc = new Scanner(System.in);
        String check = sc.nextLine();
        if (check.equals("yes")) {
            Book newBook = new Book();
            enterInformation(newBook);
            newBook.returnInformation();
        } else {
            Book newBook = new Book("Kundun", "Dailai Datma", 15000, 500, true);
            newBook.returnInformation();
        }
        sc.close();
    }

    public static void enterInformation (Book book) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name of book: ");
        book.setName(sc.nextLine());
        System.out.println("Name of author: ");
        book.setAuthor(sc.nextLine());
        System.out.println("Number of books: ");
        book.setNumberOfBooks(sc.nextInt());
        sc.nextLine();
        System.out.println("Cost: ");
        book.setCost(sc.nextInt());
        sc.nextLine();
        System.out.println("Available or not: ");
        book.setAvailable(sc.nextBoolean());
    }
}
