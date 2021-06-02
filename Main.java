/**
 * Main class
 * @author Katie Crowdle 119325941
 */

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main( final String[] args ) {
	final Title t1 = new Title ("The Hobbit", "An Unexpected Journey");
        final Title t2 = new Title ("Catcher in the Rye");
	final Author a1 = Author.JJR_Tolkien;
	final Author a2 = Author.JD_Sallinger;
	final Book b1 = new Audio(a1, t1, 1800.5 );
	final Book b2 = new Paperback( a2, t2, 100);
	final Reader r1 = new Reader( "Joe", "Soap" );
        a1.receive( 100.00 );
	a1.buy( b2 );
	r1.buy( b1 );
	r1.receive( 100.00 );
	r1.buy( b1 );
	r1.buy( b2 );
	a1.printBooksOwned( );
	a1.printBooksPublished( );
	r1.printBooksOwned( );
	System.out.print(a1 + " owns " + a1.getEarnings( ) + " Euro");

    }

}
