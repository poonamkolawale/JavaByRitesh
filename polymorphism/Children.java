//Rule 3-->overriding is possible with different class return type.
// note-->parent class method should have a parent return type and child class method should have child return type.
class parent 
{
	parent m1()
	{System.out.println("inside parent");
	return new parent();}
}
class Children extends parent
{
	Children m1()
	{System.out.println("inside children");
	return new Children();}
	public static void main(String[] args)
	{System.out.println("inside main method");
	Children c= new Children();
	c.m1();}
}
/* String classes & system classes are final ? why?
-->the methods available in string and system classes cannot be inherited to other class 
   and bydefault their behaviour doesn't change .so they are made as final.
   imp note--> co-varient return type where introduces in 1.5 version.