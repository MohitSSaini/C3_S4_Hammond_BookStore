/*
 * Author Name: Mohit Saini
 * Date: 26-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.bookstore;

public class Book {
    long ISBNNumber;
    String Title;
    String Description;
    double Price;
    
    private Author author;
    
    public Book ( ) {
    }
    
    public Book ( long ISBNNumber ,
                  String title ,
                  String description ,
                  double price ,
                  Author author ) {
        this.ISBNNumber = ISBNNumber;
        Title = title;
        Description = description;
        Price = price;
        this.author = author;
    }
    
    public long getISBNNumber ( ) {
        return ISBNNumber;
    }
    
    public void setISBNNumber ( long ISBNNumber ) {
        this.ISBNNumber = ISBNNumber;
    }
    
    public String getTitle ( ) {
        return Title;
    }
    
    public void setTitle ( String title ) {
        Title = title;
    }
    
    public String getDescription ( ) {
        return Description;
    }
    
    public void setDescription ( String description ) {
        Description = description;
    }
    
    public double getPrice ( ) {
        return Price;
    }
    
    public void setPrice ( double price ) {
        Price = price;
    }
    
    public Author getAuthor ( ) {
        return author;
    }
    
    public void setAuthor ( Author author ) {
        this.author = author;
    }
    
    public void displayBookDetail ( ) {
        System.out.println ( "ISBNNumber = " + ISBNNumber );
        System.out.println ( " Title = " + Title );
        System.out.println ( "Description = " + Description );
        System.out.println ( "Price = " + Price );
        System.out.println ( "Author = " + getAuthor ( ) );
        System.out.println ( "author.getAuthorName () = " + author.getAuthorName ( ) );
        System.out.println ( "author.getAuthorPenName () = " + author.getAuthorPenName ( ) );
        
    }
}
