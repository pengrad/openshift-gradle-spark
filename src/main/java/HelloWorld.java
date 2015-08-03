import static spark.Spark.*;

  public class HelloWorld {
        public static void main(String[] args) {

	    ipAddress(args[0]);
//	    port(8080);	
	    port(Integer.parseInt(args[1]));

            get("/hello", (req, res) -> "Hello World");
        }
    }
