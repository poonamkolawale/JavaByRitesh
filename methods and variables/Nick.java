class Nick
{
	int a=25;     // instance variable
	static  Nick refvar1, refvar2; //datatype-clasname,refvar1,2-reference variable
	public static void main(String[]args) //class
  {
	System.out.println("start"); //class , static variable,non-static method

	Nick.refvar1= new Nick();    //refvar1 is address of obj1
	System.out.println(Nick.refvar1.a); //25

	Nick.refvar2=Nick.refvar1; //assigned address of refvar1 = refvar2
	System.out.println(refvar1); // @ refvar1
	System.out.println(refvar2); //@ refvar2
	Nick.refvar2.a=300;         //a=300
	System.out.println(Nick.refvar1.a); //300
    System.out.println(Nick.refvar2.a);  //300
	System.out.println("stop");
   }
}

