/* Write a program has classes Publisher, Book, Literature and Fiction. 
Read the information and print the details of books from either the category, using inheritance.
Class Publisher- Attribute PublisherName, Method display()
Class Book subclass of Publisher- Attribute- Title, Author, Method display()
Class Literature subclass of Book-Attribute-type, Method display()
Class Fiction subclass of Book-Attribute-genre, Method display() */


import java.util.*;
class Publisher
{
    String pname;
    Publisher(String a) //constructor
    {
      pname=a;
    }
    void display()
   {
      System.out.println("Publisher Name : "+pname);

   }

}

class Book extends Publisher //subclass of Publisher
{
   String title,author;
   Book(String pp,String x,String y) //constructor
   {
     super(pp); //invoking parent constructor
     title=x;
     author=y;
   }
   void display()
   {
      super.display(); //invoking parent class display()
      System.out.println("Book Name : "+title);
      System.out.println("Author : "+author);
   }

}


class Literature extends Book //subclass of Book
{
    String type;
    Literature(String k,String p,String t,String a) //constructor
    {
       super(p,t,a); //invoking parent constructor
       type=k;
    }
     void display()
   {
      super.display(); //invoking parent class display
      System.out.println("Type : "+type);

   }
}



class Fiction extends Book //subclass of Book
{
     String genre;
      Fiction(String r,String p,String t,String a) //constructor
      {
         super(p,t,a); //invoking parent constructor
         genre=r;
       }
      void display()
      {
       super.display(); //invoking parent class display
      System.out.println("Genre : "+genre);

     }
}

class bookpublish
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter Number of Books of literature: ");
      int n1=s.nextInt();

      System.out.println("Enter Number of Books of Fiction: "); 
      int n2=s.nextInt();
  
      Book ref;
         Literature obj1[]=new Literature[n1];
         Fiction obj2[]=new Fiction[n2];
         int i=0;
         int j=0;
 
         do{
           System.out.println("\n\nEnter Literature Book details  "+(i+1));
           System.out.println("Enter Publisher name :  ");
           String p=s.next();
           System.out.println("Enter Book name :  ");
           String bk=s.next();
           System.out.println("Enter Author name :  ");
           String au=s.next();
            
           System.out.println("Enter Literature type :  ");
           String lt=s.next();
           obj1[i]=new Literature(lt,p,bk,au);
         i++;
          }while(i<n1);
           
           do  
	     {

           System.out.println("\n\nEnter Fiction Book details  "+(j+1));
           System.out.println("Enter Publisher name :  ");
           String p=s.next();
           System.out.println("Enter Book name :  ");
           String bk=s.next();
           System.out.println("Enter Author name :  ");
           String au=s.next();
            
           System.out.println("Enter Fiction type :  ");
           String lt=s.next();
           obj2[j]=new Fiction(lt,p,bk,au);
           j++;

         }while(j<n2);
        
     while(true){

         System.out.println("\n\n1.Literature\n2.Fiction\n3.Exit\n\nEnter choice: \n");
         int ch2=s.nextInt();

        if(ch2==1){
           for(i=0;i<n1;i++){
               System.out.println("\nLiterature Book Information "+ (i+1)+"\n___________________________\n");
               obj1[i].display();
             }}
        else if(ch2==2){
                  for(j=0;j<n2;j++){
               System.out.println("\nFiction Book Information "+(j+1)+"\n__________________________\n");
               obj2[j].display();     
         }}
	
	else if(ch2==3){
                 
               System.out.println("\nExiting...");
               break;
         }
       else{
             break; }
        
      }

     }
             
}


	/*
	OUTPUT
	------
	Enter Number of Books of literature: 
	2
	Enter Number of Books of Fiction: 
	1


	Enter Literature Book details  1
	Enter Publisher name :  
	Tom
	Enter Book name :  
	Tbook 
	Enter Author name :  
	Sebastian
	Enter Literature type :  
	Fantasy


	Enter Literature Book details  2
	Enter Publisher name :  
	Abin
	Enter Book name :  
	Sbook
	Enter Author name :  
	Raj
	Enter Literature type :  
	Fantasy


	Enter Fiction Book details  1
	Enter Publisher name :  
	Midhun
	Enter Book name :  
	Wonderworld
	Enter Author name :  
	Mridula
	Enter Fiction type :  
	Science


	1.Literature
	2.Fiction
	3.Exit

	Enter choice:

	1

	Literature Book Information 1
	_____________________________

	Publisher Name : Tom
	Book Name : Tbook
	Author : Sebastian
	Type : Fantasy

	Literature Book Information 2
	_____________________________

	Publisher Name : Abin
	Book Name : Sbook
	Author : Raj
	Type : Fantasy


	1.Literature
	2.Fiction
	3.Exit

	Enter choice:

	2

	Fiction Book Information 1
	__________________________

	Publisher Name : Midhun
	Book Name : Wonderworld
	Author : Mridula
	Genre : Science


	1.Literature
	2.Fiction
	3.Exit

	Enter choice:

	3

        Exiting...

	*/
