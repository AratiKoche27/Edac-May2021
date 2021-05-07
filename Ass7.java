/*7. Write a Java program that takes a number as input and prints its multiplication
table upto 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
*/
import java.util.*;
class Ass7
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int x= sc.nextInt();
		int end=11;
		for(int start=1; start<end; start++)
		{
			int y=start*x;
			System.out.println(x+" x "+start+" = "+y );
		}
		
	}
	
}