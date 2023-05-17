package giveSurprises.random;

import java.util.Random;

public class RandomGenerator {
	private static final Random rand = new Random();

	public static int generateRandomInt(int limit) {
		return rand.nextInt(limit);
	}

}
