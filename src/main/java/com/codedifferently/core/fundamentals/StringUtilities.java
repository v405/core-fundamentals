package com.codedifferently.core.fundamentals;


public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {

        String str1 = "Hello World";
        return str1;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){

        String returnStr = firstSegment+ secondSegment;
        return returnStr;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){

        String returnStr = firstSegment + secondSegment;
        return returnStr;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){

        String prefix = "";
        for(int i = 0; i < 3; i++){
            prefix += input.charAt(i);
        }
        return prefix;
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){

        String suffix = "";
        for(int i = input.length()-3; i < input.length(); i++){
            suffix +=input.charAt(i);
        }
        return suffix;
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){

        return inputValue.equals(comparableValue);
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue) {

        int middleCharacter = inputValue.length()/2;

        if (inputValue.length() % 2 == 0){
            return inputValue.charAt(middleCharacter-1);
        }
        return inputValue.charAt(middleCharacter);
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
        String [] strlist = spaceDelimitedString.split(" ");

        return strlist[0];
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        String [] strlist = spaceDelimitedString.split(" ");

        return strlist[1];
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){
        String reversed = "";
        for (int i = stringToReverse.length()-1; i >= 0; i--){
            reversed += stringToReverse.charAt(i);
        }
        return reversed;
    }
}
