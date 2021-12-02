import java.util.Scanner;

public class Main {

	private static int change;
	public static char[] gameboard = { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };

	public static void main(String[] args) {

		boolean winCondition = false;

		do {
			Board printBoard = new Board();
			//Human humanPlayer = new Human();
			Player player1 = new Human();
			printBoard.butInBoardXOrOAndPrintBoard(gameboard, 'x', numberUserInput);
			Game winConditionGameObjekt = new Game();
			winCondition = winConditionGameObjekt.winCondition(gameboard, "Player", winCondition);
		} while (winCondition = true);

	}

}
