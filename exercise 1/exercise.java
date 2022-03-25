/*a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000*/
import java.util.Scanner;
import java.lang.Math;//importing math class
public class exercise
{
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("input value: ");
		double input=in.nextDouble();
		if(input>0)//checking whether entered value > 0
		{
			if(input<1)//checking entered value is<1 or not
			{
				System.out.println("positive small number");
			}
			else if (input>100000)
			{
				System.out.println("positive large number");
			}
			else
			{
				System.out.println("positive number");
			}
		}
		else if(input<0)//checking whether enterd value is less than 0 or not

			{
				if(Math.abs(input) < 1)
				{
					System.out.println("negative small number");
				}
				else if(Math.abs(input)>100000)
				{
					System.out.println("negative  large number");
				}
				else
				{
					System.out.println("Negative number");
				}
			}
		else
			{
				System.out.println("zero");
			}
	}
}
//output1.1
input value: 
0.5 
positive small number
input value: 
-0.9
negative small number
input value: 
10000000
positive large number
input value: 
-10000000000
negative  large number

					
