/* 3. Write a Java program to divide two numbers and print on the screen.
 Test Data : 50/3
 Expected Output : 16
 */
 import java.util.*;
class Ass3
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the two number:");
        int i=sc.nextInt();
        int j= sc.nextInt();
        int divide= i/j;		
		System.out.println("Division="+divide);
        		
	}
}