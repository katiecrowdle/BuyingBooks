/**
 * Class for the Paperback book implements Book and Printed 
 * gets the author, title and pages of the Book
 * price is set to 10 euro
 * Makes the Paperback object a string
 * @author Katie Crowdle 119325941 
 */

public class Paperback implements Book, Printed {
    private static Title title;
    private static Author author;
    private Double price = 10.00;
    private String type = "Softback";
    private int pages;

    public Paperback (final Author author,
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

    @Override
    public int getPages ( ) {
        return pages;
    }

    @Override
    public String toString ( ) {
        final String paperback;
	paperback = "\n" + "Author = " +author + ", " +"Title = " +title + ", "+ "Price = " +price + ", " + "Pages = " + pages;
	return paperback;
    }
}

