package polymorphism;

//In the same class multiple method but method name 
//should be same,only change the parameter.

public class Overloading 
{//start from here
	
   public void Get_Grocery (int a) 
   {
    System.out.println(a);
   }

   public void Get_Shoping (int a, int b) 
   {
	System.out.println(a*b);
   }
   public void Get_Fishing (int a, int b, int c) 
   {
	System.out.println(a-b-c);
   }
   public void Get_Money (int a, int b, int c, int d) 
   {
	System.out.println(a+b+c+d);   
   }
	
	
}//End is here
