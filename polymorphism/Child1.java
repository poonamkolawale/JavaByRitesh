/* method hiding is a process where child class method is hidden
   and preference is given to parent w.r.t static methods*/
   /* variable are the part of inheritance but not part 
   of polymorphism, hence it cannot be override*/ 

class Parent 
{
	int a=100;
	static void bikekeys()
       {System.out.println("inside parent-bikekeys");}
}
class Child1 extends Parent
{
	int a= 50;
	static void bikekeys()
       {System.out.println("inside Child-bikekeys");}
	public static void main(String[]args)
    {	Parent p= new Child1();
    	p.bikekeys(); // inside parent bikekeys
		Child1 c= (Child1)p;
		c.bikekeys(); // inside child bikekeys
		System.out.println(p.a); // 100
		System.out.println(c.a); // 50
		System.out.println(p);   //Child1@6bc168e5
		System.out.println(c);   //Child1@6bc168e5
     }
}
