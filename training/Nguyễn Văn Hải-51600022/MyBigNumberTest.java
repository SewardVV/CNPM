package mybignumber;

import mybignumber.IReceiver;
import mybignumber.MyBignumber;

/**
 * Author: Nguyen Van Hai
 */

 public class MyBigNumberTest implements IReceiver{
     public static void main(String[] args){
        MyBigNumberTest test = new MyBigNumberTest();
        MyBignumber myBigNumber = new MyBignumber(test);
        String sum = myBigNumber.sum("13331", "379");

        System.out.println("Final step: " + sum);
     }

     public void send(String msg){
         System.out.print(msg);
     }
 }