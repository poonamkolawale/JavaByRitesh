class pk
 {
 	static int a;
	float b;
	public static void main(String[]args)
{
	pk d1= new pk();
	System.out.println(d1.a);
	System.out.println(d1.b);
	
	pk.a=10;
	d1.b=20.5f;
	System.out.println(pk.a);
	System.out.println(d1.b);
	
	pk d2= new pk();
	System.out.println(pk.a);
	System.out.println(d2.b);

	pk.a=100;
	d2.b=200.5f;
	System.out.println(pk.a);
	System.out.println(d1.b);
	System.out.println(d2.b);
}
 }










