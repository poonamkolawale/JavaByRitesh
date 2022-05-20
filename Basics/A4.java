class A4
{
	int a=10;
	static int b=20;
	public static void main(String []args)
 {
 	int c=30;
	System.out.println("start");
	A4.m1(c);
	System.out.println("hectic");

	}
	static int m1(int d)
{	
	System.out.println(d);
	A4 demo= new A4();
	demo.m2();
	int e= d+ A4.b;
	System.out.println(e);
	return e;
}
    void m2()
	{
	System.out.println("st0p");

	}

	
	

}
	
	
	
	
	
	
	
	
	
	
	
	
 











