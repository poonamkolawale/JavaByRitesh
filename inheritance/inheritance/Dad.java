package inheritance;
class Demo 
{
	int a=10;
	float b= 10.5f;
	void m1(int a)
	{System.out.println("inside class Demo- m1 method");}
}
class Dad extends Demo
{
	int a=20;
	float b=20.5f;
	void m1()
	{ super.m1(10);
	System.out.println("inside class Dad-m1 method");}
	void m2(int a, float b)
	{System.out.println("inside m2 method");
	System.out.println(super.a+super.b);// super is used to access non static parent member into
	System.out.println(this.a+this.b);    //non-static area.
	System.out.println(a+b);
	}
	public static void main(String[]args)
	{
		Dad d= new Dad();
		d.m2(30,30.5f);
		d.m1();
	
	}
}
