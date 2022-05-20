class Demo
{
	{System.out.println("inside instance block 1"); } //instance block will get execute for 2 times
	{System.out.println("Inside instance block 2"); } // it executes before constractor execution and
	                                                   // during object creation //
	
	Demo()
	{	this(20);  // call to this() must be first. it calls constractor with 1 arg.
		System.out.println("Inside 0 arg");}

	Demo(int b)
	{	System.out.println("Inside 1 arg");
		this();}  // call to this() must be first statement.

	public static void main(String[]args)
     {
     	new Demo();
		new Demo();
	}
}