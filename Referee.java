package TicTacToe;

public class Referee {
	/**
	 * player class for both X-player and O-player.
	 *Board class for the board.
	 */
	private Player xPlayer;
	private Player oPlayer;
	private Board board;
	
	public Referee () {}
	
	public void runTheGame()
	{
		/**
		 * sets the opponent of the xPlayer as the oPlayer
		 * sets the opponent of the oPlayer as the xPlayer
		 * displays the board
		 * starts the game by asking xPlayer to make the first move.
		 */
		xPlayer.setOpponent(oPlayer);
		oPlayer.setOpponent(xPlayer);
		board.display();
		xPlayer.play();
		
	}
	public void setBoard(Board board)
	{
		/**
		 * sets the board as the argument passed by.
		 */
		this.board = board;
	}
	public void setoPlayer(Player oPlayer)
	{
		/**
		 * sets the oPlayer as the argument passed by.
		 */
		this.oPlayer = oPlayer;
	}
	public void setxPlayer(Player xPlayer)
	{
		/**
		 * sets the xPlayer as the argument passed by.
		 */
		this.xPlayer = xPlayer;
	}
}
