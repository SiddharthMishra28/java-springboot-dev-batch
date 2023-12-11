package com.java.primer;

import java.util.logging.Logger;

public class FirstClass {

    private static final Logger logger = Logger.getLogger(FirstClass.class.getSimpleName());

    public static void main(String[] args) {
        logger.info("This is my first Log statement!");
    }
}
