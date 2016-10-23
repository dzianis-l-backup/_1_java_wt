package Test6;
import org.junit.Test;

import Task6.Task6;

import static org.junit.Assert.assertArrayEquals;
public class Test6 {
	    @Test
	    public void testStart(){
	    	Task6 task = new Task6();
	        double[][] res = task.createMartix(1, 2, 3, 4, 5);
	        double[][] res1 = task.createMartix(2, 3, 14);
	        double[][] res2 = task.createMartix(1,5);

	        
	        double[][] check = {
	                {1, 2, 3, 4, 5},
	                {2, 3, 4, 5, 1},
	                {3, 4, 5, 1, 2},
	                {4, 5, 1, 2, 3},
	                {5, 1, 2, 3, 4}
	        };
	        double[][] check1 = {
	                {2, 3, 14},
	                {3, 14, 2},
	                {14, 2, 3}
	        };
	        
	        double[][] check2 = {
	                {1, 5},
	                {5, 1}
	        };

	        for (int i = 0; i < 5; i++){
	            assertArrayEquals(res[i], check[i], 0.0001);
	        }
	        
	        for (int i = 0; i < 3; i++){
	            assertArrayEquals(res1[i], check1[i], 0.0001);
	        }
	        
	        for (int i = 0; i < 2; i++){
	            assertArrayEquals(res2[i], check2[i], 0.0001);
	        }
	    }
	
}
