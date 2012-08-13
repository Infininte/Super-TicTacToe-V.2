package gameLogic;

/** @author Infininte
 * 
 * This hasn't changed much. It
 *     tries every possible winning
 *     combination.
 **/

public class winner 
{
	public String decideWinner(String[] cells, String move)
	{
		
		if (cells[6] == move && cells[7] == move && cells[8] == move && cells[6] != "none" && cells[7] != "none" && cells[8] != "none")
		{
			return move;
		}
		else if (cells[3] == move && cells[4] == move && cells[5] == move && cells[3] != "none" && cells[4] != "none" && cells[5] != "none")
		{
			return move;
		}
		else if (cells[0] == move && cells[1] == move && cells[2] == move && cells[0] != "none" && cells[1] != "none" && cells[2] != "none")
		{
			return move;
		}
		else if (cells[6] == move && cells[3] == move && cells[0] == move && cells[6] != "none" && cells[3] != "none" && cells[0] != "none")
		{
			return move;
		}
		else if (cells[7] == move && cells[4] == move && cells[1] == move && cells[7] != "none" && cells[4] != "none" && cells[1] != "none")
		{
			return move;
		}
		else if (cells[8] == move && cells[5] == move && cells[2] == move && cells[8] != "none" && cells[5] != "none" && cells[2] != "none")
		{
			return move;
		}
		else if (cells[6] == move && cells[4] == move && cells[2] == move && cells[6] != "none" && cells[4] != "none" && cells[2] != "none")
		{
			return move;
		}
		else if (cells[8] == move && cells[4] == move && cells[0] == move && cells[8] != "none" && cells[4] != "none" && cells[0] != "none")
		{
			return move;
		}
		else
		{
			return "none";
		}		
	}
}
