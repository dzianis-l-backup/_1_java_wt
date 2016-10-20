package Task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {

	 public int[] primeDetect(int... numbers){
		 
		 	//list to collect prime values without knowledge of their quantity
	        List<Integer> primeIndexesArrayList = new ArrayList<Integer>();
	        
	        for(int j = 0; j < numbers.length; ++j){
	            if(isPrimeNumber(numbers[j])){
	            	primeIndexesArrayList.add(j);
	            }
	        }
	       	//no direct way to convert Integer[] to int[] via toArray   
	        int[] primeArrayIndexes = new int[primeIndexesArrayList.size()];
	        
	        for(int i = 0; i < primeArrayIndexes.length; ++i){
	        	primeArrayIndexes[i] = primeIndexesArrayList.get(i);
	        }
	        
	        return primeArrayIndexes;
	    }

	    private boolean isPrimeNumber(int number){
	    	
	        for(int k = 2; k <= Math.sqrt(number); ++k){
	            if(number%k == 0) {
	                return false;
	            }
	        }
	        
	        return true;
	    }
	
}
