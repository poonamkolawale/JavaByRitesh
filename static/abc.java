class Sample
{
	static int a;
	float b;
    static
     {	System.out.println("inside static block");
		System.out.println("inside static block"+ a);
		a=10;}
     {	System.out.println("inside non-static block");
		System.out.println("inside non-static block"+ b);}
     static int m1()
      {	System.out.println("inside m1 static method");
		return a+30;}
     Sample(int a, float b)
       {this();
		System.out.println("inside 2 arg const.");
		this.a=a;
		this.b=b;}
	Sample()
     {	System.out.println("inside static block");}
	Sample m2()
     {	System.out.println("inside m2 non-static method");
		return new Sample();}
     public static void main(String[]args)
     {	System.out.println("inside static block");
		int aa=Sample.m1();
     	System.out.println(aa);
		Sample ss= new Sample(100,200.5f).m2();
		System.out.println(ss);
		System.out.println(Sample.a);
		System.out.println(ss.b);
		System.out.println(ss.a);}
}
	
	


     
    