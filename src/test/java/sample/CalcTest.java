package sample;

import org.junit.Test;

import junit.framework.TestCase;

public class CalcTest extends TestCase{
	@Test
	public void testSum() throws Exception {
		int input1 = 1;
		int input2 = 2;
		Calc calc = new Calc();
		int result = calc.sum(input1,  input2);
		assertEquals(3, result);
	}

}
