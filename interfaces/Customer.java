interface BOM
{	int a=100;
	void loan();
	void insurance();
	void finance ();
}
class BANK implements BOM
{	int a=300;
	public void loan(){}        // empty implementation--> adapter class
	public void insurance() {}
	public void finance()      // implementation only for finance is required by client.
	{System.out.println("inside insurance");}
}
class Customer extends BANK
{
	public static void main(String []args)
	{new Customer().finance();
	System.out.println(a);
	System.out.println(new Customer().a);}  // it will take 300
}