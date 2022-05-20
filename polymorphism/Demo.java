//method overloading-to achieve overloading min one class is required

class Demo
{
	void m1(int a) // same method name but vary argument 
     {	System.out.println("inside int arg");}
     	void m1(float b)
     {	System.out.println("inside float arg");}
	void m1(boolean x, float y) // same method name diff argument
     {	System.out.println("inside 2 arg");}
    public static void main(String[]args)
     {	System.out.println("inside main");
     	Demo d1=new Demo();
		d1.m1(10);}
}
