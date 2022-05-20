class Demo3
{
	public static void main(String[]args)
	{
	String s1="poonam";
	String s2="Kolawale";
	String s3="poonam";
	System.out.println(s1==s2);
	System.out.println(s3==s2);
	System.out.println(s1==s3);
	String s11 =new String("poonam");
	String s22 =new String("kolawale");
	String s33 =new String("poonam");
	System.out.println(s11==s2);
	System.out.println(s33==s22);
	System.out.println(s11==s33);
	}
}