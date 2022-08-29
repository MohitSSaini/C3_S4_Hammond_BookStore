/*
 * Author Name: Mohit Saini
 * Date: 26-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.bookstore;

public class Book {
    String ISBNNumber;
    String Title;
    String Description;
    double Price;
    
    public Book ( ) {
    }
    
    public Book ( String ISBNNumber , String title , String description , double price ) {
        this.ISBNNumber = ISBNNumber;
        Title = title;
        Description = description;
        Price = price;
    }
    
    public String getISBNNumber ( ) {
        return ISBNNumber;
    }
    
    public void setISBNNumber ( String ISBNNumber ) {
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
}
