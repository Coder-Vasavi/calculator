package ass3;
import java.util.*;
import java.io.*;
abstract class calculator 
{
   public abstract int compute(int x,int y);
}
class addition extends calculator
{
    @Override
	public int compute(int x,int y) {
		return x+y;
	}
}
class subtraction extends addition
{
    @Override
	public int compute(int x, int y) {
	   return x-y;
	}
}
class multiply extends subtraction
{
   @Override
	public int compute(int x, int y) {
	   return x*y;
	}
}
class divide extends multiply
{
   @Override
	public int compute(int x, int y) {
	  return x/y;
	}
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the First Number");
	   int a=sc.nextInt();
	   System.out.println("Enter the Second Number");
	   int b=sc.nextInt();
	   multiply obj=new  divide();
	   System.out.println("Division of 1 st number by 2nd number: "+obj.compute(a,b));
	   subtraction obj2=new multiply();
	   System.out.println("Multiplication of 1 st number with 2nd number: "+obj2.compute(a, b));
	   addition obj3=new subtraction();
	   System.out.println("Subtraction of 1 st number and 2nd number: "+obj3.compute(a, b));
	   calculator obj4=new addition();
	   System.out.println("Addition of 1 st number and 2nd number: "+obj4.compute(a, b));
   }
}