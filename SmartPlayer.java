package TicTacToe;

public class SmartPlayer extends BlockingPlayer{

	public SmartPlayer(String name, char mark) {
		super(name, mark);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void play()
	{
		if (board.xWins() == false && board.oWins() == false && board.isFull() == false)
		{
			System.out.println(mark + " Players turn");
			if (testForWin() == false)
			{
				if (testForBlocking() == false)
				{
					makeMove();
				}
			}
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
	public boolean testForWin()
	{
		int r, c;
		for(r = 0; r < 3; r++) {
			for(c = 0; c < 3; c++) {
				Board tempBoard = new Board(board);
				if(tempBoard.checkSpot(r, c))
					tempBoard.addMark(r, c, mark);
				if(tempBoard.checkWinner(mark) == 1) {
					board.addMark(r, c, mark);
					return true;
				}			
			}
		}
		return false;
	}
}
