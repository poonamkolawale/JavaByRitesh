/* Rule -->2 overridden method return type and overriding return type must be have same
	      primitive type. */

class parent 
{	final int a=100; 
	 //final void m1()//overrideen method is final
	 void m1()
	{System.out.println("inside final m1");}
	// int payment() overridden method return type and overriding return type must be have same
	//primitive type.
	 float payment()
	{System.out.println("inside int method");
	 return 100.5f;}
}
class child1 extends parent 
{
	void m1()
	{System.out.println("inside m1 method");}
	float payment(){System.out.println("inside payment");
	return 10.5f;}
	public static void main(String[]args)
	{child1 c =new child1();
	c.m1();
	c.payment();
	System.out.println(c.a);}
}