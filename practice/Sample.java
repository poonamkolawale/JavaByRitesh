class Stud{}
class Emp{}
class Sample
{
	static Stud m1()
	{ Stud s=new Stud();
	return s;}
	Emp m2()
	{Emp e=new Emp();
	return e;}
	public static void main(String[]args)
	{
	Stud s11= Sample.m1();
	System.out.println(s11);
	Sample s12=new Sample();
	Emp e11=s12.m2();
	System.out.println(e11);
	}
}