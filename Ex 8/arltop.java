/*Maintain a list of Strings using ArrayList from collection framework, perform built-in operations.*/

import java.util.*;
class arltop{
  public static void main(String args[]){
          Scanner s=new Scanner(System.in);
          ArrayList<String> al=new ArrayList<String>(); //delcaring an array list
          System.out.println("1.Add\n2.Remove\n3.Remove All\n4.Display\n5.Get\n6.Size\n7.Exit\n");
          while(true){
                   System.out.println("\nEnter your Option");
                   int ch=s.nextInt();
                   if(ch==1){
                              System.out.println("\nEnter item to add");
                              String str=s.next();
                              al.add(str); //adding an item
                    }
                    else if(ch==2){
                             System.out.println("\nEnter item to Remove");
                             String str2=s.next();
                             al.remove(str2); //removing an item
                    }
                    else if(ch==3){
                            al.clear(); //removing all
                            System.out.println("\nAll Item Cleared");
                    }
                    else if(ch==4){
                             System.out.println(al); //displaying
                    }
                    else if(ch==5){
                             System.out.println("\nEnter the index Position");
                             int i=s.nextInt();
                             System.out.println("Item at index "+i+" : "+al.get(i)); //getting by index postion
                    }
                    else if(ch==6){
                             System.out.println("Size of ArrayList : "+al.size()); //getting size
                    } 
                    else{
                           System.out.println("\nExiting..");
                           break;    
                   }
              }
         }
    }

	/*

	OUTPUT
	------
	1.Add
	2.Remove
	3.Remove All
	4.Display
	5.Get
	6.Size
	7.Exit

	Enter your Option
	1

	Enter item to add
	tom

	Enter your Option
	1

	Enter item to add
	athira

	Enter your Option
	1

	Enter item to add
	midun

	Enter your Option
	4
	[tom, athira, midun]

	Enter your Option
	5

	Enter the index Position
	2
	Item at index 2 : midun

	Enter your Option
	6
	Size of ArrayList : 3

	Enter your Option
	2

	Enter item to Remove
	athira

	Enter your Option
	4
	[tom, midun]

	Enter your Option
	3
	All Item Cleared

	Enter your Option
	4
	[]

	Enter your Option
	7
	Exiting..

	*/







