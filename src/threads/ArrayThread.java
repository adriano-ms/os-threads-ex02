package threads;

import util.ArraysOperations;

public class ArrayThread extends Thread {

	private int[] array;
	private int lineIndex;

	public ArrayThread() {
		super();
	}

	public ArrayThread(int[][] matrix, int lineIndex) {
		this.array = matrix[lineIndex];
		this.lineIndex = lineIndex;
	}

	public ArrayThread(int[] array, int lineIndex) {
		this.array = array;
		this.lineIndex = lineIndex;
	}

	@Override
	public void run() {
		System.out.println("Line " + lineIndex + ": " + ArraysOperations.sumValues(array));
	}
}
