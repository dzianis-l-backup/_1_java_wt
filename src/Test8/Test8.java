package Test8;

import org.junit.Test;

import Task8.Task8;

import static org.junit.Assert.assertArrayEquals;

public class Test8 {
	Task8 task8 = new Task8();
	@Test
	public void  startTest(){
		double[] a = {1,3,3,7};
		double[] b = {1,4};
		int[] res = {2};
		task8.makeIncreasing(a,b);
		assertArrayEquals(task8.makeIncreasing(a,b),res);
		
	}
	@Test
	public void  startTest1(){
		double[] a = {1,3,3,7,7,9};
		double[] b = {1,4,8};
		int[] res = {2,4};
		task8.makeIncreasing(a,b);
		assertArrayEquals(task8.makeIncreasing(a,b),res);
		
	}
	@Test
	public void  startTest2(){
		double[] a = {1,3};
		double[] b = {1,4};
		int[] res = new int[0];
		task8.makeIncreasing(a,b);
		assertArrayEquals(task8.makeIncreasing(a,b),res);
		
	}
	@Test
	public void  startTest3(){
		double[] a = {5,3};
		double[] b = {1,4};
		int[] res = new int[0];
		task8.makeIncreasing(a,b);
		assertArrayEquals(task8.makeIncreasing(a,b),res);
		
	}
}
