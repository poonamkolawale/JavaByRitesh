/* Rule--> 5. Non static methods or instance methods are bounded with objects 
             hence it is possible to override*/

class Parent
{
	void bikekeys()
      {	System.out.println("inside parent-bikekeys");}
	void minspeed()
      {	System.out.println("inside parent-minspeed");}

}
class child extends Parent
{
	void bikekeys()
      {	System.out.println("inside child-bikekeys");}
	void maxspeed()
      {	System.out.println("inside child-maxspeed");}

	public static void main(String[]args)
     {	Parent p= new child();
     	//p.bikekeys();// inside child-bikekeys
		p.minspeed();// inside parent -minspeed
		//p.maxspeed(); CE
		child c=(child)p;// inside child- bikekeys- downcasting
		c.bikekeys(); // inside child-bikekeys
		c.minspeed(); // inside parent-minspeed
		c.maxspeed();}// inside child -maxspeed
}