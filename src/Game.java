public class Game {
	
	public static boolean winCondition(char[] gameboard, String player , boolean winCon) {

		// check in array on point 0, 1 and 2 if there is an X or O and returns winCone
		// true if true
		if (gameboard[0] == 'X' && gameboard[1] == 'X' && gameboard[2] == 'X'
				|| gameboard[0] == 'O' && gameboard[1] == 'O' && gameboard[2] == 'O') {

			System.out.println("Sieger " + player);
			winCon = true;
			return winCon;
		}
		if (gameboard[3] == 'X' && gameboard[4] == 'X' && gameboard[5] == 'X'
				|| gameboard[3] == 'O' && gameboard[4] == 'O' && gameboard[5] == 'O') {
			System.out.println("Sieger " + player);
			return winCon = true;
		}
		if (gameboard[6] == 'X' && gameboard[7] == 'X' && gameboard[8] == 'X'
				|| gameboard[6] == 'O' && gameboard[7] == 'O' && gameboard[8] == 'O') {
			System.out.println("Sieger " + player);
			return winCon = true;
		}
		if (gameboard[0] == 'X' && gameboard[3] == 'X' && gameboard[6] == 'X'
				|| gameboard[0] == 'O' && gameboard[3] == 'O' && gameboard[6] == 'O') {
			System.out.println("Sieger " + player);
			return winCon = true;
		}
		if (gameboard[1] == 'X' && gameboard[4] == 'X' && gameboard[7] == 'X'
				|| gameboard[1] == 'O' && gameboard[4] == 'O' && gameboard[7] == 'O') {
			System.out.println("Sieger " + player);
			return winCon = true;
		}
		if (gameboard[2] == 'X' && gameboard[5] == 'X' && gameboard[8] == 'X'
				|| gameboard[2] == 'O' && gameboard[5] == 'O' && gameboard[8] == 'O') {
			System.out.println("Sieger " + player);
			return winCon = true;
		}
		if (gameboard[0] == 'X' && gameboard[4] == 'X' && gameboard[8] == 'X'
				|| gameboard[0] == 'O' && gameboard[4] == 'O' && gameboard[8] == 'O') {
			System.out.println("Sieger " + player);
			return winCon = true;
		}
		if (gameboard[6] == 'X' && gameboard[4] == 'X' && gameboard[2] == 'X'
				|| gameboard[6] == 'O' && gameboard[4] == 'O' && gameboard[2] == 'O') {
			System.out.println("Sieger " + player);
			return winCon = true;
		}
		// if the array is full and no player won then Print that the game is a draw
		if (gameboard[0] != ' ' && gameboard[1] != ' ' && gameboard[2] != ' ' && gameboard[3] != ' '
				&& gameboard[4] != ' ' && gameboard[5] != ' ' && gameboard[6] != ' ' && gameboard[7] != ' '
				&& gameboard[8] != ' ') {
			System.out.println("Unentschieden");
			return winCon = true;
		}
		// if no one has won the game return false and continue the game;
		return winCon = false;
	}

	public static boolean rightPlacement(char[] gameboard, char changeSymbol, int change) {
		boolean rightPlace;
		// looks in array on the place from User Input if there is an X or O than return
		// that you can't place the symbol there
		if (gameboard[change - 1] == 'X' || gameboard[change - 1] == 'O') {
			System.out.println("Bitte setzen sie ihr Symbol wo noch kein Symbol ist");
			return rightPlace = false;
		}
		// if array is on user Input -1 empty than Print the Board and return rightPlace
		// true
		if (gameboard[change - 1] == ' ') {
			return rightPlace = true;
		}
		// method needs to return an boolean and if it return it in if condition than
		// you get an error
		return false;
	}
	
	public static boolean rightPlacementWithoutPrint(char[] gameboard, char changeSymbol, int change) {
		boolean rightPlace;
		// looks in array on the place from User Input if there is an X or O than return
		// that you can't place the symbol there
		if (gameboard[change - 1] == 'X' || gameboard[change - 1] == 'O') {
			return rightPlace = false;
		}
		// if array is on user Input -1 empty than Print the Board and return rightPlace
		// true
		if (gameboard[change - 1] == ' ') {
			return rightPlace = true;
		}
		// method needs to return an boolean and if it return it in if condition than
		// you get an error
		return false;
	}

}
