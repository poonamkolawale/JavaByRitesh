class Demo1
{
	Demo1()
  { 
	this(10);
	System.out.println("inside 0 argument");
	}
	
	Demo1(int a)
 {
	//this();  recursive constractor invocation.
	System.out.println("1 arg"+ a);
	}

	public static void main(String[]args)
  { 
    System.out.println("inside main");
	new Demo1();
	
	}
}