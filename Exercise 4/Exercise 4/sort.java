/*Write a menu driven program that would choose either in-built 
method or call a user defined method to sort an array of strings*/

import java.util.*;

public class sort
{
    public static String[] stringarrsort(String[] words)
    {
        for(int i = 0; i < words.length - 1; i++)
        {
            for(int j = i+1; j < words.length; j++)
            {
                if(words[i].compareTo(words[j]) > 0) //words[j] is less than than words[i]
                {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        return words;
    }

    public static void main(String[] args)
    {
        String[] arr = {"Tom","Abin","Midhun","Rahul","Kiran","Mahesh"};
        String[] sortedarr;
        Scanner s=new Scanner(System.in); //creating Scanner class object
        System.out.print( "1.Built-in Sort\n2.User defined Sort\nEnter choice: ");
        int ch=s.nextInt(); //reading choice
       System.out.print("\n");
          
        if(ch==1){ //built-in sorting
             Arrays.sort(arr);  
        System.out.println(Arrays.toString(arr));

          }
    
       else if(ch==2){ //user defined sorting
        sortedarr = stringarrsort(arr);
        for(int i = 0; i < sortedarr.length; i++)
            System.out.println(sortedarr[i] + " ");
         }

       else{
             System.out.println( "Invalid!!");
           }
    }
}

        /*
	 OUTPUT
	--------
	1.Built-in Sort
	2.User defined Sort
	Enter choice: 1

	[Abin, Kiran, Mahesh, Midhun, Rahul, Tom]


	1.Built-in Sort
	2.User defined Sort
	Enter choice: 2

	Abin 
	Kiran 
	Mahesh 
	Midhun 
	Rahul 
	Tom 
        */





