package ee.ut.cs.swt.triangle;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.Test;

public class NextDateTest {
	
	private NextDate trialDate = new NextDate(3,4,1976);

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	//@Test
	/*
	 * Test method for 'ee.ut.cs.swt.nextdate.NextDate.run(int, int, int)'
	 */

	@Test
	public final void testJuneToJuly(){
		assertEquals("7/1/2001", trialDate.run(6, 30, 2001));
	}

	@Test
	public final void testMarchToApril(){
		assertEquals("4/1/2001", trialDate.run(3, 31, 2001));
	}

	@Test
	public final void testDecemberToJanuary(){ assertEquals("Invalid Next Year", trialDate.run(12, 31, 2021)); }

	@Test
	public final void testLeapYear(){
		assertEquals("2/29/2004", trialDate.run(2, 28, 2004));
	}
	@Test
	public final void test1(){
	assertEquals("1/2/2021", trialDate.run(1, 1, 2021));
	}
	@Test
	public final void test2(){
		assertEquals("2/1/2021", trialDate.run(1, 31, 2021));
	}
	@Test
	public final void test3(){
		assertEquals("5/1/2021", trialDate.run(4, 30, 2021));
	}
	@Test
	public final void test4(){
		assertEquals("1/1/2021", trialDate.run(12, 31, 2020));
	}	@Test
	public final void test5(){
		assertEquals("3/1/2019", trialDate.run(2, 28, 2019));
	}
	@Test
	public final void test6(){
		assertEquals("3/1/2020", trialDate.run(2, 29, 2020));
	}
	@Test
	public final void test7(){
		assertEquals("3/31/2021", trialDate.run(3, 30, 2021));
	}
	@Test
	public final void test8(){
		assertEquals("2/29/2016", trialDate.run(2, 28, 2016));
	}
	@Test
	public final void test9(){
		assertEquals( "Invalid Input Date" , trialDate.run(2, 29, 2017));
	}
	@Test
	public final void test10(){
		assertEquals("invalid Next Year", trialDate.run(12, 31, 2021));
	}
	@Test
	public final void test11(){
		assertEquals("invalid Input Date", trialDate.run(0, 1, 2021));
	}
	@Test
	public final void test12(){
		assertEquals("2/29/2000", trialDate.run(2, 28, 2000));
	}
	@Test
	public final void test13(){
		assertEquals("12/30/2020", trialDate.run(12, 29, 2020));
	}
	@Test
	public final void test14(){
		assertEquals("Invalid Input Date", trialDate.run(5, 32, 2021));
	}
	@Test
	public final void test15(){
		assertEquals("Invalid Input Date", trialDate.run(12, 32, 2020));
	}


}

