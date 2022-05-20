//main method overloading--> priority String[]args

class Demo1
{
		public static void main(int a)
     {	System.out.println("inside int main method");}
		
		public static void main(String[]args)
     {	System.out.println("inside string  main method");
		main(10);}
}
