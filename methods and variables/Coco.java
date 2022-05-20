class Coco
{
	int a=25;
	static Coco refvar1, refvar2;
	public static void main(String[]args)
{
	System.out.println("start");
	
	Coco.refvar1= new Coco();
	System.out.println(Coco.refvar1.a);
	Coco.refvar2=Coco.refvar1;
	Coco.refvar2.a=300;
	
	System.out.println(Coco.refvar1.a);
	System.out.println(Coco.refvar2.a);
	System.out.println("stop");
}
}