package TicTacToe;

import java.util.Scanner;

public class HumanPlayer extends Player{

	public HumanPlayer(String name, char mark) {
		super(name, mark);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		if (board.xWins() == false && board.oWins() == false && board.isFull() == false)
		{
			System.out.println(mark + " Players turn");
			makeMove();
			board.display();
			if (board.xWins())
			{
				System.out.println(mark + " " + name + " Wins!");
				return;
			}
			if (board.oWins())
			{
				System.out.println(mark + " " + name + " Wins!");
				return;
			}
			if (board.isFull())
			{
				System.out.println("The game resulted in a tie!");
				return;
			}
			opponent.play();
		}
	}

	@Override
	public void makeMove() {
		// TODO Auto-generated method stub
		String row;
		String column;
		Scanner scan = new Scanner(System.in);
		System.out.println(name + " please enter the row you would like to put your mark in.");
		row = scan.nextLine();
		System.out.println(name + " please enter the column you would like to put your mark in.");
		column = scan.nextLine();
		if (board.checkSpot(Integer.parseInt(row), Integer.parseInt(column)) == false)
		{
			System.out.println("Make sure you are putting your mark in an empty slot.");
			makeMove();
			return;
		}
		
		board.addMark(Integer.parseInt(row), Integer.parseInt(column), mark);
	}

}
