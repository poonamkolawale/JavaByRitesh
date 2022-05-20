class Demo
{
	static{System.out.println("Inside static 1");} 
	static{System.out.println("Inside static 2");}
	{System.out.println("Inside instance block");}
	
	public static void main(String[]args)
  {
	System.out.println("Inside main method");
	new Demo();
	new Demo();
  }
 }