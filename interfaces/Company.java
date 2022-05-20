interface it1
{
	interface it2 // if we implements only it1 then it will not throw an error of class become abstract
	{void m1();}
}
class Company implements it1.it2
{	public void m1(){System.out.println("inside m1 method");}
	public static void main(String[]args)
	{new Company().m1();}

}