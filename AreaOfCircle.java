import java.util.Scanner;
class AreaOfCircle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		  double pi = 3.147;
		System.out.println("Enter the radius of the cirlce:");
		  double radius = sc.nextDouble();

		  double area = pi * radius * radius;                           

		System.out.println("The area of the circle is:" + area);

	}


}