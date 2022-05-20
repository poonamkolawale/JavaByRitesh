class admin1
{
	float a=10.5f;
	char c='x';
	boolean b= true;
	public static void main(String[]args)
{	
	System.out.println("start");
	admin1 a1=admin1.test();
	System.out.println(a1.a);
	System.out.println(a1.b);


	
	}
	static admin1 test()
{
	admin1 a= new admin1();
	return a;
	}
}