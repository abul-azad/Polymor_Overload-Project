package polymorphism;

public class Override_Testresult 
{//Start From Here
	
	public static void main(String[] args) 
	{
	Overriding obj=new Overriding();
	obj.Get_constructionloan();
	obj.Get_Homeloan();
	obj.Get_ChaseBankLoan();
	obj.Get_Homeloan();
	obj.Get_BofaBankLoan();
	
	System.out.println(obj.Get_constructionloan());
	System.out.println(obj.Get_Homeloan());
	System.out.println(obj.Get_ChaseBankLoan());
	System.out.println(obj.Get_Homeloan());
	System.out.println(obj.Get_BofaBankLoan());
	
	}
	
	
	
}//End is here
