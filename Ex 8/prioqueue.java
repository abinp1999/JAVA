/*Program to demonstrate the creation of queue object using the PriorityQueue class*/

import java.util.*;
class prioqueue{
    public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            PriorityQueue<String> pq=new PriorityQueue<String>(); //delcaring Priority Queue

            System.out.println("1.Add\n2.Delete\n3.Display\n4.Exit");
            while(true){
                      System.out.println("\nEnter your option");
                      int ch=s.nextInt();
                      if(ch==1){
                              System.out.println("Enter item to add ");
                              String str=s.next();
                              pq.add(str); //adding item
                         }
                                      
                      else if(ch==2){
                             System.out.println("Enter item to Remove");
                             String str2=s.next();
                             pq.remove(str2); //removing from first
                         }
                 
                      else if(ch==3){
                             System.out.println("Priority Queue: "+pq);                            
                         }

                      else{
                           System.out.println("Exiting..");
			   break;
			  }
 
           }
      }

 }

	/*
	1.Add
	2.Delete
	3.Display
	4.Exit

	Enter your option
	1
	Enter item to add 
	tom

	Enter your option
	1
	Enter item to add 
	athira

	Enter your option
	1
	Enter item to add 
	midhun

	Enter your option
	3
	Priority Queue: [athira, tom, midhun]

	Enter your option
	2
	Enter item to Remove
	tom

	Enter your option
	3
	Priority Queue: [athira, midhun]

	Enter your option
	4
	Exiting..
	*/

          
