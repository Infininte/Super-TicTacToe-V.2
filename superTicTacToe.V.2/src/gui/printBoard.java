package gui;

import gameLogic.bigBoard;
import gameLogic.littleBoard;

import java.awt.*;

import javax.swing.*;

public class printBoard extends JFrame
{
	Image background;
	Image O = new ImageIcon("C:\\test\\Blue_O.png").getImage();
	Image X = new ImageIcon("C:\\test\\Red_X.png").getImage();
	Graphics g;
	
	//calls all the little boards
	bigBoard bigB = new bigBoard();
	littleBoard littleB = new littleBoard();
	
	//This is where you place the sprites, the GUI will offset these
	//placements depending on the little board
	int[][] placement = {
			{0, 62},
			{31, 62},
			{61, 62},
			{0, 31},
			{31, 31},
			{61, 31},
			{0, 0},
			{31, 0},
			{61, 0}
	};
		
	int[][] offset = {
			{0, 203},
			{96, 203},
			{200, 203},
			{0, 102},
			{96, 102},
			{200, 102},
			{0, 29},
			{96, 29},
			{200, 29}
	};

	public void GUI()
	{
		this.setTitle("Super Tic Tac Toe");
		this.setVisible(true);
		this.setSize(300, 329);
	}
	
	public void paint(Graphics g)
	{
		background = new ImageIcon("C:\\test\\TicTacToe_background.jpg").getImage();
		g.drawImage(background, 0, 29, null);
	}
	
	public void printTheBoard(littleBoard[] boards)
	{
		int t = 0;
		while(t < 9)
		{
			String[] cells = boards[t].getBoard();
			int u = 0;
			while(u < 9)
			{
				int x_coord = placement[u][0] + offset[t][0];
				int y_coord = placement[u][1] + offset[t][1];
				
				if (cells[u] != null)
				{
					switch(cells[u])
					{
					case "O": g.drawImage(O, x_coord, y_coord, null);
								break;
					case "X": g.drawImage(X, x_coord, y_coord, null);
								break;
					default : break;
					}
				}
				u++;
			}
			t++;
		}
	}
}
