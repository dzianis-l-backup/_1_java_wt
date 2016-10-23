package Task9;

import java.awt.Color;
import java.util.ArrayList;

public class Task9 {
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
