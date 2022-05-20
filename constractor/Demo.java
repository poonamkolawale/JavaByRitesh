class Demo
{
	Demo()
  {	System.out.println("inside 0 arg constractor");}// 1.constractor executed during runtime
	Demo(int a)                                      //2.obj. are created during runtime.
   {this();	System.out.println("inside constractor 1"+a);}//3.const. are executed during runtime
	public static void main(String[]args)             // constrator are executed in stack area.
    {
	System.out.println("inside main method");
	new Demo(10);
	}
}