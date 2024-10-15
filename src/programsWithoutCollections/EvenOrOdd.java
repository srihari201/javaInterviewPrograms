package programsWithoutCollections;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int number=scanner.nextInt();
		
		if(number%2==0) {
			System.out.println("Entering into if condition");
			System.out.println( number + " is even");	
		}
		else {
			System.out.println(number + "is odd");
		}
		System.out.println("exist the condition");
		

	}

}
