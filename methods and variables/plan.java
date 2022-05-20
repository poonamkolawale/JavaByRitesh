 // PRINTING ADDRESS OF CLASS stud AND emp USING STATIC AND NON-STATIC METHOD OF OTHER CLASS(plan).
 
 class stud
 {}
 class emp
 {}
  class plan
{

	static stud m1() // static area ,return type-stud
	{
		stud s= new stud(); // obj1 for class stud
		System.out.println(s);
		return s;    
	}


	emp m2()      // non-static area, return type- emp
	{
		emp e= new emp(); // obj2 for class emp
		return e;
	}

	public static void main(String[]args)
	{
		stud s11= plan.m1(); // refer to the address of return stud
		System.out.println(s11); // prints address of obj1

		plan s= new plan();	
		emp e11= s.m2();
		System.out.println(e11);
        }
}