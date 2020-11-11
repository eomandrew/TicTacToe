package TicTacToe;
import java.util.Scanner;
public abstract class Player {
	/**
	 * holds the name of the player
	 */
	protected String name;
	/**
	 * class of type Board
	 */
	protected Board board;
	/**
	 * holds the information of the opponent.
	 */
	protected Player opponent;
	/**
	 * holds the character of the player.
	 */
	protected char mark;
	public abstract void play();
	public abstract void makeMove();
	
	public Player(String name, char mark)
	{
		/**
		 * Player constructor that sets the name and mark of the player.
		 */
		this.setName(name);
		this.setMark(mark);
	}
	public void setOpponent(Player person)
	{
		/**
		 * initializes the opponent to the argument passed.
		 */
		this.opponent = person;
	}
	public void setBoard(Board theBoard)
	{
		/**
		 * initializes the board to the board passed as an argument.
		 */
		this.board = theBoard;
		
	}
	public String getName() {
		/**
		 * returns the name of the player.
		 */
		return name;
	}
	public void setName(String name) {
		/**
		 * sets the name of the player to the argument.
		 */
		this.name = name;
	}
	public char getMark() {
		/**
		 * returns the mark of the player.
		 */
		return mark;
	}
	public void setMark(char mark) {
		/**
		 * sets the mark of the player to the argument passed by.
		 */
		this.mark = mark;
	}
//	/**
//	 * tests to see if the board is full and if no one has won yet.
//	 * if the game is still going, it calls the makeMove method which scans in user input in order
//	 * to determine where their mark should be.
//	 * After it then updates the board and checks if anyone has won.
//	 * if no one has won yet, it calls the opponents turn.
//	 */
//	if (board.xWins() == false && board.oWins() == false && board.isFull() == false)
//	{
//		System.out.println(mark + " Players turn");
//		makeMove();
//		board.display();
//		if (board.xWins())
//		{
//			System.out.println(mark + " " + name + " Wins!");
//			return;
//		}
//		if (board.oWins())
//		{
//			System.out.println(mark + " " + name + " Wins!");
//			return;
//		}
//		if (board.isFull())
//		{
//			System.out.println("The game resulted in a tie!");
//			return;
//		}
//		opponent.play();
	
//	{
//		/**
//		 * scans in user input in order to put the players mark in the correct spot.
//		 */
//		String row;
//		String column;
//		Scanner scan = new Scanner(System.in);
//		System.out.println(name + "please enter the row you would like to put your mark in.");
//		row = scan.nextLine();
//		System.out.println(name + " please enter the column you would like to put your mark in.");
//		column = scan.nextLine();
//		board.addMark(Integer.parseInt(row), Integer.parseInt(column), mark);
//	}
}
