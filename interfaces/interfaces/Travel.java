package interfaces;
interface Red
{
	void colour();
}
interface Bus
{
	void auto();
}
  class Travel implements Red, Bus
{	public  void colour()
	{System.out.println("inside colour");}
	public  void auto()
	{System.out.println("inside auto");}
	public static void main(String[] args)
	{System.out.println("inside main");
	Red t= new Travel();
	t.colour();
	//t.auto();
	}
}