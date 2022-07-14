/*4. Program to create a generic stack and do the Push and Pop
operations.
2. Using generic method perform Bubble sort.*/

import java.util.*;
class BubleSort<T>{
	
	public static void Sort(T[] arr){
		T temp;
		int len=arr.length;
		for(int i=0;i<len;i++){
			for(int j=0;j<len-i-1;j++){
				if(arr[j].compareTo(arr[j+1])>0){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				
				}
			
			}		
		}
		for(int i=0;i<len;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
class Main{

	public static void main(String ar[]){
		
		Double[] array1 ={2.1,5.2,3.4,6.5,6.0,4.2};
		Integer[] array2 ={2,5,3,6,6,4};
		//Double a [];
		BubleSort<Double> b= new BubleSort<Double>();
		b.Sort(array1);
		
		//b.Sort(array2);
		
	
	}
}
