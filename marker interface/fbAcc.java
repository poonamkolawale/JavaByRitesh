class fbAcc
{
	public static void main(String[]args)
	{
	Facebook acc1=new Facebook(101,"Cyber");
	System.out.println(acc1.fbID);
	System.out.println(acc1.fbUN);
	Facebook acc2=(Facebook)acc1.clone();
	System.out.println(acc2.fbID);
	System.out.println(acc2.fbUN);
	System.out.println(acc1);
	System.out.println(acc2);
	}
}