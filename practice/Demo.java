class Demo
{
	Demo(int x)
	{System.out.println("hii");}
	
	void m1()
	{System.out.println("m1 method");}

	public static void main(String[] args)
	{
	System.out.println("inside main");
	Demo d= new Demo(10);
	d.m1();

	}


}