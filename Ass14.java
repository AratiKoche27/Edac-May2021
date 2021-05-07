//14. Write a Java program to print an American flag on the screen. 
/*

class Ass14
{
	public static void main(String args[])
	{
		for(int i=1; i<=15; i++)
		{
			if(i<=6)
			{
				if(i%2==1) 
				{
					System.out.println("* * * * * * =================================");
				}
				else
				{
					System.out.println(" * * * * *  =================================");
				}
			}
			else
			{
				System.out.println("=============================================");
			}
		}
		
        		
	}
}
*/
import java.util.*;
class Q14
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	
	
			String p1 = "* * * * * * ==================================";
			String p2 = "==============================================";
			for (int i = 0; i < 4; i++) 			
			{
				System.out.println(p1);
			}
			System.out.println("* * * * * * ==================================");
			for (int i = 0; i < 6; i++) 
			{
				System.out.println(p2);
			}
		}
}
