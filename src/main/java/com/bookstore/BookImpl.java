/*
 * Author Name: Mohit Saini
 * Date: 29-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.bookstore;

public class BookImpl {
    public static void main ( String[] args ) {
        Book book = new Book ( );
        Author author = new Author ( );
        author.setAuthorName ( "Panlo Coelho" );
        author.setAuthorPenName ( "Happy" );
        book.setISBNNumber ( 39389178 );
        book.setTitle ( "The Alchemist" );
        book.setDescription ( "A Fable About Following Your Dream" );
        book.setPrice ( 350.78 );
        book.setAuthor ( author );
        book.displayBookDetail ( );
    }
}
