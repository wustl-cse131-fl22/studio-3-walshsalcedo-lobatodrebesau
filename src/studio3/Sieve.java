package studio3;

import java.util.Scanner;

public class Sieve {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);

		System.out.println("What is the value of n (1-40)?");
		int n = in.nextInt();
		int position = 0;
		int arraylength = 0;
		boolean[]numbers = new boolean[n];
		for (int i = 0; i <= n; i++) {
			if ((i == 2) || (i == 3) || (i == 5 ) || (i == 7)) {
				arraylength++;}
			else if ((i %2 != 0) && (i %3 != 0) && (i %5 != 0) && (i % 7 != 0) && (i != 1)) {
				arraylength++;
			}
		}
		int[]array = new int[arraylength];
		for (int i = 0; i <= n; i++) {
			if ((i == 2) || (i == 3) || (i == 5 ) || (i == 7)) {
				array[position] = i;
				position++;}
			else if ((i %2 != 0) && (i %3 != 0) && (i %5 != 0) && (i % 7 != 0) && (i != 1)) {
				array[position] = i;
				position++;
				
			}
		}
		for (int value : array) {
		System.out.println(value);}
		
	}

}
