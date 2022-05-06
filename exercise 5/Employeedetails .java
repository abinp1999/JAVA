/*Create a class ‘Employee’ with data members Empid, Name, Salary, Address and constructors
to initialize the data members. Create another class ‘Teacher’ that inherit the properties of 
class employee and contain its own data members department, Subjects taught and constructors
to initialize these data members and also include display function to display all the data members. 
Use array of objects to display details of N teachers.*/

import java.util.*;
class Employee //super class
{

 int empid,sal;
 String ename,addr;
    void Employee(int a,int b,String c,String d)//Employee class constructor
      {
          empid=a;
          sal=b;
          ename=c;
          addr=d;
      }

 }  

class Teacher extends Employee //subclass
{
    String dpt,sub;
     Teacher(String x,String y, int id, int sa,String name,String add) //Teacher class constructor
     {
       dpt=x;
       sub=y;
        empid=id;
          sal=sa;
          ename=name;
          addr=add;
       
         }
     void display(int i)
     {
       System.out.println("\nInformations of Teacher "+(i+1)+"\n_______________________________________\n");
       System.out.println("Employee ID :" +empid);
       System.out.println("Employee Name :" +ename);
       System.out.println("Address :" +addr);
       System.out.println("Department :" +dpt);
       System.out.println("Subject :" +sub);
       System.out.println("Salary :" +sal);
       System.out.println("\n");
     }

}


class Employeedetails 
{

      public static void main(String args[])
      {
           int j,i;
          int empid,sal;
          String ename,addr,dpt,sub;
          
            Scanner s=new Scanner(System.in);
          System.out.print("Enter Number of Teachers: ");
             int n=s.nextInt();
          Teacher obj[]=new Teacher[n];//declaring an array of objects
         /* for( j=0;j<n;j++)//to allocate memory for each objects
             obj[j]=new employee();*/
           for( i=0;i<n;i++)
          {
             System.out.print("\nEnter Informations of Teacher "+(i+1)+"\n______________________\n");
             System.out.println("Enter Employee ID :");
             empid=s.nextInt();
             System.out.println("Enter Employee Name :");
             ename=s.next();
             System.out.println("Enter Address :");
             addr=s.next();
             System.out.println("Enter Department :");
             dpt=s.next();
             System.out.println("Enter Subject :");
             sub=s.next();
             System.out.println("Enter Salary :");
             sal=s.nextInt();
             obj[i]=new Teacher(dpt,sub,empid,sal,ename,addr); //constructor invokation
          }
          
           for( i=0;i<n;i++)
          {
           obj[i].display(i); //display invocation
          }
      }

}




	/*
	OUTPUT
	------ 

	Enter Number of Teachers: 2

	Enter Informations of Teacher 1
	______________________
	Enter Employee ID :
	2
	Enter Employee Name :
	Tom
	Enter Address :
	Pazhoor
	Enter Department :
	CS
	Enter Subject :
	CS
	Enter Salary :
	10000

	Enter Informations of Teacher 2
	______________________
	Enter Employee ID :
	2
	Enter Employee Name :
	Mahesh
	Enter Address :
	Saikripa
	Enter Department :
	Maths
	Enter Subject :
	Maths
	Enter Salary :
	200000


	Informations of Teacher 1
	_______________________________________

	Employee ID :2
	Employee Name :Tom
	Address :Pazhoor
	Department :CS
	Subject :CS
	Salary :10000



	Informations of Teacher 2
	_______________________________________

	Employee ID :2
	Employee Name :Mahesh
	Address :Saikripa
	Department :Maths
	Subject :Maths
	Salary :200000
	*/
