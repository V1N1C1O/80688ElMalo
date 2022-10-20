package mx.uv.c80688;
import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App 
{
    
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        get("/hello", (req, res) -> "Hello World");
        get("/1", (req, res) -> "Hello 1");
        get("/2", (req, res) -> "Hello 2");
        get("/3", (req, res) -> "Hello 3");
    }
}
