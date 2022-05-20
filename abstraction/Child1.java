abstract class Parent1
{	static
	{System.out.println("inside static block-parent1");} //1
	{System.out.println("inside instance block-parent1");}//3
	Parent1()
	{this(10);System.out.println("inside cons-parent1");}//4
	Parent1(int a)
	{System.out.println("inside paramerized constractor"+a);}
	
	abstract void m1();
}
class Child1 extends Parent1
{	static
	{System.out.println("inside static block-child1");} //2
	{System.out.println("inside instance block-child1");}//5
	Child1()
	{this(20);System.out.println("inside const-child");}  //6
	Child1(int b)
	{System.out.println("inside child arg-2"  +b);}

	void m1()
	{System.out.println("inside child-m1 method");}
	void m2()
	{System.out.println("inside child -m2 method");}
	void m3()                                       //7,8
	{m1();
	m2();}
	public static void main(String[]args)
{	
	Child1 c= new Child1();
	c.m3();
	}
}
