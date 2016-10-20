package Test4;

import org.junit.Test;
import static org.junit.Assert.*;

import Task4.Task4;

public class Test4 {
	
	private Task4 prime = new Task4();

    @Test
    public void testStart(){
    	
        int[] expectedResult = {0, 2, 7, 8};
        int[] realResult = prime.primeDetect(313, 44, 317, 78, 26, 190, 1896, 13, 17);
        assertArrayEquals(realResult,expectedResult);
        
    }
	
}
