package com.cydeo.tests.day11_Actions_JS_Executor;

public class CustomException extends Exception{

    public CustomException () {

    }

    public CustomException (String message) {
        super (message);
    }

    public CustomException (Throwable cause) {
        super (cause);
    }

    public CustomException (String message, Throwable cause) {
        super (message, cause);
    }
/*
    public void isOnScreen() {
        try {
            if (word.contains(" ")) {
                throw new WordContainsException();
            }
        } catch (WordContainsException ex) {
            // Process message however you would like
        }
    }

 */
}




