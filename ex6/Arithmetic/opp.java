package Arithmetic;
import java.util.*;
interface op{
  public void fucn(int a,int b);
}

class add implements op{
 public void fucn(int a,int b){
    System.out.println("SUM OF NUMBERS : "+ (a+b));
  }

}

 class sub implements op{
 public void fucn(int a,int b){
    System.out.println("DIFFERENCE OF NUMBERS : "+  (a-b));
  }

}

 class mul implements op{
 public void fucn(int a,int b){
    System.out.println("PRODUCT OF NUMBERS : "+  (a*b*));
  }

}

 class div implements op{
 public void fucn(int a,int b){
    System.out.println("QUOTIENT : "+  (a/b));
  }

}
