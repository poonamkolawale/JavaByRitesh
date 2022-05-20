class Demo1
{
	static int a=100;
	public static void main(String[]args)
	{
	int x=200;
	float y=10.5f;
	float result2=Demo1.test(x,y);
	System.out.println(result2);
	System.out.println("stop");


	}
	static float test(int a,float b)
	{
	System.out.println("inside static method");
	System.out.println(Demo1.a);
	float result1=a+b;
	return result1;


	}
}