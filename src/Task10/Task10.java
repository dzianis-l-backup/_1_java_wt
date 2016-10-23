package Task10;


import java.awt.Color;
import java.util.ArrayList;

import Task9.Task9;
import Task9.Task9.Ball;
import Task9.Task9.Basket;

public class Task10 {
	
	public static void main(String args[]){ 
		
		Task10 task10 = new Task10();
		Basket basket = task10.getBasket(10.0);
		Ball ball1 = task10.getBall(Color.blue, 2);
		Ball ball2 = task10.getBall(Color.red, 1);
		Ball ball3 = task10.getBall(Color.green, 0.1);
		Ball ball4 = task10.getBall(Color.blue, 3);
		Ball ball5 = task10.getBall(Color.white, 0.4);
		Ball ball6 = task10.getBall(Color.gray, 0.5);
		Ball ball7 = task10.getBall(Color.blue, 1.3);
		
		basket.pushBall(ball1);
		basket.pushBall(ball2);
		basket.pushBall(ball3);
		basket.pushBall(ball4);
		basket.pushBall(ball5);
		basket.pushBall(ball6);
		basket.pushBall(ball7);
		
		double summary = basket.getWeight();
		int blueCount = basket.countBlue();
		System.out.println("Basket current weight: "+basket.getWeight()+"; blue balls quantity: "+basket.countBlue());
		
	}
	
	public class Ball{
			
		Color color;
		double weight;
			
		public Ball(Color color,double weight){
			this.color = color;
			this.weight = weight;
		}
			
		public Color getColor(){
			return this.color;
		}
		public double getWeight(){
			return this.weight;
		}
			
	}
		
	public class Basket{
				
		ArrayList<Ball> balls;
		double weightLimit;
				double currentWeight;
				
				
				public Basket(double weightLimit){
					this.weightLimit = weightLimit;
					this.currentWeight = 0;
					balls = new ArrayList<Ball>();
				}
				
				public boolean pushBall(Ball ball){
					if(currentWeight+ball.weight>this.weightLimit)
						return false;
					else {
						balls.add(ball);
						currentWeight = currentWeight + ball.weight;
						return true;
					}
				}
				public double getWeight(){
					return currentWeight;
				}
				public int countBlue(){
					int count = 0;
					for(int i=0;i<balls.size();++i){
						if(balls.get(i).getColor()==Color.blue){
							++count;
						}
					}
					return count;
				}			
		}
		
		public Basket getBasket(double limit){
			return new Basket(limit);
		}
		
		public Ball getBall(Color color,double weight){
			return new Ball( color, weight);
		}
		
		
}
