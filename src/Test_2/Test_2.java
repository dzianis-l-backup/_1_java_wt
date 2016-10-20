package Test_2;

import static org.junit.Assert.*;


import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.*;

import Task2.Algorithm;
import Task2.Point;

public class Test_2 {
	
	
	
	@Test
	public void testStart() {
		Algorithm alg = new Algorithm();
		
	    assertTrue( alg.run(0, 0));
	    assertTrue( alg.run(-4, 5));
	    assertTrue( alg.run(4, 5));
	    assertTrue( alg.run(4, 0));
	    assertTrue( alg.run(6, 0));
	    assertTrue( alg.run(6, -3));
	    assertTrue( alg.run(-6, -3));
	    assertTrue( alg.run(-6, 0));
	    assertTrue( alg.run(-4, 0));
	    assertTrue( alg.run(1, 0));
	    
	    assertFalse( alg.run(5, 5));
	    assertEquals( alg.run(4, 2), true);
	    
	}

	
}