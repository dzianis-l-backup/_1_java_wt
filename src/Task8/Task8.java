package Task8;

import java.util.ArrayList;

public class Task8 {
	public int[] makeIncreasing(double[] a,double[] b){
		
		if(a.length==0)
			return null;
		ArrayList<Integer> indexes = new ArrayList<Integer>();
		
		
		if(isIncreasing(a))
			if(isIncreasing(b)){
				for(int i=0;i<a.length-1;++i){
					if(a[i]>=a[i+1])
						if(searchNeededInB(a[i],b)==a[i])
							return new int[0];
						else indexes.add(i+1);
				}
				if(indexes.size()==0)
					return new int[0];
				int []indexesA = new int[indexes.size()];
				for(int j=0;j<indexes.size();++j){
					indexesA[j]=indexes.get(j);
				}
				return indexesA;
			}
		return new int[0];
	}
	public boolean isIncreasing(double[] a){
		for(int i=0;i<a.length-1;++i){
			if(a[i]>a[i+1])
				return false;
		}
		return true;
	}
	public double searchNeededInB(double a,double[] b){
		for(int i=0;i<b.length;++i){
			if(a<b[i])
				return b[i];
		}
		return a;
	}
}
