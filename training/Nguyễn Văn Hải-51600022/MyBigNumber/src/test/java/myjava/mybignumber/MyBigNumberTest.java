package myjava.mybignumber;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

/**
 * Author: Nguyễn Văn Hải
 *Descriptions:
 * MyBigNumberTest is a class used to test two number sequences
 * that we see if it meets the requirements of the customer or not
 *By that we will know where our code is wrong and where to overcome it to overcome it
 */

public class MyBigNumberTest implements IReceiver {

	public static int i = 0;
	public static ArrayList<String> listcase = new ArrayList<String>();
	
	@Test
	void testSum_case1() { //Trường hợp cộng 2 số có độ dài chuỗi số là bằng nhau nhưng số là nhỏ
		listcase.add("Trường hợp cộng 2 số có độ dài chuỗi số là bằng nhau nhưng số là nhỏ ( 123 + 987)");
		try {
		    MyBigNumberTest myclass = new MyBigNumberTest();
		    MyBigNumber mybignumber = new MyBigNumber(myclass);
		    String sum = mybignumber.sum("123", "987");
		    assertEquals("1110", sum);
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case2() { //Trường hợp cộng 2 số có độ dài chuỗi số là bằng nhau nhưng số là lớn
		listcase.add("Trường hợp cộng 2 số có độ dài chuỗi số là bằng nhau nhưng số là lớn ( 144232424234 + 987242342432 )");
		try {
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("144232424234", "987242342432");
			assertEquals("1131474766666", sum);
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case3() { //Trường hợp cộng 2 số có độ dài chuỗi 1 ngắn hơn độ dài chuỗi 2 nhưng số là nhỏ
		listcase.add("Trường hợp cộng 2 số có độ dài chuỗi 1 ngắn hơn độ dài chuỗi 2 nhưng số là nhỏ ( 12 + 987)");
		try {
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("12", "987");
			assertEquals("999", sum);
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case4() { //Trường hợp cộng 2 số có độ dài chuỗi 1 ngắn hơn độ dài chuỗi 2 nhưng số là lớn
		listcase.add("Trường hợp cộng 2 số có độ dài chuỗi 1 ngắn hơn độ dài chuỗi 2 nhưng số là lớn ( 122342 + 9834243242342424 )");
		try {
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("122342", "9834243242342424");
			assertEquals("9834243242464766", sum);
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case5() { //Trường hợp cộng 2 số có độ dài chuỗi 2 ngắn hơn độ dài chuỗi 1 nhưng số là nhỏ
		listcase.add("Trường hợp cộng 2 số có độ dài chuỗi 2 ngắn hơn độ dài chuỗi 1 nhưng số là nhỏ( 123 + 98 )");
		try {
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("123", "98");
			assertEquals("221", sum);
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case6() { //Trường hợp cộng 2 số có độ dài chuỗi 2 ngắn hơn độ dài chuỗi 1 nhưng số là lớn
		listcase.add("Trường hợp cộng 2 số có độ dài chuỗi 2 ngắn hơn độ dài chuỗi 1 nhưng số là lớn ( 6645646456565 + 656565445 )");
		try {
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("6645646456565", "656565445");
			assertEquals("6646303022010", sum);
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
    
	@Test
	void testSum_case7() { //Trường hợp cộng 2 chuoi so la null
		listcase.add("Trường hợp cộng 2 chuoi so la null ( null + null )");
		try {
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("", "");
			assertEquals("", sum);
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case8() { //Trường hợp cộng so 1 la null va so 2 la 453453
		listcase.add("Trường hợp cộng so 1 la null va so 2 la 453453 ( null + 453453 )");
		try {
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("", "453453");
			assertEquals("453453", sum);
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case9() { //Trường hợp cộng so 2 la null va so 1 la 453453
		listcase.add("Trường hợp cộng so 2 la null va so 1 la 453453 ( 453453 + null )");
		try {
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("", "453453");
			assertEquals("453453", sum);
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case10() { //Trường hợp cộng so 2 la "0" va so "0"
		listcase.add("Trường hợp cộng so 2 la ( 0 + 0 )");
		try {
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("0", "0");
			assertEquals("0", sum);
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case11() { //Trường hợp cộng so 2 la 0 va null
		listcase.add("Trường hợp cộng so 2 la ( 0 + null )");
		try {
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("0", "");
			assertEquals("", sum);
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Override
	public void send(String msg) {
		// TODO Auto-generated method stub
		System.out.println("\n\n");
	    System.out.println("Case: " + (i+1) + " - " + listcase.get(i) + "\n" + msg);
		i++;
	}
}
