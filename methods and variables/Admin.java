//PASS THE VARIABLE INTO STATIC AREA//

class Admin
{
	int x= 200;
	static int y=100;
	public static void main(String[]args)
 {
 	int a=10;
	float b=20.5f;
	float result2=Admin.test1(a,b);
	System.out.println("inside result"+result2);
	System.out.println("stop");
      }
	static float test1(int p,float q) /* float is return datatype// test1 (int p=stores value of int a,
	                                      float q=stores value of float b)*/
	{
 	System.out.println("inside test1");
	System.out.println(Admin.y);   //direct class name access to static variable.
	Admin a= new Admin();  // object for non-static variable.
	float result1= p+q+a.x;  // result1 is float datatype.
	return result1;          // return result1 to main method.
	}

}