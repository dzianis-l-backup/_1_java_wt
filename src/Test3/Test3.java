package Test3;

import static org.junit.Assert.*;

import org.junit.Test;

import Task3.Task3;

public class Test3 {
	
	   	private Task3 computer = new Task3();
	   	
	    private double[][] expectedResultNegative = {
	            {3.0, -0.1425},
	            {2.0, -2.1850},
	            {1.0, 1.5574},
	            {0.0, 0.0},
	            {-1.0, -1.5574},
	            {-2.0, 2.1850},
	            {-3.0, 0.1425}

	    };
	   	
	    private double[][] expectedResult = {
	            {-3.0, 0.1425},
	            {-2.0, 2.1850},
	            {-1.0, -1.5574},
	            {0.0, 0.0},
	            {1.0, 1.5574},
	            {2.0, -2.1850},
	            {3.0, -0.1425}

	    };		    
	  
	    @Test
	    public void testStart() {
	        realTest(-3, 3.2, 1, expectedResult);
	        realTest(3, -3.9, -1, expectedResultNegative);
	        
	    }

	    private void realTest(double a, double b, double h, double[][] expectedResult){
	        String fail = "Crush: a = " + a + " b = "+ b + " h = " + h;
	        double[][] realResult = computer.compute(a, b, h);
	        for (int i = 0; i < realResult.length; i++) {
	            assertArrayEquals(fail, realResult[i], expectedResult[i], 0.0001);
	        }
	    }
}
