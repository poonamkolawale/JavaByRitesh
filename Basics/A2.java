// BYPASS VARIABLE INTO STATIC AREA

class A2
{
	static int a=10;
	public static void main(String[] args)
  {
  	int x=100;
	float y= 20.5f;
	float result2=A2.test(x,y);
	System.out.println("stop");
    }
   static float test(int a, float b)
    {
    	System.out.println("start");
	    float result1= a+b;
		System.out.println(result1);
		return result1;
	}


}