class A3
{ 
	int a=100;
	static int b=200;
	public static void main(String[]args)
  {
	//A3 Demo= new A3();
	A3.m1();
	int d1=A3.m1();
	//System.out.println(Demo.a);
	System.out.println(A3.b);
	}
	static int m1()
  {
		int c=300,d;
		A3 D= new A3();
		d=D.a+A3.b+c;
		System.out.println(d);
		return d;


	





  }


}













