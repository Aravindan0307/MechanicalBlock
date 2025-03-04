package mechanical;

import java.util.Scanner;

public class MechJ {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int b=20;
		int number=sc.nextInt();
		if (number%2==0 && number<10 && number==20) {
			System.out.println("Even Number: "+number);
			if (b==20) {
				System.out.println(b);
			} 
			else {
				System.out.println("Not Equals");
			}
		}
		else {
			System.out.println("Odd Number: "+number);
		}
			
		
		
	}

}
