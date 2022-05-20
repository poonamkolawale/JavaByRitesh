class D1
{
	int x=100,k=50;
	public static void main(String[]args)
  {
  	int y= 200,a;
	System.out.println("start");
	D1 d= new D1();						// object creation
	System.out.println(d.x);			//prints non-static variable
	a= d.x+y;
	System.out.println(a);
	d.m1();

	}
	static void m1()
	{
		//int p=10;
		D1 e= new D1();
		System.out.println("inside m1");
		System.out.println(e.k);



	}
}
