import java.util.Scanner;
public class threenumbers
 	{
   		public static void main(String[] args)
    		{
        		Scanner in = new Scanner(System.in);
        		System.out.print("Input first number: ");
        		double x = in.nextDouble();
        		System.out.print("Input second number: ");
        		double y = in.nextDouble();
       			System.out.print("Input third number: ");
        		double z = in.nextDouble();
        		if (x < y && y < z)
        		{
            			System.out.println("Increasing order");
        		}
        		else if (x > y && y > z)
			{
            			System.out.println("Decreasing order");
        		}
        		else
        		{
            			System.out.println("Neither increasing or decreasing order");
        		}
    		}
	}
//output ex1.4:
 java threenumbers
Input first number: 100
Input second number: 120
Input third number: 150
Increasing order
 java threenumbers
Input first number: 800
Input second number: 750
Input third number: 600
Decreasing order
java threenumbers
Input first number: 11
Input second number: 11
Input third number: 11
Neither increasing or decreasing order

