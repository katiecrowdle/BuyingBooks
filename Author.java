/**
 * Enum class for the Author implements Person
 * array for published books
 * array for booksowned
 * Method to get published books
 * Method to print published books
 * Method to print books owned
 * Method to buy books
 * Method to add books to collection
 * Method to receive money
 * Method to be charged a price
 *@author Katie Crowdle 119325941
 */

import java.util.ArrayList;

public enum Author implements Person {
    JJR_Tolkien, JD_Sallinger;

    private final ArrayList published = new ArrayList( );
    private final ArrayList BooksOwned = new ArrayList( );
    private Double earnings = 0.00;

    private Author ( ) {
	this.earnings = earnings;
    }

    public ArrayList getPublished (Book book) {
	published.add(book);
	return published;
    }

    public void printBooksPublished ( ) {
	System.out.println(name( ) +" published: "+ "\n" +published+ "\n");
    }

    public void printBooksOwned ( ) {
	System.out.println(name() +" owns: " +"\n" + BooksOwned+ "\n");
    }
    
    public Double getEarnings ( ) {
	return earnings;
    }

    public Book buy( Book book ) {
        if (book instanceof Book) {
	    final Double price = book.getPrice();
	    if (earnings >= price) {
	        addBooksOwned(book);
	        getPublished(book);
	        charge(price);
	    } else {
	        System.out.println("You don't have enough money to buy:" +book);
            }
	}
	return book;
    }

    public void addBooksOwned(final Book book) {
	BooksOwned.add(book);
    }

    public Double receive(final Double value) { 
        earnings = earnings + value;
	return earnings;
    }

    public Double charge(final Double price) {
	earnings = earnings - price;
	return earnings;
    }
   
}
	    
