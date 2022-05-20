abstract class Parentp  // one abstract method one complete method- void m2()
{
	abstract void m1(); // incomplete method 
	void m2()           // complete method
	{ System.out.println("inside m2 parent p");}
	/*Parentp pp= new Parentp(); if we create object of abstract class. because it is incomplete 
	                             method, implementation is not exist inside abstract method*/
	//pp.m2();
}
class Childc extends Parentp  // inherits the abstract class parent
{
	void m1()   // implementation of abstract method m1 i.e overriding of m1 method.
	{System.out.println("inside m1 method child");}
	void m2()   // overriding takes place
	{System.out.println("inside m2 method child");}
	public static void main(String[] args)
	{
		Parentp p= new Childc(); // parent p is reference variable of child
		p.m1(); // inside m1 method child
		p.m2(); // inside m2 method child
	}

}