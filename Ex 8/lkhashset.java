//Program to demonstrate the creation of Set object using the LinkedHashset class

import java.util.*;
class lkhashset{
    public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            LinkedHashSet<String> hset=new LinkedHashSet<String>(); //delcaring LinkedHashSet
	    System.out.println("1.Add\n2.Delete\n3.Display\n4.Exit");
           
 	    while(true){
                      System.out.println("\nEnter your Option");
                    int ch=s.nextInt();
                    if(ch==1){
                              System.out.println("Enter item to add");
                              String str=s.next();
                              hset.add(str); //adding an item
                        }
                     else if(ch==2){
                             System.out.println("Enter item to Remove");
                             String str2=s.next();
                             hset.remove(str2); //removing an item
                       }
                    else if(ch==3){
                             System.out.println("LinkedHashSet :");
                             Iterator<String> itr=hset.iterator();
                             while(itr.hasNext()){
                                     System.out.println(itr.next());
						}
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
	1.Add
	2.Delete
	3.Display
	4.Exit

	Enter your Option
	1
	Enter item to add
	tom

	Enter your Option
	1
	Enter item to add
	midhun

	Enter your Option
	3
	LinkedHashSet :
	tom
	midhun

	Enter your Option
	2
	Enter item to Remove
	midhun 

	Enter your Option
	3
	LinkedHashSet :
	tom

	Enter your Option
	4
	Exiting
	*/
