/* 5. Write a Java program that takes two numbers as input and display the product of
   two numbers.
   Test Data:
   Input first number: 25
   Input second number: 5
    Expected Output :
    25 x 5 = 125
*/
import java.util.*;
class Ass5
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the two number:");
        int i=sc.nextInt();
        int j= sc.nextInt();
        int product= i*j;		
		System.out.println(i+"x"+j +"="+product);
        		
	}
}