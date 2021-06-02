/**
 * Class for the hardback books implements Printed and Book
 * Gets the title of the book, the author and pagesand has 
 * price set to 12 euro
 * Makes the hardback object a string
 *@author Katie Crowdle 119325941
 */


import java.util.ArrayList;

public class Hardback implements Printed, Book {
    private static Title title;
    private static Author author;
    private Double price = 12.00;
    private String type = "Hardback";
    private int pages;


    public Hardback (final Author author,
		     final Title title,
		     final int pages ) {
	this.title = title;
	this.author = author;
        this.price = price;
	this.type = type;
	this.pages = pages;

    }
    @Override
    public Title getTitle ( ) { 
        return title;
    }
    @Override
    public Author getAuthor ( ) {
        return author;
    }
    @Override
    public Double getPrice ( ) {
        return price;
    }
    
    public String getType( ) {
	return type;
    }

    @Override
    public int getPages ( ) {
        return pages;
    }

    @Override 
    public String toString ( ) {
	final String hardback 
        hardback = "\n" +"Author = " + author + "," +"Title = "+ title + ", "+ "Price = " + price + ", " + " Pages = " + pages;
	return hardback;



}
