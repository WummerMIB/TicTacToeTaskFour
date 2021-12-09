import java.util.Scanner;

public class Main {

	private static int change;
	public static char[] gameboard = { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };

	public static void main(String[] args) {

		boolean winCondition = false;
		boolean correctPlace = false;
		System.out.println("Geben sie 1 um Zweispieler Modus zu aktivieren und 2 für den Computer");
		Scanner gameModeScanner = new Scanner(System.in);
		String gameMode = gameModeScanner.nextLine();

		while (winCondition == false) {
			Board printBoard = new Board();
			Player player1 = new Human();
			Player cpu = new Computer();
			Game gameRules = new Game();
			
			if (gameMode.equals("1")) {
				do {
					int humenInput = player1.play();
					correctPlace = false;
					correctPlace = gameRules.rightPlacement(gameboard, 'X', humenInput);
					if (correctPlace == true) {
						printBoard.butInBoardXOrOAndPrintBoard(gameboard, 'X', humenInput);
						winCondition = gameRules.winCondition(gameboard, "Player1", winCondition);
					}
				} while (correctPlace == false);
				if(winCondition == true) {
					break;
				}
				do {
					int cpuInput = player1.play();
					correctPlace = false;
					correctPlace = gameRules.rightPlacement(gameboard, 'X', cpuInput);
					if (correctPlace == true) {
						printBoard.butInBoardXOrOAndPrintBoard(gameboard, 'O', cpuInput);
						winCondition = gameRules.winCondition(gameboard, "Player2", winCondition);
					}
				} while (correctPlace == false);

			} else if (gameMode.equals("2")) {
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

}
