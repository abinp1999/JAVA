//Program to remove all the elements from a linked list

import java.util.*;
class removell{
    public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            LinkedList<String> ll=new LinkedList<String>();//delcaring a linked list
            System.out.println("1.Add\n2.Add First\n3.Display\n4.Clear\n5.Exit");
            while(true){
                    System.out.println("\nEnter your choice: ");
                    int ch=s.nextInt();
                    if(ch==1){
                              System.out.println("\nEnter item to add: ");
                              String str=s.next();
                              ll.add(str); //adding an item
                    }
                    else if(ch==2){
                             System.out.println("\nEnter item to Add: ");
                             String str2=s.next();
                             ll.addFirst(str2); //adding an item first
                   }
                   else if(ch==3){
                             System.out.println("Linked List: "+ll);
                   }
                    else if(ch==4){
                            ll.clear(); //removing all
                            System.out.println("Complete items cleared");
                   }
                    else{
                             System.out.println("Exiting..");
                             break;
                     }
            }
       }

    }


	/*
	OUTPUT
	------
	1.Add
	2.Add First
	3.Display
	4.Clear
	5.Exit

	Enter your choice: 
	1

	Enter item to add: 
	tom

	Enter your choice: 
	1

	Enter item to add: 
	midun

	Enter your choice: 
	2

	Enter item to Add: 
	abin

	Enter your choice: 
	3
	Linked List: [abin, tom, midun]

	Enter your choice: 
	4
	Complete items cleared

	Enter your choice: 
	3
	Linked List: []

	Enter your choice: 
	5
	Exiting..
	*/
