package Task6;

public class Task6 {
		
	public double[][] createMartix(double... sequenceOfNumbers){
		int n = sequenceOfNumbers.length;
		double [][] result = new double[n][];	
		for(int i=0;i<n;++i){
			result[i]= new double[n];
			for(int j=0;j<n;++j){
				result[i][j] = sequenceOfNumbers[(j+i)%n];
			}			
		}
		return result;
	}
	
}
