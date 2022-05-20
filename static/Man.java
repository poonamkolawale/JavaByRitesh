class Man
{
	static
	{System.out.println("Inside static 1");}
	static
	{System.out.println("Inside static 2");}

	{System.out.println("Inside instance block 1");}
	{System.out.println("Inside instance block 2");}

	Man()
	{System.out.println("Inside 0 argument");}

	Man(int a)
	{System.out.println("Inside 1 argument");}

	public static void main(String[]args)
      {
	System.out.println("Start @ cyber");
	new Man();
	new Man(10);
	System.out.println("Start @ cyber");
	}
}

