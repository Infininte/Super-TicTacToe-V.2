package gameLogic;

/**
 * @author Infininte
 */

import java.util.Scanner;
//import gui.printBoard;
import gameLogic.littleBoard;
import gameLogic.winner;

public class bigBoard 
{
	public void play()
	{
		int turn;
		int move;
		int loop;
		String player = "X";
		
		littleBoard board1;
		
		winner win = new winner();
		Scanner input = new Scanner(System.in);
		littleBoard[] boards= new littleBoard[9];
		
		//All the smaller boards
		boards[0] = new littleBoard();
		boards[1] = new littleBoard();
		boards[2] = new littleBoard();
		boards[3] = new littleBoard();
		boards[4] = new littleBoard();
		boards[5] = new littleBoard();
		boards[6] = new littleBoard();
		boards[7] = new littleBoard();
		boards[8] = new littleBoard();
		
		//Pre-game input
		System.out.println("Choose small board: ");
		move = input.nextInt() % 10;
		board1 = boards[move - 1];
		
		//The main game play
		for(turn = 1 ; ; turn++)
		{
			System.out.println("Please choose the cell to move in: ");
			move = input.nextInt() % 10;
			board1.changeCells(move, player);
			
			for(loop = 0 ; loop < 9 ; loop++)
			{
				System.out.println("|" + loop + "|");
				this.print(boards[loop].getBoard());
			}
			
			if(win.decideWinner(board1.getBoard(), player) != "none")
			{
				System.out.println(player + "you won!");
			}
			
			board1 = boards[move - 1];
			
			//Changes the players every move
			if(turn % 2 == 0)
			{
				player = "X";
			}
			else if(turn % 2 == 1)
			{
				player = "O";
			}
		}
		
	}
	
	//This function prints any board given to it
	void print(String[] board)
	{
		int t = 0;
		while(t < 9)
		{
			System.out.println(board[t]);
			t++;
		}
	}
	
}



