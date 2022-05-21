package interfaces;


/* interfaces have only declaration, only abstract methods, bydefault public and abstract*/

interface Parent // to make class interface prefix with keyword "interface"
{
	void m1();  // bydefault public and abstract method
}
class Child implements Parent // interface to class---> implements
{
	public void m1()         //same access level..if we use default then it will throw an error.
      {	System.out.println("inside m1 method-child");}
	public static void main(String[]args)
	{
		Parent p= new Child();
		p.m1();
	}
}
/* Why we cannot create an object of abstract class?
ans-->we cannot create object of abstract class.because if object creations would 
     have been supported. the non static members will be loaded in the memory ,once they are 
	 loaded with the help of reference .we can call these metods but eventually it will still not get
	 get executed as the the methods are incomplete. hence it would not make sense to create an object.

2.what if abstract classes cotain only complete methods? can we create object?
ans-->In future design of class go throgh changes.hence we cannot create object of abstract. */