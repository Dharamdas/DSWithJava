package concurrent.frokjoins;

import java.util.concurrent.ForkJoinPool;
import jsr166y.forkjoin.ForkJoinExecutor;
public class TestForkJoin {

	public static void main(String[] args) {

		LargeInteger test = new LargeInteger(); 
		// Check the number of available processors 
		int nThreads = Runtime.getRuntime().availableProcessors(); 
		System.out.println(nThreads); SplitTask mfj = new SplitTask(test.getList()); 
		ForkJoinExecutor pool = new ForkJoinPool(nThreads); 
		pool.invoke(mfj); 
		long result = mfj.getResult(); 
		System.out.println("Done. Result: " + result);	

		
	}

}
