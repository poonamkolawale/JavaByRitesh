//constractor overloading--> 0ne class

class sample
{
	sample(boolean x)
    {	System.out.println("inside boolean arg");}
    	sample(int a)
    {	System.out.println("inside int arg");}
    	sample(int a, float b)
    {	System.out.println("inside int, float arg");}
    	public static void main(String[]args)
	{	new sample(30);
		new sample(30,30.5f);
		new sample(true);
		}
	}
