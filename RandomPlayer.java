package TicTacToe;

public class RandomPlayer extends Player{

	protected RandomGenerator random;
	public RandomPlayer(String name, char mark) {
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
		random = new RandomGenerator();
		int row = random.discrete(0, 2);
		int col = random.discrete(0, 2);
		while (board.checkSpot(row, col) == false)
		{
			row = random.discrete(0, 2);
			col = random.discrete(0, 2);
		}
		board.addMark(row, col, mark);
	}

}
