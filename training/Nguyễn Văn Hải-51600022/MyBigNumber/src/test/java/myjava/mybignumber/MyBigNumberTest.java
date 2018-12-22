package myjava.mybignumber;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import myjava.mybignumber.ExNumberFormatException;

/**
 * Author: Nguyen Van Hai
 *Descriptions:
 * MyBigNumberTest is a class used to test two number sequences
 * that we see if it meets the requirements of the customer or not
 *By that we will know where our code is wrong and where to overcome it to overcome it
 */

public class MyBigNumberTest implements IReceiver {

	public static int i = 0;
	public static ArrayList<String> listcase = new ArrayList<String>();
	
	@Test
	void testSum_case1() {
		listcase.add("Case: ( 123 + 987 )");
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("123", "987");
		assertEquals("1110", sum);
	}
	
	@Test
	void testSum_case2() {
		listcase.add("Case: ( 144232424234 + 987242342432)");
        MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("144232424234", "987242342432");
		assertEquals("1131474766666", sum);
	}
	
	@Test
	void testSum_case3() {
		listcase.add("Case: ( 12 + 987)");
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("12", "987");
		assertEquals("999", sum);
	}
	
	@Test
	void testSum_case4() {
		listcase.add("Case: ( 122342 + 9834243242342424)");
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("122342", "9834243242342424");
		assertEquals("9834243242464766", sum);
	}
	
	@Test
	void testSum_case5() {
		listcase.add("Case: ( 123 + 98)");
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("123", "98");
		assertEquals("221", sum);
	}
	
	@Test
	void testSum_case6() {
		listcase.add("Case: ( 6645646456565 + 656565445)");
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("6645646456565", "656565445");
		assertEquals("6646303022010", sum);
	}
    
	@Test
	void testSum_case7() {
		listcase.add("Case: ( null + null)");
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("", "");
		assertEquals("", sum);
	}
	
	@Test
	void testSum_case8() {
		listcase.add("Case: ( null + 453453)");
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("", "453453");
		assertEquals("453453", sum);
	}
	
	@Test
	void testSum_case9() {
		listcase.add("Case: ( 453453 + null)");
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("453453", "");
		assertEquals("453453", sum);
	}
	
	@Test
	void testSum_case10() {
		listcase.add("Case: ( 0 + 0)");
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("0", "0");
		assertEquals("0", sum);
	}
	
	@Test
	void testSum_case11() {
		listcase.add("Case: ( 0 + null)");
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("0", "");
		assertEquals("0", sum);
	}
	
	@Test
	void testSum_case12() {
		listcase.add("Case: ( 343d + 987)");
		try {
		    MyBigNumberTest myclass = new MyBigNumberTest();
		    MyBigNumber mybignumber = new MyBigNumber(myclass);
		    String sum = mybignumber.sum("343d", "987");
		}catch(ExNumberFormatException ex) {
			assertEquals("Error location at: 4 of string 343d is not a number", ex.getErrorPos());
		}
	}
	
	@Test
	void testSum_case13() {
		listcase.add("Case: ( 34$$3 + 987)");
		try {
		    MyBigNumberTest myclass = new MyBigNumberTest();
		    MyBigNumber mybignumber = new MyBigNumber(myclass);
		    String sum = mybignumber.sum("34$$3", "987");
		}catch(ExNumberFormatException ex) {
			assertEquals("Error location at: 3 of string 34$$3 is not a number", ex.getErrorPos());
		}
	}
	
	@Test
	void testSum_case14() {
		listcase.add("Case: ( 343 + 98*77)");
		try {
		    MyBigNumberTest myclass = new MyBigNumberTest();
		    MyBigNumber mybignumber = new MyBigNumber(myclass);
		    String sum = mybignumber.sum("343", "98*77");
		}catch(ExNumberFormatException ex) {
			assertEquals("Error location at: 3 of string 98*77 is not a number", ex.getErrorPos());
		}
	}
	
	@Test
	void testSum_case15() {
		listcase.add("Case: ( -343 + 987)");
		try {
		    MyBigNumberTest myclass = new MyBigNumberTest();
		    MyBigNumber mybignumber = new MyBigNumber(myclass);
		    String sum = mybignumber.sum("-343", "987");
		}catch(ExNumberFormatException ex) {
			assertEquals("Error location at: 1 of string -343 is not a number", ex.getErrorPos());
		}
	}
	
	@Test
	void testSum_case16() {
		listcase.add("Case: ( 343 + -987)");
		try {
		    MyBigNumberTest myclass = new MyBigNumberTest();
		    MyBigNumber mybignumber = new MyBigNumber(myclass);
		    String sum = mybignumber.sum("343", "-987");
		}catch(ExNumberFormatException ex) {
			assertEquals("Error location at: 1 of string -987 is not a number", ex.getErrorPos());
		}
	}
	
	@Test
	void testSum_case17() {
		listcase.add("Case: ( 34$$3 + 98$$7)");
		try {
		    MyBigNumberTest myclass = new MyBigNumberTest();
		    MyBigNumber mybignumber = new MyBigNumber(myclass);
		    String sum = mybignumber.sum("34$$3", "98$$7");
		}catch(ExNumberFormatException ex) {
			assertEquals("Error location at: 3 of string 34$$3 is not a number", ex.getErrorPos());
		}
	}
	
	@Test
	void testSum_case18() {
		listcase.add("Case: ( 3dewsd43 + 98se7)");
		try {
		    MyBigNumberTest myclass = new MyBigNumberTest();
		    MyBigNumber mybignumber = new MyBigNumber(myclass);
		    String sum = mybignumber.sum("3dewsd43", "98se7");
		}catch(ExNumberFormatException ex) {
			assertEquals("Error location at: 2 of string 3dewsd43 is not a number", ex.getErrorPos());
		}
	}
	
	@Test
	void testSum_case19() {
		listcase.add("Case: ( 3dew$$sd43 + 98se7)");
		try {
		    MyBigNumberTest myclass = new MyBigNumberTest();
		    MyBigNumber mybignumber = new MyBigNumber(myclass);
		    String sum = mybignumber.sum("3dew$$sd43", "98se7");
		}catch(ExNumberFormatException ex) {
			assertEquals("Error location at: 2 of string 3dew$$sd43 is not a number", ex.getErrorPos());
		}
	}
	
	@Test
	void testSum_case20() {
		listcase.add("Case: ( 3dewsd43 + 98s*&^^e7)");
		try {
		    MyBigNumberTest myclass = new MyBigNumberTest();
		    MyBigNumber mybignumber = new MyBigNumber(myclass);
		    String sum = mybignumber.sum("3dewsd43", "98s*&^^e7");
		}catch(ExNumberFormatException ex) {
			assertEquals("Error location at: 2 of string 3dewsd43 is not a number", ex.getErrorPos());
		}
	}
	
	@Test
	void testSum_case21() {
		listcase.add("Case: ( -3dewsd43 + 98s*&^^e7)");
		try {
		    MyBigNumberTest myclass = new MyBigNumberTest();
		    MyBigNumber mybignumber = new MyBigNumber(myclass);
		    String sum = mybignumber.sum("-3dewsd43", "98s*&^^e7");
		}catch(ExNumberFormatException ex) {
			assertEquals("Error location at: 1 of string -3dewsd43 is not a number", ex.getErrorPos());
		}
	}
	
	@Test
	void testSum_case22() {
		listcase.add("Case: ( 3dewsd43 + -98s*&^^e7)");
		try {
		    MyBigNumberTest myclass = new MyBigNumberTest();
		    MyBigNumber mybignumber = new MyBigNumber(myclass);
		    String sum = mybignumber.sum("3dewsd43", "-98s*&^^e7");
		}catch(ExNumberFormatException ex) {
			assertEquals("Error location at: 1 of string -98s*&^^e7 is not a number", ex.getErrorPos());
		}
	}
	
	@Test
	void testSum_case23() {
		listcase.add("Case: ( adadasd + dasda)");
		try {
		    MyBigNumberTest myclass = new MyBigNumberTest();
		    MyBigNumber mybignumber = new MyBigNumber(myclass);
		    String sum = mybignumber.sum("adadasd", "dasda");
		}catch(ExNumberFormatException ex) {
			assertEquals("Error location at: 1 of string adadasd is not a number", ex.getErrorPos());
		}
	}
	
	@Test
	void testSum_case24() {
		listcase.add("Case: ( &%&^% + &*%^&^%)");
		try {
		    MyBigNumberTest myclass = new MyBigNumberTest();
		    MyBigNumber mybignumber = new MyBigNumber(myclass);
		    String sum = mybignumber.sum("&%&^%", "&*%^&^%");
		}catch(ExNumberFormatException ex) {
			assertEquals("Error location at: 1 of string &%&^% is not a number", ex.getErrorPos());
		}
	}
	
	@Test
	void testSum_case25() {
		listcase.add("Case: ( -343 + -3434)");
		try {
		    MyBigNumberTest myclass = new MyBigNumberTest();
		    MyBigNumber mybignumber = new MyBigNumber(myclass);
		    String sum = mybignumber.sum("-343", "-3434");
		}catch(ExNumberFormatException ex) {
			assertEquals("Error location at: 1 of string -343 and -3434 is not a number", ex.getErrorPos());
		}
	}
	
	@Override
	public void send(String msg) {
		// TODO Auto-generated method stub
		System.out.println("\n");
	    System.out.println(listcase.get(i) + msg);
	    i++;
	}
}
