import java.util.Random;

public class Computer extends Player {

	
	public int play() {
		Random randNum = new Random();
		int change = randNum.nextInt(9) + 1;
		return change;
	}
	


}
