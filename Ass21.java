/*

21. Write a Java program to convert a decimal number to octal number. 
Input Data:
Input a Decimal Number: 15
Expected Output
Octal number is: 17
*/

import java.util.*;
class Ass21
{
	public static void main(String args[])
	{
		int num;
		System.out.println("Enter decimal number to convert in octal:");
		Scanner sc=new Scanner (System.in);
		num =sc.nextInt();
		System.out.println("Decimal to Octal Conversion");
		long octal=convertDecimalToOctal(num);
		System.out.println("Octal Number ="+ octal);
	
	}
	public static long convertDecimalToOctal(int n)
	{
		long b=0;
		int r, i=1;
		
		while (n!=0)
		{
			r=n%8;
			n/=8;
			b=b+r*i;
			i=i*10;
			
		}
		return b;
		
	}
}