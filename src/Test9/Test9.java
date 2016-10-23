package Test9;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

import Task9.Task9;
import Task9.Task9.Ball;
import Task9.Task9.Basket;

public class Test9 {
	Task9 task9 = new Task9();
	Basket basket = task9.getBasket(10.0);
	Ball ball1 = task9.getBall(Color.blue, 2);
	Ball ball2 = task9.getBall(Color.red, 1);
	Ball ball3 = task9.getBall(Color.green, 0.1);
	Ball ball4 = task9.getBall(Color.blue, 3);
	Ball ball5 = task9.getBall(Color.white, 0.4);
	Ball ball6 = task9.getBall(Color.gray, 0.5);
	Ball ball7 = task9.getBall(Color.blue, 1.3);
	
	
	
	@Test
	public void test1(){
		
		basket.pushBall(ball1);
		basket.pushBall(ball2);
		basket.pushBall(ball3);
		basket.pushBall(ball4);
		basket.pushBall(ball5);
		basket.pushBall(ball6);
		basket.pushBall(ball7);
		
		double summary = basket.getWeight();
		int blueCount = basket.countBlue();
		assertEquals(summary,8.3,0.0001);
		assertEquals(blueCount,3);
	}
}
