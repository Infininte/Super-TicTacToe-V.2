package gameLogic;

/**The little board is fairly simple
       All it needs to store are the 
       cells and who owns it
**/

public class littleBoard 
{
	//The cells players move in
	String[] cells = new String[9];
	
	//how bigBoard changes the cells
	public void changeCells(int which, String what)
	{
		cells[which - 1] = what;
	}
	
	//how other methods read the cells
	public String[] getBoard()
	{
		return(this.cells);
	}

}
