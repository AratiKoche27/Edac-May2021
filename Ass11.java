/*11. Write a Java program to print the area and perimeter of a circle. 
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689   P=2*pi*r
Area is = 176.71458676442586   A=pi*r*r
*/

class Ass11
{
	public static void main(String args[])
	{
		double r=7.5d;
		double pi=3.1415926535589793238d;
		double perimeter = 2*pi*r;
		double area = pi*r*r;
		System.out.println("Perimeter is= "+perimeter);
        System.out.println("Area is= "+area);
	}
}

//o/p
//Perimeter is= 47.1
//Area is= 176.625