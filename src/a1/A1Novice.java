package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int totalP = (scan.nextInt());
		
		for (int i = 0; i < totalP; i++) {
		String first = (scan.next());
		
		char ini = first.charAt(0);
		System.out.print(ini + ". " + (scan.next()) + " ");
		int things = (scan.nextInt());
		
		int j = 0;
		
		while (j < things) {
			int quantity = (scan.nextInt());
			String item = (scan.next());
			double price = (scan.nextDouble());
			double total = (quantity * price);
		
			j++;
			System.out.print(total + " ");
		}
		
		}
		scan.close();
		
		
		}
		
	}

