//Program for inner class object

import java.util.*;
class cpu //Outer class
{

float price=6000;
     void display()
     {
       System.out.println("Price: "+price);
       processor p=new processor(); //Creating object for inner class processor
       p.display();
     }


class processor //Inner class
{
int core=5;
String man="intel";
     void display()
     {
       System.out.println("No. of Cores: "+core);
       System.out.println("CPU Manufacturer: "+man);
     }

}

static class ram //Static Inner Class
{
int size=8;
String manufa="HP";
    void display()
    {
     System.out.println("RAM: "+size+ " GB");
     System.out.println("RAM Manufacturer: "+manufa);
    }
}


public static void main(String args[])
{
cpu obj=new cpu();//Creating Object for Outer Class

System.out.println("System Specifications\n---------------------\n");
obj.display();
cpu.ram obj2=new cpu.ram(); //Object for static inner class
obj2.display();
}


	/*
	OUTPUT
	_____

	System Specifications
	---------------------

	Price: 6000.0
	No. of Cores: 5
	CPU Manufacturer: intel
	RAM: 8 GB
	RAM Manufacturer: HP

	*/
















}
