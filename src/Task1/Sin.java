
package Task1;
import java.util.Scanner;
public class Sin {
	
	static class argumentsXY{//class for storing x,y
		double x;
		double y;
		argumentsXY(double x, double y){
			this.x = x;
			this.y = y;
		}
	}
	
	public double calculateMathExpression(double x, double y){
		double firstVar =  Math.pow(Math.sin(x+y),2)+1;//numerator
		double secondVar =  2 + Math.abs(x - 2*x/(  1 + Math.pow(x, 2)*Math.pow(y, 2)  ) );//denominator
		return firstVar/secondVar + x;			
	}
	static argumentsXY validateArguments(){
		Scanner sc = new Scanner(System.in);
		double x;
		double y;
		
		System.out.println("x:");	
		while(!sc.hasNextDouble()){
			System.out.println("Invalid parameters, enter x:");	
			sc.nextLine();
		}
		x = sc.nextDouble();
		
		System.out.println("y:");	
		while(!sc.hasNextDouble()){
			System.out.println("Invalid parameters, enter y:");	
			sc.nextLine();
		}
		y = sc.nextDouble();
		return new argumentsXY(x,y);
	}
	
	public  void start (){
		System.out.println("Math expression counting: please enter rational x and y...");		
		argumentsXY xy =  validateArguments();// returns two double variables		
		System.out.printf("x=%f; y=%f; result=%f\n", xy.x, xy.y,calculateMathExpression(xy.x,xy.y));		
		
	}

}
