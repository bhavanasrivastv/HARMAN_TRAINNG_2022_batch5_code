package a;

import java.util.Scanner;

public class B_EvenOdd {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("PE a no to check even or odd...");
		int n=scanner.nextInt();
		
		if(n%2==0) {
			System.out.println("even no");
		}else
			System.out.println("odd no");
	}
}
