package mybignumber;

/**
 * Author: Nguyen van Hai
 * Description: 
 * This class which to be additional two string number.
 */

public class MyBignumber{

    //private IReceiver receiver;

    //public MyBigNumber(final IReceiver receiver){
       // this.receiver = receiver;
    //}

    /**
     * @param str1 - the first string
     * @param str2 - the second string
     */
    
    public String sum(final String str1, final String str2){
        //Declare

        String result = ""; // to store result - sum of two string number
        String step = ""; //as the parameter for function send of interface
        String msg = ""; // get message
        int len1 = str1.length(); // length of string str1
        int len2 = str2.length(); // length of string str2
        int lenMax = Math.max(len1, len2); // get string which have maximum length
        int mem = 0; // to store remember number
        int local1 = 0; // store the local of string str1
        int local2 = 0; // store the local of string str2
        char c1; // character c1 that to get the end character of str1
        char c2; // character c2 that to get the end character of str2
        int total = 0; //to get sum of two the end character of two string number together

        // check each character of two string that it is a word or not
        for(int i = 0; i < len1; i++){
            //If str1 has character or word, then this function will has NumberFormatException
            if(str1.charAt(i)){
                throw new NumberFormatException("Local: " + (i + 1) + " in string " + str1 + " not a number.");
            }  
        }

        for(int i = 0; i < len2; i++){
            //if str2 has character or word, then this function will has NumberFormatException
            if(str2.charAt(i)){
                throw new NumberFormatException("Local: " + (i + 1) + " in string " + str2 + " not a number.");
            }
        }

        // check the string have a negative number or not
        if(str1.charAt(0) == "-" || str2.charAt(0) == "-"){
            throw new NumberFormatException("Not yet support the negavtive number!");
        }

        //Loop
        for(int i = 0; i <lenMax; i++){
             local1 = len1 - i - 1; // get right local of string str1
             local2 = len2 - i - 1; // get right local of string str2

             c1 = (local1 >= 0) ? str1.charAt(local1) : '0';
             c2 = (local2 >= 0) ? str2.charAt(local2) : '0';

             num1 = c1 - '0'; // the number at local1
             num2 = c2 - '0'; // the number at local2

             total = num1 + num2 + mem; // total of two number at local1 of string str1 and local2 of string str2 + remember number
             temp = num1 + num2;

             //get the unit of total to front of the result
             result = (total % 10) + result;
             mem = total / 10; //remember number

             if(i == 0){
                 msg = "Step: " + i + " : " + num1 + " + " + num2 + " = " + temp + " , " + " Remember: " + mem + " , " + " Result: " + result + "\n";
             }else{
                 msg = "Step: " + i + " : " + num1 + " + " + num2 + " + " + mem + " = " + total + " , " + " Remember: " + mem + " , " + " Result: " + result + "\n";
             }
             step = step + msg;
        }

        //end loop
        //if mem variable has a value, add more mem in result
        if(mem > 0){
            result = result + mem;
        }
        step = "\n" + str1 + " + " + str2 + " = " + result + "Process implementtation: \n\n" + step;
        this.receiver.send(step);

        return result;
    }
}