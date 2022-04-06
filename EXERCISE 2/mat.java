//reading 2 matrices and adding it
import java.util.*;//importing classes
class AddMatrix
	{
	public static void main(String args[])
		{
			int row, col,i,j;//declaring variables
			Scanner in = new Scanner(System.in); 
			System.out.println("Enter the number of rows");//inputing number of rows
			row = in.nextInt();
			System.out.println("Enter the number columns");//inputting number of coloumns
			col = in.nextInt(); 
			int mat1[][] = new int[row][col];	
			int mat2[][] = new int[row][col];
			int res[][] = new int[row][col];
			System.out.println("Enter the elements of matrix1");
			for ( i= 0 ; i < row ; i++ )
				{ 
				for ( j= 0 ; j < col ;j++ )
					mat1[i][j] = in.nextInt(); 
					System.out.println();
				}
				System.out.println("Enter the elements of matrix2");
				for ( i= 0 ; i < row ; i++ )
					{
					for ( j= 0 ; j < col ;j++ )
						mat2[i][j] = in.nextInt();
						System.out.println();
					}
					for ( i= 0 ; i < row ; i++ )
					for ( j= 0 ; j < col ;j++ )
					res[i][j] = mat1[i][j] + mat2[i][j] ;  
					System.out.println("Sum of matrices:-");
					for ( i= 0 ; i < row ; i++ )
					{ 
					for ( j= 0 ; j < col ;j++ )
					System.out.print(res[i][j]+"\t"); 
					System.out.println();
					}
				}
		}


/*
output
Enter the number of rows
3
Enter the number columns
3
Enter the elements of matrix1
1 2 3
4 5 6

7 8 9

Enter the elements of matrix2
3 99 700

800 900 222

150 121 111

Sum of matrices:-
4	101	703	
804	905	228	
157	129	120	
*/
