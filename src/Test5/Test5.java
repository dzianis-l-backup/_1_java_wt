package Test5;
import org.junit.Test;

import Task5.Task5;

import java.util.Arrays;
import static junit.framework.TestCase.assertEquals;
public class Test5 {
	
	    Task5 minReduceQuantityAlg = new Task5();

	    @Test
	    public void test1(){
	        int[] sequence = {0, 2, 3, 4, 7, 8};
	        String failMessage = "failure: "+ Arrays.toString(sequence);
	        assertEquals(failMessage, minReduceQuantityAlg.minReduceQuantity(sequence), 0);
	    }

	    @Test
	    public void test2(){
	        int[] sequence = {1, 2, -2, 4, 4, 5, 6};
	        String failMessage = "failure: "+ Arrays.toString(sequence);
	        assertEquals(failMessage, minReduceQuantityAlg.minReduceQuantity(sequence), 1);
	    }

	    @Test
	    public void test3(){
	        int[] sequence = {5, 6, 5, 5, 3, 2, 1};
	        String failMessage = "failure: "+ Arrays.toString(sequence);
	        assertEquals(failMessage, minReduceQuantityAlg.minReduceQuantity(sequence), 4);
	    }

	    @Test
	    public void test4(){
	        int[] sequence = new int[0];
	        String failMessage = "failure: "+ Arrays.toString(sequence);
	        assertEquals(failMessage, minReduceQuantityAlg.minReduceQuantity(sequence), 0);
	    }
	
}
