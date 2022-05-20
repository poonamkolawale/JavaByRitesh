class Demo1
{
	static int a;
	static
	{System.out.println("Inside static "+a);
	a=100;}
	
	static void m1()
	{System.out.println("Inside static1 "+a);}

	public static void main(String[]args)
	{System.out.println("Inside  static main ");
	Demo1.m1();}

}