class Dms
{
	int a=25;
	static  Dms refvar1, refvar2; // reference variable
	public static void main(String[]args)
  {
	System.out.println("start");

	Dms.refvar1= new Dms();  // refvar1 address assigned to obj
	System.out.println(Dms.refvar1.a); //25
	Dms.refvar2=Dms.refvar1;   // same address	
	Dms.refvar1.a=300;

	System.out.println(Dms.refvar1.a); //300
    System.out.println(Dms.refvar2.a); //300
	System.out.println("stop");
   }
}