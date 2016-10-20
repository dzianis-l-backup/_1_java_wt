package Task3;

public class Task3 {
	
	 public double[][] compute(double a, double b, double h){
	        if(h == 0.0){
	            return null;
	        }
	        if(b < a){
	            double c = b;
	            b = a;
	            a = c;
	        }

	        if(h > 0){
	        	if(a<b)
	        		return tan(a, b, h);
	        	return tan(b, a, h);
	        } 
	        else{
	        	if(a<b)
	        		return tan(b, a, h);
	        	return tan(a, b, h);
	        }	        
	    }

	    private double[][] tan(double a, double b, double h){
	        int length = stepsQuantity(a, b, h);
	        double[][] result = new double[length][2];
	        int i = 0;	        
	        if(a<b){
	        	for(double value = a; value <= b; value += h, i++){
		            result[i][0] = value;
		            result[i][1] = Math.tan(value);
		        }
	        }
	        else {
	        	 for(double value = a; value >= b; value += h, i++){
	 	            result[i][0] = value;
	 	            result[i][1] = Math.tan(value);
	 	        }
	        }
	        return result;
	    }
	    
	    private int stepsQuantity(double a, double b, double h){
	        return  (int)Math.abs(((b - a)/h))+1;
	    }
}
