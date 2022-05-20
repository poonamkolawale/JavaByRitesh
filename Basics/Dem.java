class Samplee
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
	Samplee s1= new Samplee();
	Dem D1= new Dem();
	System.out.println(D1.b);
	System.out.println(s1.a);
	s1.m1();
}
}
