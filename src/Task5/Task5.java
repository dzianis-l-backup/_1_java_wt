package Task5;

public class Task5 {
	
	//dynamic programming	
	public int minReduceQuantity(int... numbers){
		if(numbers.length == 0)
			return 0;		
		int n = numbers.length;		
		int maxLengthSequenceArray[] = new int[n];		 
		for (int i=0; i<n; ++i) {
			maxLengthSequenceArray[i] = 1;//sequence of the only number a[i]
			for (int j=0; j<i; ++j)
				if (numbers[j] <= numbers[i])
					maxLengthSequenceArray[i] = Math.max (maxLengthSequenceArray[i], 1 + maxLengthSequenceArray[j]);
		}
		 
		int answer = maxLengthSequenceArray[0];
		for (int i=0; i<numbers.length; ++i)
			answer = Math.max (answer, maxLengthSequenceArray[i]);
		return n-answer;
	}
	
	
}
