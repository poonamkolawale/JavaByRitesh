class Red
{
	//int x=10;
	static int y=20;
	public static void main(String[]args)

 {	
 	System.out.println("start");
	int x=y+Red.c;
 	System.out.println(x);
	Red.m1();
	}
	 static void m1()
	{
	int c=30;
	System.out.println("inside me");
 }


}