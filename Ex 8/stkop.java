/*Program to remove an object from the Stack when the position is passed as parameter*/

import java.util.*;
class stkop{
    public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            Stack<String> stk=new Stack<String>();//delcaring a stack
            System.out.println("1.Push\n2.Remove by index\n3.Display\n4.Exit");
           while(true){
                    System.out.println("\nEnter your Option");
                    int ch=s.nextInt();
                    if(ch==1){
                              System.out.println("\nEnter item to Push");
                              String str=s.next();
                              stk.push(str); //adding item
                    }
                    else if(ch==2){
                             System.out.println("\nEnter index position to Remove");
                             int i=s.nextInt();
                             stk.removeElementAt(i); //removing element at index i
                    }
                    else if(ch==3){
                             System.out.println("\nItems in Stack :"+stk);
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
	1.Push
	2.Remove by index
	3.Display
	4.Exit

	Enter your Option
	1

	Enter item to Push
	tom

	Enter your Option
	1

	Enter item to Push
	abin

	Enter your Option
	3

	Items in Stack :[tom, abin]

	Enter your Option
	2

	Enter index position to Remove
	1

	Enter your Option
	3

	Items in Stack :[tom]

	Enter your Option
	4
	Exiting..
	*/


