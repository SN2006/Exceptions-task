package app.util;

import app.exception.InputException;

public class InputValidator {

    private static final String INPUT_RELAX = "^\\d+$";

    public String validate(String input){
        if (!input.matches(INPUT_RELAX)){
            throw new InputException("You have entered invalid data!");
        }
        return input;
    }

}
