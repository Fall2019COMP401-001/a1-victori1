package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int totalP = (scan.nextInt());
		
		for (int i = 0; i <= totalP; i++) {
		String first = (scan.next());
		
		char ini = first.charAt(0);
		String last = (scan.next());
		System.out.print(ini + ". " + last + ": ");
		int things = (scan.nextInt());
		//System.out.print("things: " + things);
		//int j = 0;
		double total1 = 0;
	//	System.out.println(things);
		int quantity = 0;
		
		for (int j = 0; j < things; j++) {
		//	System.out.println("runing 1");
			quantity = (scan.nextInt());
		
//			System.out.println("hey");
			//System.out.println("quantity: " + quantity);
			String item = (scan.next());
			//System.out.println("item: " + item);
			double price = (scan.nextDouble());
			//System.out.println("price: " + price);
			double itemTotal = (quantity * price);
			//System.out.println("item total: " + itemTotal);

			total1 += itemTotal;
			
			//j++;
			
		}
		System.out.println(total1 + " ");
		}
		scan.close();
		
		
		}
		
	}

