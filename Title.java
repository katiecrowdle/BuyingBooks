/**
 * Class for the title of the book
 * Gets the title and subtitle (if any) and makes it the full title
 * Convert the title object to a string
 * @author Katie Crowdle  119325941
 */

public class Title {
    private String title;

    public Title (final String title) {
        this.title = title;
    }

    public Title (final String title,
		  final String subtitle) {
	this.title = title + " - " + subtitle;
    }

    @Override
    public String toString( ) {
	return title;
    }


}
