import java.util.Random;

public class Computer extends Player {

	private int[] bestNum = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	Board copieOfGameBoard;
	
	public int play() {
		copieOfGameBoard = new Board();
		copieOfGameBoard = Main.printBoard;
		int change = playAgainstComputerOpponent();
		return change;
	}

	public int playAgainstComputerOpponent() {
		Game checkIfRight = new Game();
		for(int i = 0; i<=8;i++ ) {
			bestNum[i] = 0;
		}
		for (int i = 0; i <= 5; i++) {
			boolean correctPlace = false;
			do {
				Random randNum = new Random();
				int change = randNum.nextInt(9) + 1;
				int checkBestSolution = change - 1;
				correctPlace = checkIfRight.rightPlacementWithoutPrint(copieOfGameBoard.getGameboard(), 'X', change);
				if (correctPlace) {
					boolean winOrLoseAgainstPC = playAgainstWarGames(change);
					if (winOrLoseAgainstPC == true) {
						bestNum[checkBestSolution]++;
					}
				}
				copieOfGameBoard = Main.printBoard;
			} while (correctPlace == false);	
		}
		int posArray = 0;
		int highestNum = bestNum[0] ;
		for(int i = 1; i<=8; i++) {
			if (bestNum[i]>highestNum) {
				posArray = i;
				highestNum = bestNum[i];
			}	
		}
		return posArray+1;
	}

	public boolean playAgainstWarGames(int change) {
		boolean winCondition = false;
		boolean correctPlace;
		Board printBoard = new Board();
		Player cpu = new Computer();
		Game gameRules = new Game();
		correctPlace = gameRules.rightPlacementWithoutPrint(copieOfGameBoard.getGameboard(), 'O', change);
		printBoard.butInBoardXOrOWithoutPrintBoard('O', change);
		winCondition = gameRules.winCondition(copieOfGameBoard.getGameboard(), "CPU", winCondition);	
		if (winCondition == true) {
			return true;
		}

		while (winCondition == false) {

			do {
				Random randNum = new Random();
				change = randNum.nextInt(9) + 1;
				correctPlace = false;
				correctPlace = gameRules.rightPlacementWithoutPrint(copieOfGameBoard.getGameboard(), 'X', change);
				if (correctPlace == true) {
					printBoard.butInBoardXOrOWithoutPrintBoard('X', change);
					winCondition = gameRules.winCondition(copieOfGameBoard.getGameboard(), "CPU2", winCondition);
					if (winCondition == true) {
						System.out.println("hi");
						return false;
					}
				}
			} while (correctPlace == false);

			do {
				Random randNum = new Random();
				change = randNum.nextInt(9) + 1;
				correctPlace = false;
				correctPlace = gameRules.rightPlacementWithoutPrint(copieOfGameBoard.getGameboard(), 'O', change);
				if (correctPlace == true) {
					printBoard.butInBoardXOrOWithoutPrintBoard('O', change);
					winCondition = gameRules.winCondition(copieOfGameBoard.getGameboard(), "CPU", winCondition);
					if (winCondition == true) {
						System.out.println("hi");
						return true;
					}
				}
			} while (correctPlace == false);

		}
		return true;
	}
}
