class imp
{
	static void m1()
   {		
	 //return;     // unreachable statement
	System.out.println("inside m1 method");

	}
	public static void main(String[]args)
   {
	System.out.println("inside main method");
	imp.m1();	// static method inside static area by classname
	}
}