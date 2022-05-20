class Facebook implements Cloneable 
{
	int fbID;
	String fbUN;
	Facebook(int fbID, String fbUN)
	{
	this.fbID=fbID;
	this.fbUN=fbUN;
	}
	 protected Object clone()
	{try	
	{return super.clone();}
	catch(CloneNotSupportedException cnse)
	{return this;}
	}
}