package inheritance;


final class Parent 
{
	void m1()
	{System.out.println("inside final keyword");}
}
class Child extends Parent
{
	public static void main(String[]args)
{   Parent p= new Child();
	p.m1(); // final keyword is used to avoid inheritance of class.
}
}
