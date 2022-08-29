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
}
