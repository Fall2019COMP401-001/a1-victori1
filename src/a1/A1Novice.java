package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int count = scan.nextInt();

		int[] ar = new int[count];
	
		for (int i=0; i<ar.length; i++) {
			ar[i] = scan.nextInt();	
			System.out.println(ar[i]);
		}
		scan.close();
		
		System.out.print(scan.next());
		//int first = findFirstLetter(ar);
		//int last = findLastName(ar);
		//int total = calculateTotal(ar);
		
		// Print results
		
		//System.out.println(first + ". " + last + ": " + total);

		//static int findFirstLetter(int[] ar) {
			
			int sum = 0;
			
			for (int i=0; i<ar.length; i++) {
				sum += ar[i];
			}
			
		//	return sum;
		}
		
	}

