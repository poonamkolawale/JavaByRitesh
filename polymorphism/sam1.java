class sam
{	sam()
      {	System.out.println("inside 0 arg");}
      	sam(int a)
      {	System.out.println("inside 1 arg");}
}
class sam1 extends sam
{      	void m1(int a)
      {	System.out.println("inside fff arg");}
	public static void main(String[]args)
{       System.out.println("inside main");
        sam1 s1=new sam1();
		s1.m1(10);
	    new sam(20);
	}
	}
