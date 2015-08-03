package com.pengrad;

import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {

        ipAddress(args[0]);
//	    port(8080);	
        port(Integer.parseInt(args[1]));

        get("/hello", (req, res) -> "Hello World");
    }

    public class Event {

        public final String packageName;
        public final long duration;
        public final long time;

        public Event(String packageName, long duration, long time) {
            this.packageName = packageName;
            this.duration = duration;
            this.time = time;
        }

        public Event(String packageName, long duration) {
            this(packageName, duration, 0);
        }

        @Override
        public String toString() {
            return packageName + " " + duration / 1000;
        }
    }
}
