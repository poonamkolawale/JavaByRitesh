	class Demo22
{
	   int x=50;
	   float y;
	   public static void main( String[] args)
	{
		int a=200;
		System.out.println("start");
		//Demo22.m2();
	   Demo22 d= new Demo22();
	   System.out.println(a);
	   d.m1(a);
	   
	 }

		static void m2()
	 {
		Demo22 e= new Demo22();
		 System.out.println(e.a);
		 e.m1();
	 
	 }
	
	   void m1(int c)
	{ 
		   Demo22 e= new Demo22();

			float b=50.5f;
			System.out.println("inside m1"+x);
			y = x+ c+b;
			System.out.println(y);

	}
}

