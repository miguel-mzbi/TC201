package miguelmzbi.tc201.lych;
import java.util.Scanner;

public class MALychArena {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter your lower bound:");
		int lowB = scan.nextInt();
		System.out.println("Enter your upper bound:");
		int upB = scan.nextInt();
		MALych range1 = new MALych(lowB, upB);
		range1.orderingLych();
				
	}

}
