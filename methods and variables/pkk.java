class Sam
{
	int a= 10;
	static int c=30;
	static void m1()
	{
	System.out.println("inside ststic m1");
	}
	void m3()
	{
		System.out.println("inside non static m3");
	
	}
}
class pkk
{
	int b=20;
	public static void main(String[] args)
{		
	Sam S1= new Sam();
	System.out.println(S1.a);// object for non-static variable
	//System.out.println(Sam.a);  // non-Static Variable not accessed by classname into Non Static Method
    System.out.println(Sam.c);// static variable by classname
    System.out.println(S1.c);//static variable by object
	//Sam.m3();         // non-static method cannot referenced into non static by classname
	S1.m3();              // non-static method into nonstatic area by object creation
	Sam.m1();              // static method can call inside non static area.
	S1.m1();               // object for Static method
	System.out.println("inside m2");

	/*System.out.println("start");
	pkk D1= new pkk();
	System.out.println(D1.b);
	Sam.m1();
	D1.m2();*/
}
	/*void m2()
{	
	Sam S1= new Sam();
	System.out.println(S1.a);// object for non-static variable
	//System.out.println(Sam.a);   non-Static Variable not accessed by classname into Non Static Method
    System.out.println(Sam.c);// static variable by classname
    System.out.println(S1.c);//static variable by object
	//Sam.m3();         // non-static method cannot referenced into non static by classname
	S1.m3();              // non-static method into nonstatic area by object creation
	Sam.m1();              // static method can call inside non static area.
	S1.m1();               // object for Static method
	System.out.println("inside m2");
 


	
	}*/
}
