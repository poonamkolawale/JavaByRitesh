class Fish
{
	static int studId;
	String studName;
	static
   {
	System.out.println("Inside static 1");
	Fish.studId=101;
	Fish d= new Fish();
	d.studName="cyber";
   }
   {
	System.out.println("Inside non-static block 1");
	Fish.studId=202;
	studName="Droid";
   }
	static void m1()
   {
	System.out.println("Inside static method m1");
	System.out.println(Fish.studId);
    }
	void m2()
    {
	System.out.println("Inside non-static method 2");
	System.out.println(studName);
    }
	public static void main(String[]args)
   {
	System.out.println("start @cyber success");
	Fish.m1();
	new Fish().m2();
	System.out.println("stop @ success");
    }
}





