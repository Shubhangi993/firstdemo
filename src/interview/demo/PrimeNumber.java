package interview.demo;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter your choice:1.prime 2.Fibbonaci 3.Factorial 4.EvenORODD 5.ReverseNumber 6.SWAPNUMBER 7. StarTraingle");
		
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice)
		{
		
		case 4:
			System.out.println("Enter your number");
			int num =sc.nextInt();
			if(num%2==0)
			{
				System.out.println("num is even");
			}
			else
			{
				System.out.println("num is odd");
			}
			break;
		case 2:
			
			break;
		case 3:
			break;
		case 1:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		
		}
		
	}
}
