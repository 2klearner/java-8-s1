package PS10;

import java.util.concurrent.ForkJoinPool;

public class Fork_Join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	       int[] array = new int[10000];

	        for (int i = 0; i < array.length; i++) {
	            array[i] = i;
	        }

	        ForkJoinPool forkJoinPool = new ForkJoinPool();
	        MaxFinderTask maxFinderTask = new MaxFinderTask(array, 0, array.length);

	        int result = forkJoinPool.invoke(maxFinderTask);

	        System.out.println("\nMax value of the array: " + result);
	}

}
