
public class Board {
	// copie constructor
	public Board(Board obj) {
		for (int t = 0; t<9;t++) {
			gameboard[t] = obj.gameboard[t];
		}
	}
	// standart constructor
	public Board() {
		
	}
	
	
	public char[] gameboard = { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };
	
	public char[] getGameboard() {
		return gameboard;
	}

	public  void setGameboard(char[] gameboard) {
		this.gameboard = gameboard;
	}


	public void printTicTacToeBoard() {

		// Prints out the board and puts in the gameboard[x] and show the value in the
		// array on that place x
		System.out.println("[" + gameboard[0] + "][" + gameboard[1] + "][" + gameboard[2] + "]");
		System.out.println("[" + gameboard[3] + "][" + gameboard[4] + "][" + gameboard[5] + "]");
		System.out.println("[" + gameboard[6] + "][" + gameboard[7] + "][" + gameboard[8] + "]");
	}
	
	
	public void butInBoardXOrOAndPrintBoard(char changeSymbol , int change) {
		// switch for User Input if for example User Input is 2 then change array
		// Element one
		switch (change) {
		case 1:
			gameboard[0] = changeSymbol;
			break;
		case 2:
			gameboard[1] = changeSymbol;
			break;
		case 3:
			gameboard[2] = changeSymbol;
			break;
		case 4:
			gameboard[3] = changeSymbol;
			break;
		case 5:
			gameboard[4] = changeSymbol;
			break;
		case 6:
			gameboard[5] = changeSymbol;
			break;
		case 7:
			gameboard[6] = changeSymbol;
			break;
		case 8:
			gameboard[7] = changeSymbol;
			break;
		case 9:
			gameboard[8] = changeSymbol;
			break;
		}
		// after us set the Symbol print out the new board
		printTicTacToeBoard();
	}
	
	public void butInBoardXOrOWithoutPrintBoard(char[] gameboard, char changeSymbol , int change) {
		// switch for User Input if for example User Input is 2 then change array
		// Element one
		switch (change) {
		case 1:
			gameboard[0] = changeSymbol;
			break;
		case 2:
			gameboard[1] = changeSymbol;
			break;
		case 3:
			gameboard[2] = changeSymbol;
			break;
		case 4:
			gameboard[3] = changeSymbol;
			break;
		case 5:
			gameboard[4] = changeSymbol;
			break;
		case 6:
			gameboard[5] = changeSymbol;
			break;
		case 7:
			gameboard[6] = changeSymbol;
			break;
		case 8:
			gameboard[7] = changeSymbol;
			break;
		case 9:
			gameboard[8] = changeSymbol;
			break;
		}
	}
}
