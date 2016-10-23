package Task7;
public class Task7 {
	 public double[] sortShell(double... array){
	        for(int i=0;i<array.length-1;){
	            if(array[i] <= array[i+1]){
	                i++;
	            }else{
	            	double temp = array[i];
	    	        array[i] = array[i+1];
	    	        array[i+1] = temp;
	                if(i > 0) {
	                    i--;
	                }
	            }
	        }
	        return array;
	    }
}
