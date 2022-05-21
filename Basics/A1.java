//ACCESS STATIC METHOD INTO STATIC AREA//

class A1
{
	public static void main(String[] args)
   {	
	float b=20.5f;
	System.out.println("start");
	A1.m1();
     
	
	System.out.println("a");
    }
	static void m1()
   {
   	int a=10;
	System.out.println(a);
   }
}