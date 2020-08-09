package kop.edu;

import java.util.logging.Logger;

/**
 * Classname: PalindromeService
 *
 * @author Kopach Daria
 * <p>
 * Palindrome Task
 * @version 09.08.2020
 */

public class PalindromeService {

    // String for check
    private String str;

    // regex for cleaning the text
    private static final String regex = "[^a-zA-Z]";

    // Logger

    private static final Logger LOGGER =
            Logger.getLogger(PalindromeService.class.getName());

    /**
     * Constructor with parameter
     *
     * @param str String to check
     */

    public PalindromeService(String str) {
        this.str = str;
    }

    // Empty constructor

    public PalindromeService() {
    }

    public static boolean isValid(String str) {
        return new PalindromeService(str).isValid();
    }

    // Generate getter and setter

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    // method to change a string to a low case

    private void toLowerCase() {
        LOGGER.info("LOWER_CASE_METHOD");
        this.setStr(this.str.toLowerCase());
    }

    // method to remove all spaces
    private void regexReplace() {
        LOGGER.info("REGEX_REPLACE_METHOD");
        this.setStr(this.str.replaceAll(regex, ""));
    }

    /**
     * Method to invert string
     *
     * @return inverted string
     */
    private String getReversed() {
        LOGGER.info("GET_RESERVED_METHOD");
        return new StringBuilder(this.getStr()).reverse().toString();
    }

    /*
     * static method
     *
     * @return if palindrome
     */
    public boolean isValid() {
        toLowerCase();
        regexReplace();
        return this.getStr().equals(this.getReversed());
    }
}


