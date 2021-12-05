import java.util.Scanner;

public class Main {

	private static int change;
	public static char[] gameboard = { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };

	public static void main(String[] args) {

		boolean winCondition = false;
		boolean correctPlace = false;
		
		while (winCondition = true) {
			Board printBoard = new Board();
			Player player1 = new Human();
			Player cpu = new Computer();
			Game gameRules = new Game();

			do {
				int humenInput = player1.play();
				correctPlace = false;
				correctPlace = gameRules.rightPlacement(gameboard, 'X', humenInput);
				if (correctPlace == true) {
					printBoard.butInBoardXOrOAndPrintBoard(gameboard, 'X', humenInput);
					winCondition = gameRules.winCondition(gameboard, "Player", winCondition);
				}
			} while (correctPlace == false);

			do {
				int cpuInput = cpu.play();
				correctPlace = false;
				correctPlace = gameRules.rightPlacement(gameboard, 'X', cpuInput);
				if (correctPlace == true) {
					printBoard.butInBoardXOrOAndPrintBoard(gameboard, 'O', cpuInput);
					winCondition = gameRules.winCondition(gameboard, "Player", winCondition);
				}
			} while (correctPlace == false);

		}

	}

}
