class sample 
{
	void m1()
	{int a= 100;
	System.out.println("inside m1 method");
	}
}
class Sam
{
	public static void main(String[]args)
	{System.out.println("inside main method-->start");
	Sam s= new Sam();
	s.m2();
	System.out.println("inside main method-->stop");}

	void m2()
	{System.out.println("inside m2 method");
     sample s1=new sample();
	 s1.m1();
	 return;
	 }

}