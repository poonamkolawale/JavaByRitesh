class Vikash
{
	int a;
	float b;
	void m1(int a, float b) //passing local variable a=10,b=4.5f
    {
    System.out.println("inside m1 method");	
	System.out.println(a+b);
	System.out.println(this.a+this.b);
	//return this;
	}
	public static void main(String[]args)
	{
		Vikash v= new Vikash();
	    v.m1(10,4.5f); // local variable
		v.a=40;
		v.b=100.5f;
		v.m1(10,4.5f); // local variable
        //v.m1();
		}

}