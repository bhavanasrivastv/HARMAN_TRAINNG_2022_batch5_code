package a;

public class H_DemoArray2D {

	public static void main(String[] args) {

		// 2D
		// 3D: computer graph
		// 4D yes...

		// 3X5=> maths :) "10x rule"==>?

		int a[][] = { { 4, 6, 7, 8, 9 }, { 14, 6, 97, 8, 9 }, { 4, 6, 7, 8, 89 } };
		int sum=0;
		
		print2Darray(a);
		
		
		printSum(a, sum);

	}

	static void printSum(int[][] a, int sum) {
		for (int temp[] : a) {

			for (int temp2 : temp) {
				sum+=temp2;
			}
			System.out.println();
		}
		
		System.out.println(sum);
	}

	static void print2Darray(int[][] a) {
		for (int temp[] : a) {

			for (int temp2 : temp) {
				System.out.print(temp2 + " ");
			}
			System.out.println();
		}
	}

}
