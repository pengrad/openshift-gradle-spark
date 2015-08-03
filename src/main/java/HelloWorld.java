import static spark.Spark.*;

  public class HelloWorld {
        public static void main(String[] args) {

	    port(8080);	
//	    port(Integer.parseInt(args[0]));

            get("/hello", (req, res) -> "Hello World");
        }
    }
