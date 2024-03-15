package util;

public class ArraysOperations {

	private static StringBuffer buffer;

	public static int[][] fillRandomly(int[][] matrix, int max, int min) {
		int length = matrix.length;
		for (int i = 0; i < length; i++) {
			matrix[i] = fillRandomly(matrix[i], max, min);
		}

		return matrix;
	}

	public static int[] fillRandomly(int[] array, int max, int min) {
		int length = array.length;
		for (int i = 0; i < length; i++) {
			array[i] = (int) ((Math.random() * max) + min);
		}
		return array;
	}

	public static int sumValues(int[] array) {
		int sum = 0;
		for (int n : array)
			sum += n;

		return sum;
	}
	
	public static int sumValues(int[][] matrix) {
		int sum = 0;
		for (int line[] : matrix)
			sum += sumValues(line);

		return sum;
	}

	public static void printValues(int[] array) {
		buffer = new StringBuffer();
		for (int n : array) {
			buffer.append(n + "\t");
		}
		System.out.println(buffer.toString());
	}

	public static void printValues(int[][] matrix) {
		for (int n[] : matrix) {
			printValues(n);
		}
	}

}
