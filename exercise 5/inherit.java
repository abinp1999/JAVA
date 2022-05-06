/*Create a class ‘Person’ with data members Name, Gender, Address, Age and a constructor to initialize the data members 
and another class ‘Employee’ that inherits the properties of class Person and also contains its own data members like Empid,
Company_name, Qualification, Salary and its own constructor. Create another class ‘Teacher’ that inherits
the properties of class Employee and contains its own data members like Subject, Department, Teacherid and also contain
constructors and methods to display the data members. Use array of objects to display details of N teachers*/


import java.util.*;

class Person
{

 int Age;
 String Name,Gender,Address;
      Person(int age,String name,String gender,String address) //Person class constructor
      {
          Name=name;
          Gender=gender;
          Address=address;
          Age=age;
      }

 }  

class Employee extends Person //Person's subclass
{
    int Empid,salary;
    String company_name,qualification;
    Employee(int eid,int sal,String cn,String qua,int Age,String name,String Gender,String Address) //Employee class constructor
     {
       super(Age, name, Gender, Address);
         Empid=eid;
         salary=sal;
         company_name=cn;
         qualification=qua;
         
       
        }
}


class Teacher extends Employee //subclass of Employee
{
    int Teacher_id;
    String subject,department;
     Teacher(int p,String q,String r,int eid,int sal,String cn,String qua,int Age,String name,String Gender,String Address)//Teacher class constructor
     {
       super(eid, sal, cn, qua, Age, name, Gender, Address);
         Teacher_id=p;
         subject=q;
         department=r;
      }
     void display(int i)
     {
       System.out.println("Informations of Teacher "+(i+1)+"\n___________________________\n");
       System.out.println("Name: "+Name);
       System.out.println("Gender: "+Gender);
       System.out.println("Address: "+Address);
       System.out.println("Age: "+Age);
       System.out.println("Employee ID: "+Empid);
       System.out.println("Salary: "+salary);
       System.out.println("Company Name: "+company_name);
       System.out.println("Qualification: "+qualification);
       System.out.println("Teacher ID: "+Teacher_id);
       System.out.println("Subject: "+subject);
       System.out.println("Department: "+department);
       System.out.println("\n\n");
     }

}


class inherit
{
      public static void main(String args[])
      {
           int Age,i;
           String Name,Gender,Address;
           int Empid,salary;
           String company_name,qualification;
           int Teacher_id;
           String subject,department;
          
           Scanner s=new Scanner(System.in);
           System.out.print("Enter Number of Teachers: ");
           int n=s.nextInt();

          Teacher obj[]=new Teacher[n]; //declaring an array of objects
         
           for( i=0;i<n;i++)
          {

             System.out.print("Enter Informations of Teacher "+(i+1)+"\n________________________________\n");
             System.out.println("Enter Name: ");
             Name=s.next();
             System.out.println("Enter Gender: ");
             Gender=s.next();
             System.out.println("Enter Address: ");
             Address=s.next();
             System.out.println("Enter Age: ");
             Age=s.nextInt();
             System.out.println("Enter Empid: ");
             Empid=s.nextInt();
             System.out.println("Enter Salary: ");
             salary=s.nextInt();
              
             System.out.println("Enter Company Name: ");
             company_name=s.next();
               
             System.out.println("Enter Qualification: ");
             qualification=s.next();
     
             System.out.println("Enter Teacher ID: ");
             Teacher_id=s.nextInt();

             System.out.println("Enter	Subject: ");
             subject=s.next();
  
             System.out.println("Enter Department: ");
             department=s.next();

             System.out.println("\n\n");

            obj[i]=new Teacher(Teacher_id,subject,department,Empid,salary,company_name,qualification,Age,Name,Gender,Address); //constructor invokation
          
           }
          
           for( i=0;i<n;i++)
          {
           obj[i].display(i);  //display invocation
          }
      }



}


	/*
	OUTPUT
	------ 

	Enter Number of Teachers: 1
	Enter Informations of Teacher 1
	________________________________
	Enter Name:
	Tom
	Enter Gender:
	m
	Enter Address:
	pazhoor
	Enter Age:
	21
	Enter Empid:
	1
	Enter Salary:
	10000
	Enter Company Name:
	Inosys
	Enter Qualification:
	MCA
	Enter Teacher ID:
	1
	Enter Subject:
	CS
	Enter Department:
	CS


	Informations of Teacher 1
	___________________________

	Name: Tom
	Gender: m
	Address: pazhoor
	Age: 21
	Employee ID: 1
	Salar: 10000
	Company Name: Inosys
	Qualification: MCA
	Teacher ID: 1
	Subject: CS
	Department: CS

	*/

