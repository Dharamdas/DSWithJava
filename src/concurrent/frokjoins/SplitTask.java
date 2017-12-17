package concurrent.frokjoins;

import java.util.Arrays;
import java.util.concurrent.RecursiveAction;

public class SplitTask extends RecursiveAction{

	private int []list;
	public long result;
	public SplitTask(int [] arr) {
	this.list=arr;
	}
	
	@Override
	protected void compute() {

		if(list.length==1)
		{
			result=list[0];
		}else{
			
			int midPoint = list.length/2;
			int []l1 = Arrays.copyOfRange(list,0,midPoint);
			int []l2 = Arrays.copyOfRange(list,midPoint,list.length);
			SplitTask s1 = new SplitTask(l1);
			SplitTask s2 = new SplitTask(l2);
			forkJoin(s1, s2);
			result = s1.result + s2.result;
			
		}
		
	}
	

}
