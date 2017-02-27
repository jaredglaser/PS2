package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testMyInteger {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestIsEven() {
		
		MyInteger int1 = new MyInteger(4);
		assertEquals(int1.isEven(),true);
		int1.setiValue(5);
		assertEquals(int1.isEven(),false);
		
	}
	
	@Test
	public void TestIsEvenMyInteger() {
		
		MyInteger int1 = new MyInteger(4);
		assertEquals(MyInteger.isEven(int1),true);
		int1.setiValue(5);
		assertEquals(MyInteger.isEven(int1),false);
		
	}
	@Test
	public void TestIsOdd() {
		
		MyInteger int1 = new MyInteger(4);
		assertEquals(int1.isOdd(),false);
		int1.setiValue(5);
		assertEquals(int1.isOdd(),true);
		
	}
	
	@Test
	public void TestIsOddMyInteger() {
		
		MyInteger int1 = new MyInteger(4);
		assertEquals(MyInteger.isOdd(int1),false);
		int1.setiValue(5);
		assertEquals(MyInteger.isOdd(int1),true);
		
	}
	
	@Test
	public void TestIsPrime() {
		
		MyInteger int1 = new MyInteger(12);
		assertEquals(int1.isPrime(),false);
		int1.setiValue(7);
		assertEquals(int1.isPrime(),true);
		
	}
	
	@Test
	public void TestIsPrimeMyInteger() {
		
		MyInteger int1 = new MyInteger(12);
		assertEquals(MyInteger.isPrime(int1),false);
		int1.setiValue(7);
		assertEquals(MyInteger.isPrime(int1),true);
		
	}
	
	@Test
	public void TestEquals() {
		
		MyInteger int1 = new MyInteger(12);
		assertEquals(int1.equals(12),true);
		assertEquals(int1.equals(14),false);
		
	}
	
	@Test
	public void TestEqualsMyInteger() {
		
		MyInteger int1 = new MyInteger(12);
		MyInteger int2 = new MyInteger(12);
		assertEquals(int1.equals(int2),true);
		int2.setiValue(14);
		assertEquals(int1.equals(int2),false);
		
	}
	
	
	
	
	
	

}
