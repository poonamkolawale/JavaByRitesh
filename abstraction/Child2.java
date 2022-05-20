abstract class Parent2
{
	int a= 100;
	Parent2()
       {System.out.println("inside cons parent"+a);
		a=300;}
}
class Child2 extends Parent2
{
	int a=200;            /* variables do not show polymorphic behaviour  */
	Child2()
       {System.out.println("inside cons child"+a);}
       public static void main(String[]args)
      {
      	Parent2 p= new Child2();// parent-100, child-200
		System.out.println(p.a);// 300
		Child2 c= new Child2(); // parent- 100, child-200
		System.out.println(c.a);// 200
	  }
}
