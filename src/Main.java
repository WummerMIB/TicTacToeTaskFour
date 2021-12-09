import java.util.Scanner;

public class Main {

	private static int change;
	public static Board printBoard = new Board();

	public static void main(String[] args) {

		boolean winCondition = false;
		boolean correctPlace = false;
		System.out.println("Geben sie 1 um Zweispieler Modus zu aktivieren und 2 für den Computer");
		Scanner gameModeScanner = new Scanner(System.in);
		String gameMode = gameModeScanner.nextLine();
		printBoard = new Board();
		Player player1 = new Human();
		Player cpu = new Computer();
		Game gameRules = new Game();
		while (winCondition == false) {

			if (gameMode.equals("1")) {
				do {
					int humenInput = player1.play();
					correctPlace = false;
					correctPlace = gameRules.rightPlacement(printBoard.getGameboard(), 'X', humenInput);
					if (correctPlace == true) {
						printBoard.butInBoardXOrOAndPrintBoard('X', humenInput);
						winCondition = gameRules.winCondition(printBoard.getGameboard(), "Player1", winCondition);
					}
				} while (correctPlace == false);
				if (winCondition == true) {
					break;
				}
				do {
					int cpuInput = player1.play();
					correctPlace = false;
					correctPlace = gameRules.rightPlacement(printBoard.getGameboard(), 'X', cpuInput);
					if (correctPlace == true) {
						printBoard.butInBoardXOrOAndPrintBoard('O', cpuInput);
						winCondition = gameRules.winCondition(printBoard.getGameboard(), "Player2", winCondition);
					}
				} while (correctPlace == false);

			} else if (gameMode.equals("2")) {
				do {
					int humenInput = player1.play();
					correctPlace = false;
					correctPlace = gameRules.rightPlacement(printBoard.getGameboard(), 'X', humenInput);
					if (correctPlace == true) {
						printBoard.butInBoardXOrOAndPrintBoard('X', humenInput);
						winCondition = gameRules.winCondition(printBoard.getGameboard(), "Player", winCondition);
					}
				} while (correctPlace == false);

				do {
					int cpuInput = cpu.play();
					correctPlace = false;
					correctPlace = gameRules.rightPlacementWithoutPrint(printBoard.getGameboard(), 'X', cpuInput);
					if (correctPlace == true) {
						printBoard.butInBoardXOrOAndPrintBoard('O', cpuInput);
						winCondition = gameRules.winCondition(printBoard.getGameboard(), "Player", winCondition);
					}
				} while (correctPlace == false);
			}

		}

	}

}
