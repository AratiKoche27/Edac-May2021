/*6. Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
*/
import java.util.*;
class Ass6
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the two number:");
        int i=sc.nextInt();
        int j= sc.nextInt();
		int add=i+j;
		System.out.println(i+" + "+j +"= "+add);
		int subtract=i-j;
		System.out.println(i+" - "+j +"= "+subtract);
        int product= i*j;		
		System.out.println(i+" x "+j +"= "+product);
		int divide=i/j;
		System.out.println(i+" / "+j +"= "+divide);
		int mod=i%j;
		System.out.println(i+" mod "+j +"= "+mod);
        		
	}
}