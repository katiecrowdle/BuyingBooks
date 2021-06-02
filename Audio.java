/**
 * Class for the Audio Books implements book
 * Gets the title, author and duration of the book
 * Price is set to 15 euro
 * Makes the audio object a string
 * @author Katie Crowdle 119325941
 */

public class Audio implements Book {
    private static Title title;
    private static Author author;
    private Double price = 15.00;
    private String type = "Audiobook";
    private Double duration;

    public Audio ( final Author author,
		   final Title title,
		   final Double duration) {
	this.title = title;
	this.author = author;
        this.price = price;
	this.duration = duration;
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

    public Double getDuration ( ) {
        return duration;
    }

    public String getType( ) {
	return type;
    }

    @Override 
    public String toString( ) {
	final String audio;
        audio ="\n" + "Author = " + author + ", " + "Title = " +title +", "+ "Price = " + price +", " +"Duration = " +duration ;
	return audio;
    }
}
