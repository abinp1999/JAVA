//cube of a number upto a given integer
import java.util.Scanner;
public class cube
{
	public static void main(String[] args)
	{	
		int i,n;
		System.out.println("input number of terms");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println("Number is : "+"is :"+(i*i*i));
		}
	}
}
//output exercise1.2
java cube
input number of terms
9
Number is : is :1
Number is : is :8
Number is : is :27
Number is : is :64
Number is : is :125
Number is : is :216
Number is : is :343
Number is : is :512
Number is : is :729

