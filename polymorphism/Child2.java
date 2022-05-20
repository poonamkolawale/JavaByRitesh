/* access modifier- public, protected, default, private----> increases security
                    public, protected, default, private----> decreases visibility
  Rule 6--> it is not possible to override private method of parent class to child class*/

class Parent1
{		
	//private void m2(){}
	 void m1()
	{System.out.println("inside private method");}
}
 class	child1 extends Parent1
{	
	void m2(){}
	 protected void m1()
	{System.out.println("inside default method");}
	public static void main(String[]args)
  {	Parent1 p= new child1();
  	p.m1();
	p.m2();
  }
}
/* Rule-->7.
   1.we can override at wider access level
   2.m1() in child1 cannot override m1() in Parent1
    private void m1() attempting to assign weaker access privileges; 
   3. we can override methods of same wider area*/ 
