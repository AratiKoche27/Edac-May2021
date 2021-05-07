//12. Write a Java program that takes three numbers as input to calculate and print the 
// average of the numbers.
import java.util.*;
class Ass12
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the three number:");
        int i=sc.nextInt();
        int j= sc.nextInt();
		int k=sc.nextInt();
		int sum=i+j+k;
		int n=3;
        int average= 	sum/n;
		System.out.println("Average= "+average);
        		
	}
}