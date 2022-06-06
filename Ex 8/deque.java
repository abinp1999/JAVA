/*Program to demonstrate the addition and deletion of elements in deque*/

import java.util.*;
class deque{
    public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            Deque<String> dq=new ArrayDeque<String>(); //delcaring a Array Deque

            System.out.println("1.Add First\n2.Add Last\n3.Delete First\n4.Delete Last\n5.Display\n6.Exit");
            while(true){
                      System.out.println("\nEnter your Option");
                      int ch=s.nextInt();
                       if(ch==1){
                              System.out.println("Enter item to add at first");
                              String str=s.next();
                              dq.addFirst(str); //adding an item first
                    }
                    else if(ch==2){
                            
                              System.out.println("Enter item to add at last");
                              String str1=s.next();
                              dq.addLast(str1); //adding an item last
                             
                    }
                    else if(ch==3){
                             dq.removeFirst(); //removing from first
                    }
                    else if(ch==4){
                             dq.removeLast(); //removing from last
                    }
                    else if(ch==5){
                             System.out.println("Deque: "+dq);
                             
                    }
                      else{
			   System.out.println("Exiting");
			break;
			}
 
           }
     }

}

	/*
	OUTPUT
	------
	1.Add First
	2.Add Last
	3.Delete First
	4.Delete Last
	5.Display
	6.Exit

	Enter your Option
	1
	Enter item to add at first
	tom

	Enter your Option
	1
	Enter item to add at first
	athira

	Enter your Option
	2
	Enter item to add at last
	midhun

	Enter your Option
	5
	Deque: [athira, tom, midhun]

	Enter your Option
	3

	Enter your Option
	5
	Deque: [tom, midhun]

	Enter your Option
	4

	Enter your Option
	5
	Deque: [tom]

	Enter your Option
	6
	Exiting
	*/
