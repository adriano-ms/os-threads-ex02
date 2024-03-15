package view;

import threads.ArrayThread;
import util.ArraysOperations;

public class Main {

	public static void main(String[] args) {

		int matrix[][] = new int[3][5];
		
		ArraysOperations.fillRandomly(matrix, 255, 0);
		
		ArraysOperations.printValues(matrix);
		System.out.println();
		
		int i = 0;
		for(int line[] : matrix) {
			ArrayThread thread = new ArrayThread(line,i);
			thread.start();
			i++;
		}
	}

}
