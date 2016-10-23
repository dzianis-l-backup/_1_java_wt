package Test7;

import org.junit.Test;

import Task7.Task7;

import static org.junit.Assert.assertArrayEquals;

public class Test7 {
	 private Task7 sorter = new Task7();
	    @Test
	    public void test0(){
	        double[] rightResult = {0,1,3,3,3,8,44,444,666};
	        assertArrayEquals(rightResult, sorter.sortShell(3,3,44,1,0,3,444,666,8), 0.0001);
	    }
	    @Test
	    public void test1(){
	        double[] rightResult = {1,22,333,4444,55555,666666,7777777};
	        assertArrayEquals(rightResult, sorter.sortShell(7777777,666666,55555,4444,333,22,1), 0.0001);
	    }
	    @Test
	    public void test2(){
	        double[] rightResult = {1,2,3};
	        assertArrayEquals(rightResult, sorter.sortShell(1,2,3), 0.0001);
	    }
	    @Test
	    public void test3(){
	        double[] rightResult = {1,2,3};
	        assertArrayEquals(rightResult, sorter.sortShell(3,2,1), 0.0001);
	    }
	    @Test
	    public void test4(){
	        double[] rightResult = new double[]{0,0};
	        assertArrayEquals(rightResult, sorter.sortShell(0,0), 0.0001);
	    }
	    @Test
	    public void test5(){
	        double[] rightResult = new double[0];
	        assertArrayEquals(rightResult, sorter.sortShell(), 0.0001);
	    }
}
