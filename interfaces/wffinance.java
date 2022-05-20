interface Wellsfargo
{
	void banking();
	void insurance();
	void finance();
}
abstract class wfbanking implements Wellsfargo //interface to class--> implements
{
	public void banking()    // same access level.. one comple 2 incomplete
	{System.out.println("inside banking");}
}
abstract class wfinsurance extends wfbanking // class to class-->extends
{
	public void insurance()  // 2 complete 1 incomplete
	{System.out.println("inside insurance");}

}
class wffinance extends wfinsurance // normal class 3 complete
{
	public void finance()
	{System.out.println("inside finance");}
	public static void main(String[]args)
	{
	Wellsfargo wf=new wffinance();
	wf.banking(); wf.insurance(); wf.finance();
	}

}