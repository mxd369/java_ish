package edu.uga.cs1302.test;

/*
 * TODO:
 * add test cases for
 * 	MyString() check initsize
 * 	MyString(char ch)
 *	MyString(MyString otherString)  null check
  *	MyString(MyString otherString)
 */

import org.junit.*;

import edu.uga.cs1302.muttxt.MyString;
import edu.uga.cs1302.muttxt.MyStringIndexOutOfBoundsException;

import static org.junit.Assert.*;


/**
 *
 * @author Mehdi
 */
public class PMyStringTest{
    
    private MyString [] str = new MyString[5];

    public PMyStringTest() {
    }

    
	@Before
    public void setUp() {
		for(int i=0; i<5; i++)
			str[i] = new MyString();
			
		//str[0] = MyString representing "ABCD"
		for (int i=0; i<4; i++)
			str[0].setAt(str[0].myLength(), (char)(i+'A'));
			
		//str[1] = MyString representing "ABCD"
        for (int i=0; i<4; i++)
			str[1].setAt(str[1].myLength(), (char)(i+'A'));
			
		//str[2] = MyString representing "ABCDEFG"	
		for (int i=0; i<7; i++)
			str[2].setAt(str[2].myLength(), (char)(i+'A')); 
			
		//str[3] = MyString representing "ABCDEFGHIJKLMNOP"
		for (int i=4; i<16; i++)
			str[3].setAt(str[3].myLength(), (char)(i+'A'));
			
		//str[3] = MyString representing "ABCDEFGHIJKLMNOP"
		for (int i=0; i<16; i++)
			str[4].setAt(str[4].myLength(), (char)(i+'A'));
		
    }


	@After
    public void tearDown() {
		for(int i=0; i<5; i++)
			str[i] = null;
    }

    /**
     * Test of constructors, of class MyString.
     */
	@Test
    public void MyStringZero() {
        System.out.println("Zero parameter constructor.");
        MyString instance = new MyString();
        assertTrue(instance != null);
    }

	@Test
    public void MyStringChar() {
        System.out.println("Char constructor.");
        MyString instance = new MyString('Z');
        char expResult = 'Z';
        assertEquals(expResult, instance.myCharAt(0));
		assertEquals(1, instance.myLength());
    }
	
	@Test(expected=IllegalArgumentException.class)
	public void MyStringCopyNull() {
        System.out.println("Copy constructor NULL check.");
		MyString instance = new MyString(null);
    }
	
	@Test
	public void MyStringCopy() {
        System.out.println("Copy constructor.");
        MyString instance = new MyString(str[4]);
		assertTrue(instance.equals(str[4]));
    }


	/**
     * Test of equals method, of class MyString.
     */
   
	@Test
    public void equalsNull() {
        System.out.println("equals NULL check");
        Object o = null;
        MyString instance = new MyString();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
    }
	
	@Test
	public void equalsRef() {
        System.out.println("equals wrong REF type check");
        Object o = new Object();
        MyString instance = new MyString();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
    }

	/**  the first 4 characters of str[2] are the same as str[0], but str[2] is longer than 4 chars*/
	@Test
	public void equalsLen() {
        System.out.println("equals Length check");
        boolean expResult = false;
        boolean result = str[0].equals(str[2]);
        assertEquals(expResult, result);
    }
	
	@Test
	public void equals() {
        System.out.println("equals");
        boolean expResult = true;
        boolean result = str[0].equals(str[1]);
        assertEquals(expResult, result);
    }
	
	
    /**
     * Test of myCharAt method, of class MyString.
     */
	@Test(expected=MyStringIndexOutOfBoundsException.class)
	public void myCharAtLowIdx() {
		System.out.println("myCharAt Lower limit check");
		char result = str[0].myCharAt(-1);
	}
	
	@Test(expected=MyStringIndexOutOfBoundsException.class)
	public void myCharAtUpIdx() {
		System.out.println("myCharAt Upper limit check");
        char result = str[0].myCharAt(4);
	}
	
	@Test
    public void myCharAt() {
        System.out.println("myCharAt");
        int index = 5;
        char expResult = 'F';
        char result = str[2].myCharAt(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of myConcat method, of class MyString.
     */
    
	@Test(expected=IllegalArgumentException.class)
    public void myConcatNull() {
        System.out.println("myConcat Null ckeck");
        MyString otherMyString = null;
		MyString result = str[0].myConcat(otherMyString);
    }

	@Test
	public void myConcatEmpty() {
        System.out.println("myConcat Empty MyString check");
        MyString otherMyString = new MyString();
        MyString expResult = str[0];
        MyString result = str[0].myConcat(otherMyString);
        assertTrue(expResult == result); //the references should be the same (no need to use the equals method, see project description for more info)
    }
	
	@Test
	public void myConcat() {
        System.out.println("myConcat");
        MyString result = str[1].myConcat(str[3]);
        assertTrue(result.equals(str[4]));
    }



    /**
     * Test of myIndexOf method, of class MyString.
     */
    
	@Test
    public void myIndexOfNotExists() {
        System.out.println("myIndexOf Not Exists check");
        char ch = ' ';
        int expResult = -1;
        int result = str[4].myIndexOf(ch);
        assertEquals(expResult, result);
    }
	
	@Test
	public void myIndexOf() {
        System.out.println("myIndexOf");
        char ch = 'P';
        int expResult = 15;
        int result = str[4].myIndexOf(ch);
        assertEquals(expResult, result);
    }

    /**
     * Test of myLength method, of class MyString.
     */
    
	@Test
    public void myLengthEmpty() {
        System.out.println("myLength Empty check");
        MyString instance = new MyString();
        int expResult = 0;
        int result = instance.myLength();
        assertEquals(expResult, result);
    }
	
	@Test
	public void myLength() 
	{
        System.out.println("myLength");
        int expResult = 7;
        int result = str[2].myLength();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAt method, of class MyString.
     */
    
	@Test(expected=MyStringIndexOutOfBoundsException.class)
    public void setAtUpIndex() {
        System.out.println("setAt Upper limit check");
        int index = 9;
        char ch = 'Z';
        str[2].setAt(index, ch);
        		
		index = 40;
		str[2].setAt(index, ch);
    }

	@Test(expected=MyStringIndexOutOfBoundsException.class)
	public void setAtLowIndex() {
        System.out.println("setAt Lower limit check");
        int index = -2;
        char ch = 'Z';
        str[2].setAt(index, ch);
    }
	
	@Test
	public void setAtAppend() {
        System.out.println("setAt Append check");
		int index = 7;
        char ch = 'Z';
		str[2].setAt(index, ch);
		assertEquals(str[2].myLength(), 8);
		assertEquals(str[2].myCharAt(index), ch);
    }
	
	@Test
    public void setAt() {
		System.out.println("setAt within the range");
        int index = 5;
        char ch = 'Z';
		str[2].setAt(index, ch);
        assertEquals(ch, str[2].myCharAt(index));
    }

    /**
     * Test of mySubString method, of class MyString.
     */
    
	@Test(expected=MyStringIndexOutOfBoundsException.class)
    public void mySubStringHighLessThanLow() {
        System.out.println("mySubString high < low check");
        int low = 4;
        int high = 2;
        str[2].mySubString(low, high);
    }

	@Test
    public void mySubStringHighNegative() {
        System.out.println("mySubString high Negative check");
        int low = -2;
        int high = -1;
        try{
			str[2].mySubString(low, high);
			fail("Does not throw an IndexOutOfBoundsException");
        } catch(IndexOutOfBoundsException e){
            assertTrue(true);
        }
    }

	@Test
    public void mySubStringLowNegative() {
        System.out.println("mySubString low Negative check");
        int low = -2;
        int high = 4;
        try{
			str[2].mySubString(low, high);
			fail("Does not throw an IndexOutOfBoundsException");
        } catch(IndexOutOfBoundsException e){
            assertTrue(true);
        }
    }
	
	@Test
    public void mySubStringHighGreaterThanLength() {
        System.out.println("mySubString high > length check");
        int low = 4;
        int high = 8;
        try{
			str[2].mySubString(low, high);
			fail("Does not throw an IndexOutOfBoundsException");
        } catch(IndexOutOfBoundsException e){
            assertTrue(true);
        }
    }

	@Test
    public void mySubStringEmpty() {
        System.out.println("mySubString Empty check");
        int low = 0;
        int high = 0;
        MyString instance = new MyString();
        MyString result = instance.mySubString(low, high);
        assertTrue(result.equals(instance));
    }
	@Test
    public void mySubStringHighEqualLow() {
        System.out.println("mySubString high == low check");
        int low = 2;
        int high = 2;
        MyString result = str[2].mySubString(low, high);
		MyString expResult = new MyString();
        assertTrue(result.equals(expResult));

    }
	
	@Test
    public void mySubString() {
        System.out.println("mySubString");
        int low = 4;
        int high = 16;
        MyString result = str[4].mySubString(low, high);
        assertTrue(result.equals(str[3]));
    }
	
	@Test
	public void myToCharArray(){
		System.out.println("myToCharArray");
        char[] result = str[0].myToCharArray();
        char[] expected = {'A','B','C','D'};
		assertArrayEquals(expected, result);
    }
	
	/**
     * Test of myLineDisplay method, of class MyString.
     */
    
	@Test
    public void myLineDisplay() {
        System.out.println("myLineDisplay the following two lines should read the same:\nABCDEFGHIJKLMNOP");
        str[4].myLineDisplay();
        assertTrue(true);
    }
	
	public static void main(String[] args) {
		org.junit.runner.JUnitCore.main("PMyStringTest");
	}
}
