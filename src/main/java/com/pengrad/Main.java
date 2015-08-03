package com.pengrad;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        ipAddress(args[0]);
        port(Integer.parseInt(args[1]));

        get("/hello", (req, res) -> "Hello World");
    }
}
