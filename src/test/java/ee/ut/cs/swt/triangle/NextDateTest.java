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
	}
	@Test
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
		assertEquals("Invalid Next Year", trialDate.run(12, 31, 2021));
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
		assertEquals("invalid Input Date", trialDate.run(5, 32, 2021));
	}
	@Test
	public final void test15(){
		assertEquals("invalid Input Date", trialDate.run(12, 32, 2020));
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
		NextDate nextDate0 = new NextDate(1, 1, 1);
		String string0 = nextDate0.run(1, 1, 1871);
		assertEquals("1/2/1871", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
		NextDate nextDate0 = new NextDate(2, 1887, 2);
		String string0 = nextDate0.run(2, 1887, 1887);
		assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
		NextDate nextDate0 = new NextDate(11, 1860, 11);
		String string0 = nextDate0.run(11, 11, 1860);
		assertEquals("11/12/1860", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
		NextDate nextDate0 = new NextDate(5, 31, 5);
		String string0 = nextDate0.run(5, 31, 1898);
		assertEquals("6/1/1898", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
		NextDate nextDate0 = new NextDate(30, 30, 30);
		String string0 = nextDate0.run(9, 30, 1887);
		assertEquals("10/1/1887", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
		NextDate nextDate0 = new NextDate(6, 31, 6);
		String string0 = nextDate0.run(6, 31, 1872);
		assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
		NextDate nextDate0 = new NextDate(2, 29, 2);
		String string0 = nextDate0.run(2, 29, 1893);
		assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithZero() throws Throwable {
		NextDate nextDate0 = new NextDate(0, 0, 0);
		String string0 = nextDate0.run(0, 0, 0);
		assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndNegative() throws Throwable {
		NextDate nextDate0 = new NextDate((-1162), 806, (-1162));
		String string0 = nextDate0.run((-1162), 806, (-1162));
		assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
		NextDate nextDate0 = new NextDate(4, 4, 4);
		String string0 = nextDate0.run(4, 4, 4);
		assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
		NextDate nextDate0 = new NextDate(4, 4, 4);
		String string0 = nextDate0.run(4, 4, 1871);
		assertEquals("4/5/1871", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
		NextDate nextDate0 = new NextDate(527, 527, 527);
		String string0 = nextDate0.run(527, 527, 527);
		assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
		NextDate nextDate0 = new NextDate(30, 30, 30);
		String string0 = nextDate0.run(10, 30, 1887);
		assertEquals("10/31/1887", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
		NextDate nextDate0 = new NextDate(6, 6, 2063);
		String string0 = nextDate0.run(6, 2063, 2063);
		assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
		NextDate nextDate0 = new NextDate(7, 1860, 7);
		String string0 = nextDate0.run(7, 7, 1860);
		assertEquals("7/8/1860", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
		NextDate nextDate0 = new NextDate(12, 12, 12);
		String string0 = nextDate0.run(12, 12, 1862);
		assertEquals("12/13/1862", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
		NextDate nextDate0 = new NextDate(2, 28, 2);
		String string0 = nextDate0.run(2, 28, 1828);
		assertEquals("2/29/1828", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
		NextDate nextDate0 = new NextDate(2, 2, 2);
		String string0 = nextDate0.run(2, 2, 1895);
		assertEquals("2/3/1895", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
		NextDate nextDate0 = new NextDate(2, 31, 2);
		String string0 = nextDate0.run(2, 31, 1887);
		assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
		NextDate nextDate0 = new NextDate(8, 8, 8);
		String string0 = nextDate0.run(8, 8, 1872);
		assertEquals("8/9/1872", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
		NextDate nextDate0 = new NextDate(3, 3, 3);
		String string0 = nextDate0.run(3, 3, 1907);
		assertEquals("3/4/1907", string0);
	}
}

