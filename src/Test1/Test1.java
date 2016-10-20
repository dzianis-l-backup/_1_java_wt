package Test1;

import static org.junit.Assert.*;

import org.junit.Test;

import Task1.Sin;

public class Test1 {
	@Test
	public void testStart(){
		Sin sin = new Sin();
		double res = sin.calculateMathExpression(0, 0);
		assertEquals(res,0.5,0.02);
	}
}
