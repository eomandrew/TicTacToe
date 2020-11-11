package TicTacToe;


//STUDENTS SHOULD ADD CLASS COMMENTS, METHOD COMMENTS, FIELD COMMENTS 

/**
 * makes the board for the tic-tac-toe game and displays the board
 * checks to see if the board is full or if any of the players have won.
 * @author eoman
 * @version 1
 * @date 02/06/2020
 */
public class Board implements Constants {
	private static final boolean True = false;
	private static final boolean False = false;
	/**
	 * two-dimensional array that can be used as the board.
	 */
	private char theBoard[][];
	/**
	 * markcount to see how many spaces are filled on the board.
	 */
	private int markCount;

	public Board() {
		/**
		 * creates an empty board.
		 */
		markCount = 0;
		theBoard = new char[3][];
		for (int i = 0; i < 3; i++) {
			theBoard[i] = new char[3];
			for (int j = 0; j < 3; j++)
				theBoard[i][j] = SPACE_CHAR;
		}
	}
	public Board(Board b) {
		markCount = 0;
		theBoard = new char[3][];
		for (int i = 0; i < 3; i++) {
			theBoard[i] = new char[3];
			for (int j = 0; j < 3; j++)
				theBoard[i][j] = b.getBoard()[i][j];
		}
	}
	public char[][] getBoard(){
		return theBoard;
	}
	public char getMark(int row, int col) {
		/**
		 * returns the character at the specific part of the two-dimensional array.
		 */
		return theBoard[row][col];
	}
	public boolean isFull() {
		/**
		 * the board is full, so markcount equals 9.
		 */
		return markCount == 9;
	}

	public boolean xWins() {
		/**
		 * checks to see if x player wins.
		 */
		if (checkWinner(LETTER_X) == 1)
			return true;
		else
			return false;
	}

	public boolean oWins() {
		/**
		 * checks to see if o player wins.
		 */
		if (checkWinner(LETTER_O) == 1)
			return true;
		else
			return false;
	}

	public void display() {
		/**
		 * displays the board.
		 */
		displayColumnHeaders();
		addHyphens();
		for (int row = 0; row < 3; row++) {
			addSpaces();
			System.out.print("    row " + row + ' ');
			for (int col = 0; col < 3; col++)
				System.out.print("|  " + getMark(row, col) + "  ");
			System.out.println("|");
			addSpaces();
			addHyphens();
		}
	}

	public void addMark(int row, int col, char mark) {
		/**
		 * increments markcount and fills the board with the mark.
		 */
		
		theBoard[row][col] = mark;
		markCount++;
	}

	public void clear() {
		/**
		 * clears the board and sets markcount to 0.
		 */
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				theBoard[i][j] = SPACE_CHAR;
		markCount = 0;
	}

	int checkWinner(char mark) {
		/**
		 * checks to see if a player has won.
		 */
		int row, col;
		int result = 0;

		for (row = 0; result == 0 && row < 3; row++) {
			int row_result = 1;
			for (col = 0; row_result == 1 && col < 3; col++)
				if (theBoard[row][col] != mark)
					row_result = 0;
			if (row_result != 0)
				result = 1;
		}

		
		for (col = 0; result == 0 && col < 3; col++) {
			int col_result = 1;
			for (row = 0; col_result != 0 && row < 3; row++)
				if (theBoard[row][col] != mark)
					col_result = 0;
			if (col_result != 0)
				result = 1;
		}

		if (result == 0) {
			int diag1Result = 1;
			for (row = 0; diag1Result != 0 && row < 3; row++)
				if (theBoard[row][row] != mark)
					diag1Result = 0;
			if (diag1Result != 0)
				result = 1;
		}
		if (result == 0) {
			int diag2Result = 1;
			for (row = 0; diag2Result != 0 && row < 3; row++)
				if (theBoard[row][3 - 1 - row] != mark)
					diag2Result = 0;
			if (diag2Result != 0)
				result = 1;
		}
		return result;
	}

	void displayColumnHeaders() {
		/**
		 * displays the column headers.
		 */
		System.out.print("          ");
		for (int j = 0; j < 3; j++)
			System.out.print("|col " + j);
		System.out.println();
	}

	void addHyphens() {
		/**
		 * creates the boundaries of the board.
		 */
		System.out.print("          ");
		for (int j = 0; j < 3; j++)
			System.out.print("+-----");
		System.out.println("+");
	}

	void addSpaces() {
		/**
		 * creates the boundaries of the board.
		 */
		System.out.print("          ");
		for (int j = 0; j < 3; j++)
			System.out.print("|     ");
		System.out.println("|");
	}
	public boolean checkSpot(int i, int j)
	{
		if (theBoard[i][j] == SPACE_CHAR)
		{
			return true;
		}
		else 
			return false;
	}
}
