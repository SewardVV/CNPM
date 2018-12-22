package myjava.mybignumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Author:  Nguyen Van Hai.
 * DesCription.
 * This class to plus two number sequences.
 * Sum function that is perform add two number sequences.
 */

public class MyBigNumber {
    private IReceiver ireceiver;
    
    public MyBigNumber(final IReceiver ireceiver) {
        this.ireceiver = ireceiver;
    }

    /**
     * To perform two sequences, we have two variable:
     * and two variable include character from '0' - '9'.
     * <br/>
     *
     * @param s1 the first string.
     * @param s2 the second string.
     * @return string which is sum of str1 and str2.
     * @throw Print a warning line to users
     */
    
    public String sum(final String s1, final String s2) {
        
        //declare variable
        String str1 = s1; //temp variable of string s1
        String str2 = s2; //temp variable of string s1
        String results = ""; //The variable is used to save the final result of two sequences.
        String step = ""; //The variable is used as the parameter for the send function in the interface.
        String msg = ""; //The variable used to save the text of the plus steps.
        int len1 = str1.length(); //The variable contains the string length str1.
        int len2 = str2.length(); //The variable contains the string length str2.
        final int maxLen = (len1 > len2) ? len1 : len2; //Take the maximum length of one of two string str1 and str2
        int index1; //Determines the position of the current character of string str1
        int index2; //Determines the position of the current character of string str2
        char c1; //The character at position 1 is considered index1 of string str1
        char c2; //The character at the index2 position of string str2
        int temp1; //digit of c1
        int temp2; //digit of c2
        int total; //temp total
        int totalNoMem; //temp total which has not remember
        int remem = 0; //remember variable
        int tempRemem = 0; //temp remember variable
        final Pattern pattern = Pattern.compile("\\D"); //Numerical sequences represent numeric characters [0-9]
        final Matcher flag1 = pattern.matcher(str1); 
        final Matcher flag2 = pattern.matcher(str2); 
        int positionError;
        
        //check two number sequences is empty or not
        // if it is null make it = '0'
        if ((str1 == null) || (str1.trim().isEmpty())) {
            str1 = "0";
        }
        if ((str2 == null) || (str2.trim().isEmpty())) {
            str2 = "0";
        }
        
        //Check whether the number is negative
        if (str1.charAt(0) == '-' && str2.charAt(0) != '-') {
        	positionError = 1;
            this.ireceiver.send("Sorry we don't support negative numbers yet : " + str1);
            throw new ExNumberFormatException(positionError 
                    + " of string " + str1 + " is not a number");
        }
        if (str2.charAt(0) == '-' && str1.charAt(0) != '-') {
        	positionError = 1;
            this.ireceiver.send("Sorry we don't support negative numbers yet : " + str2);
            throw new ExNumberFormatException(positionError 
                    + " of string " + str2 + " is not a number");
        }
        if (str2.charAt(0) == '-' && str1.charAt(0) == '-') {
        	positionError = 1;
            this.ireceiver.send("Sorry we don't support negative numbers yet : " + str1 + " and " + str2);
            throw new ExNumberFormatException(positionError 
                    + " of string " + str1 + " and " + str2 + " is not a number");
        }

        //Check whether characters are special characters or characters
        if (flag1.find()) {
            positionError = flag1.start() + 1;
            this.ireceiver.send("Please do not include any special" 
                    + " characters or characters in string : " + str1);
            throw new ExNumberFormatException(positionError 
                    + " of string " + str1 + " is not a number");
        }
        if (flag2.find()) {
            positionError = flag2.start() + 1;
            this.ireceiver.send("Please do not include any special" 
                    + " characters or characters in string : " + str2);
            throw new ExNumberFormatException(positionError 
                    + " of string " + str2 + " is not a number");
        }
        
        //Run the loop to add each number in the two sequences
        for (int i = 0; i < maxLen; i++) {
            index1 = len1 - i - 1; //Get index1 position to the right of string str1
            index2 = len2 - i - 1; //Get index2 position to the right of string str2
            c1 = (index1 >= 0) ? str1.charAt(index1) : '0';
            c2 = (index2 >= 0) ? str2.charAt(index2) : '0';
            temp1 = c1 - '0'; //Number at index1
            temp2 = c2 - '0'; //Number at index2
            tempRemem = remem;
            total = temp1 + temp2 + remem; //Temp total of two numbers at index1 + number at index2 + remember number
            totalNoMem = temp1 + temp2;
            
            //Get the number in the unit row of the multiply matched to the front of the result
            results = (total % 10) + results;
            remem = total / 10; //remember

            if (i == 0) {
                msg = "Step " + (i + 1) + " : " + temp1 + " + " + temp2 + " = " + totalNoMem + " , "
                    + " Write " + (total % 10) + " , " + " Remember " + remem + " , " + " Result " + results + "\n";
            } else {
                if (tempRemem == 0) {
                    msg = "Step " + (i + 1) + " : " + temp1 + " + " + temp2 + " = " + totalNoMem + " , " 
                        + " Write " + (total % 10) + " , " + " Remember " + remem + " , " + " Result " + results + "\n";
                } else {
                    msg = "Step " + (i + 1) + " : " + temp1 + " + " + temp2 + " + " + tempRemem + " = " + total + " , " 
                        + " Write " + (total % 10) + " , " + " Remember " + remem + " , " + "Result " + results + "\n";
                }
            }
            step = step + msg;
        }

        //End loop
        //if remember variable is not empty, add more it into before  result
        if (remem > 0) {
            String tempSre = results;
            results = remem + results;
            step = step + "Take " + remem + " forward " + tempSre + " , " + " Result: " + results + "\n";
        }
        step = "\n" + "We have " + str1 + " + " + str2 + " = " + results + "\n" + " Process implementation: \n" + step;
        this.ireceiver.send(step);

        return results;
    }
}
