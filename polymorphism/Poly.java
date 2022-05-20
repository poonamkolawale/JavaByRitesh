class poly
{	public static void main(String[]args)
	{System.out.println("polymorphism");}
}
/* polymorphism- many or multiple forms
	An ability of object to change its behaviour into multiple form is called polymorphism.
	Types--->1.compile time/early binding/static binding.
	         2.runtime/late binding/dynamic binding.
   compile time polymorphism-->overloading--> method ,const, operator.
   runtime polymorphism--> overriding-->method , constracter, operator. 
   method overloading--> minimum one class is required. more than 1,2,3,4 possible
   						1.same method but diifferent no. of argument.
						2.same method but same no. of argument but vary in argument.
						note- main method can be overloaded. higher priority String[] args.
 constractor overloading--> min one class.constractor overloading is supported in a class of itself.
 operator overloading----->operator overloading is decided by java.
                            it support only plus(+) operator only.the operator with more than 
							one behavior is called operator overloading.ex 10+20+"cyber"+30+60
							= 30cyber3060.