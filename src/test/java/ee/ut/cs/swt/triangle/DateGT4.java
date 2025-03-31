package ee.ut.cs.swt.triangle;

import org.junit.Test;
import static org.junit.Assert.*;

public class DateGT4 {

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate(1824, 1824, 1824);
	    String string0 = nextDate0.run(5, 5, 1824);
	    assertEquals("5/6/1824", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate(1894, 1894, 1894);
	    String string0 = nextDate0.run(6, 1894, 1894);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(1876, 1876, 1876);
	    String string0 = nextDate0.run(9, 31, 1876);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(1876, 1876, 1876);
	    String string0 = nextDate0.run(1, 31, 1876);
	    assertEquals("2/1/1876", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate(1901, 1901, 1901);
	    String string0 = nextDate0.run(11, 30, 1901);
	    assertEquals("12/1/1901", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate(1894, 1894, 1894);
	    String string0 = nextDate0.run(6, 6, 1894);
	    assertEquals("6/7/1894", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate(1910, 1910, 1910);
	    String string0 = nextDate0.run((-1789), 1910, 1910);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate(1904, 1904, 1904);
	    String string0 = nextDate0.run(3, 3, 1904);
	    assertEquals("3/4/1904", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(1890, 1890, 1890);
	    String string0 = nextDate0.run(2, 29, 1890);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate16() throws Throwable {
	    NextDate nextDate0 = new NextDate(1901, 1901, 1901);
	    String string0 = nextDate0.run(8, 8, 1901);
	    assertEquals("8/9/1901", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate15() throws Throwable {
	    NextDate nextDate0 = new NextDate(1895, 1895, 1895);
	    String string0 = nextDate0.run(7, 7, 1895);
	    assertEquals("7/8/1895", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate18() throws Throwable {
	    NextDate nextDate0 = new NextDate(1902, 1902, 1902);
	    String string0 = nextDate0.run(4, 4, 1902);
	    assertEquals("4/5/1902", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate17() throws Throwable {
	    NextDate nextDate0 = new NextDate(1901, 1901, 1901);
	    String string0 = nextDate0.run(10, 10, 1901);
	    assertEquals("10/11/1901", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate(1892, 1892, 1892);
	    String string0 = nextDate0.run(12, 12, 1892);
	    assertEquals("12/13/1892", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate(1853, 1853, 1853);
	    String string0 = nextDate0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate(1917, 1917, 1917);
	    String string0 = nextDate0.run(2, 2, 1917);
	    assertEquals("2/3/1917", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate(1876, 1876, 1876);
	    String string0 = nextDate0.run(12, 31, 1876);
	    assertEquals("1/1/1877", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate(1896, 1896, 1896);
	    String string0 = nextDate0.run(2, 29, 1896);
	    assertEquals("3/1/1896", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate(1901, 1901, 1901);
	    String string0 = nextDate0.run(2, 30, 1901);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate(1916, 1916, 1916);
	    String string0 = nextDate0.run(2, 28, 1916);
	    assertEquals("2/29/1916", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 28, 1900);
	    assertEquals("3/1/1900", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1), (-1), (-1));
	    String string0 = nextDate0.run((-1), (-1), (-1));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 1, 1);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate(2108, 2108, 2108);
	    String string0 = nextDate0.run(2108, 2108, 2108);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NextDate nextDate0 = new NextDate(2797, 2797, 2797);
	    String string0 = nextDate0.run(2, 2, 2797);
	    assertEquals("invalid Input Date", string0);
	}

}