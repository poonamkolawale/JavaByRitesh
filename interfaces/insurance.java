interface bankacc
{	//static
	//{System.out.println("inside interface -static block");}// initialisation not allowed in interfaces.
	//{System.out.println("inside interface -instance block");}
	void banking();
}
interface autoloan
{	//autoloan() not allowed
	//{System.out.println("inside 0 arg- autoloan");}
	void loan();
}
abstract class insurance implements bankacc, autoloan
{	static
	{System.out.println("inside insurance-static block");}
	{System.out.println("inside insurance- instance block");}
}
class customer extends insurance
{	public void banking()
	{System.out.println("inside banking");}
	public void loan()
	{System.out.println("inside loan");}
	public void insurance()
	{System.out.println("inside insurance");}

	public static void main(String[] args)
	{	System.out.println("inside main methods");
	customer c= new customer();
	c.banking();
	c.loan();
	c.insurance();
	}
}

