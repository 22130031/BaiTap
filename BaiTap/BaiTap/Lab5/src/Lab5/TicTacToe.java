package Lab5;

public class TicTacToe {
	private static final char EMPTY = ' ';
	private char[][] board;

	public boolean checkRows() {
		for (int i = 0; i < board.length; i++) {
			int count = 0;
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == 'x') {
					count++;
				}
				if (count == 3)
					return true;
			}
		}
		for (int i = 0; i < board.length; i++) {
			int count = 0;
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == 'o') {
					count++;
				}
				if (count == 3)
					return true;
			}
		}

		return false;
	}

	public boolean checkColumns() {
		for (int i = 0; i < board[0].length; i++) {
			int count = 0;
			for (int j = 0; j < board.length; j++) {
				if (board[j][i] == 'x') {
					count++;
				}
				if (count == 3)
					return true;
			}
		}
		for (int i = 0; i < board[0].length; i++) {
			int count = 0;
			for (int j = 0; j < board.length; j++) {
				if (board[j][i] == 'o') {
					count++;
				}
				if (count == 3)
					return true;
			}
		}

		return false;
	}

	public boolean checkDiagonals() {
		for (int i = 0; i < board.length; i++) {
			if(board[i][i] == 'x') {
				return true;
			}
		}
		for (int i = 0; i < board.length; i++) {
			if(board[i][i] == 'o') {
				return true;
			}
		}
		return false;
	}
}
