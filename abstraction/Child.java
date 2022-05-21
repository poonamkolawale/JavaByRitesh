import inheritance.Child;
import inheritance.Parent;

/* Abstraction- it provide services, implementation is done in child class.
1.when "abstract" prifix given to class or method it becomes abstract.variable cannot be made abstract
2.if we do not implementation of abstract method in child class, child class becomes as abstract*/

abstract class Parent
{
	abstract void m1();
	//abstract int a=100; modifier abstract is not allowed in variable.
	void m2()
	{System.out.println("inside parent -m2 method");}
}
class Child extends Parent
{
	void m1()
	{System.out.println("inside child -m1 method");}
	void m2()
	{System.out.println("inside child -m2 method");}

	public static void main(String[]args)
	{
	Parent p= new Child();
	Child c1= new Child();
	p.m2();
	p.m1();
	//System.out.println(p.a);
	Child c=(Child)p;
	c.m2();
	}
}