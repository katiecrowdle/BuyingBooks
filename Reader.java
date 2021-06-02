/**
 * Class for the Readers implements Person
 * Gets the readers first and last name
 * Has an array for the BooksOwned 
 * Earnings set to 0 euro
 * Method to print out Books Owned
 * Method to buy a book
 * Method to add books to collection
 * Method to receive money 
 * Mehtod to be charged money 
 * @author Katie Crowdle 119325941
 */

import java.util.ArrayList;

public class Reader implements Person {
    private final String firstname;
    private final String lastname;
    private final ArrayList BooksOwned = new ArrayList();
    private Double earnings = 0.00;

    public Reader ( final String firstname,
		    final String lastname) {
	this.firstname = firstname;
	this.lastname = lastname;

    }

    public String getFirst ( ) {
        return firstname;
    }

    public String getLast ( ) {
        return lastname;
    }

    public void printBooksOwned( ) {
	System.out.println(firstname + " " + lastname + " owns: " +"\n" + BooksOwned+ "\n");
    }

    public Double getEarnings ( ) {
	return earnings;
    }

    public Book buy(final Book book ) {
        if (book instanceof Book) {
            final Double price = book.getPrice();
	    if (earnings >= price) {
	        addBooksOwned(book);
		charge(price);
		final Double authorGets = ((price/100)*10);
		final Author theauthor = book.getAuthor();
		theauthor.receive(authorGets);
	    } else {
	        System.out.println("You don't have enough money to buy: "  +book);
	    }
        }
	return null;
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
