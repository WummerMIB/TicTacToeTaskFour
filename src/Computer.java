import java.util.Random;

public class Computer extends Player {

	
	public int play() {
		int change = playAgainstComputerOpponent();
		return change;
	}
	
	public int playAgainstComputerOpponent() {
		Random randNum = new Random();
		int change = randNum.nextInt(9) + 1;
		return change;
	}
}
