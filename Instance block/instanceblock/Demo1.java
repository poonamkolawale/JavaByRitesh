package instanceblock;
class sample
{
	{System.out.println("inside instance block-sample");
   	Demo1 d1= new Demo1(); // instance block of demo class will be printed
	d1.m1();}
   	
	sample()
	{System.out.println("inside 0 arg");}

	void m1()
	{System.out.println("inside m1 method");}
}

class Demo1
{
		{System.out.println("inside instance block Demo1");}
		void m1()
		{System.out.println("inside m1m1 method");}
	  
	  public static void main(String[]args)
	   {new sample().m1();}
}