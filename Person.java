/** 
 * Interface for the people reading
 * Methods will override in reader and author classes 
 * @author Katie Crowdle 119325941
 */

import java.util.ArrayList;

public interface Person {
    
    public Book buy( final Book book );

    public void printBooksOwned( );

    public Double getEarnings( );

    public Double receive(final Double value );

    public Double charge(final Double price );







}
