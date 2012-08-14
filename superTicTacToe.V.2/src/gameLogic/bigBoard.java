package gameLogic;

/**
 * @author Infininte
 */

import java.awt.Graphics;
import java.util.Scanner;
import gui.printBoard;
import gameLogic.littleBoard;
import gameLogic.winner;

public class bigBoard 
{
	littleBoard[] boards= {
		new littleBoard(),
		new littleBoard(),
		new littleBoard(),
		new littleBoard(),
		new littleBoard(),
		new littleBoard(),
		new littleBoard(),
		new littleBoard(),
		new littleBoard()
	};
	
	public void play()
	{
		int turn;
		int move;
		int loop;
		String player = "X";
		
		littleBoard board1;
		
		winner win = new winner();
		printBoard print = new printBoard();
		Scanner input = new Scanner(System.in);
		
		//Pre-game input
		print.GUI();
		
		System.out.println("Choose small board: ");
		move = input.nextInt() % 10;
		board1 = boards[move - 1];
		
		//The main game play
		for(turn = 1 ; ; turn++)
		{
			System.out.println("Please choose the cell to move in: ");
			move = input.nextInt() % 10;
			board1.changeCells(move, player);
			
			print.GUI();
			
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
	
	public littleBoard[] getBoardList()
	{
		return(boards);
	}
}



