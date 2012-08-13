package gameLogic;

public class littleBoard 
{
	String[] cells = new String[9];
	
	public void changeCells(int which, String what)
	{
		cells[which - 1] = what;
	}
	
	public String[] getBoard()
	{
		return(this.cells);
	}

}
