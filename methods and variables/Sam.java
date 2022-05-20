class Sam
{
	int a= 10;
	void m1()
	{
	System.out.println("inside sample");
	}
}
class Dem
{
	int b=20;
	public static void main(String[] args)
{	
	System.out.println("start");
	Dem D1= new Dem();
	System.out.println(D1.b);
	D1.m2();
}
	void m2()
{	
	/*Sam S1= new Sam();
	System.out.println(S1.a);
	S1.m1();*/
	System.out.println("inside m2");
 


	
	}
}
