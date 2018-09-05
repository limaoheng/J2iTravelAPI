package au.com.itravel.iTravelAPI;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ExampleInterface a = () -> {
				// TODO Auto-generated method stub
        	System.out.println("Something is here");
        };
        
        a.showSomething();
    }
}
