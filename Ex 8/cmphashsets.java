//Write a Java program to compare two hash set

import java.util.*;
class cmphashsets{
    public static void main(String args[]){
		    Scanner s=new Scanner(System.in);
		    HashSet<String> hset1=new HashSet<String>(); //delcaring a HashSet 1
		    HashSet<String> hset2=new HashSet<String>(); //delcaring a HashSet 2

                    System.out.println("\nHashSet 1\n-----------");
                    System.out.println("1.Add\n2.Display\n3.Exit\n");
                             
                  while(true){
                              System.out.println("Enter your Option");
                              int ch=s.nextInt();
                              if(ch==1){
                             	 System.out.println("Enter item to add");
                              	 String str=s.next();
                              	 hset1.add(str); //adding an item
                               }

                              else if(ch==2){
                                   System.out.println(hset1); //displaying hset 1
                               }
                             
                              else{
                           
                                  break;    
                                }
                             }
                    
                     
                             
                              System.out.println("\nHashSet 2\n---------");
                              System.out.println("1.Add\n2.Display\n3.Exit\n");
                              
		while(true){
                              System.out.println("Enter your Option");
                              int ch1=s.nextInt();

                              if(ch1==1){
                              	System.out.println("Enter item to add");
                              	String str1=s.next();
                              	hset2.add(str1); //adding an item
                             }

                              else if(ch1==2){
                                   System.out.println(hset2);//displaying hset 2
                                 }
                             
                           else{
                             
                              break;    
                              }
                             }

                     if(hset1.equals(hset2)) //comparing HashSets by equals method
                          {  
                              System.out.println("\nBoth HashSets are same");
                          }
                     else
                          {
                               System.out.println("\nBoth HashSets aren't same!!");
                          }

                    
        }
  }

	/*
	OUTPUT
	------

	HashSet 1
	---------
	1.Add
	2.Display
	3.Exit

	Enter your Option
	1
	Enter item to add
	tom
	Enter your Option
	2
	[tom]
	Enter your Option
	3

	HashSet 2
	---------
	1.Add
	2.Display
	3.Exit

	Enter your Option
	1
	Enter item to add
	athira
	Enter your Option
	2
	[athira]
	Enter your Option
	3

	Both HashSets aren't same!!

	***************************

	HashSet 1
	-----------
	1.Add
	2.Display
	3.Exit

	Enter your Option
	1
	Enter item to add
	tom
	Enter your Option
	2
	[tom]
	Enter your Option
	3

	HashSet 2
	-----------
	1.Add
	2.Display
	3.Exit

	Enter your Option
	1
	Enter item to add
	tom
	Enter your Option
	2
	[tom]
	Enter your Option
	3

	Both HashSets are same
	*/
