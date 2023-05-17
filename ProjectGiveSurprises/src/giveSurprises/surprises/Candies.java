package giveSurprises.surprises;

import giveSurprises.random.RandomGenerator;

public class Candies extends AbstractSurprise {
	private int candyNb;
	private String candyType;
	private static final String[] typesOfCandies = { "chocolate", "jelly", "fruits", "vanilla" };
	private static final int maximumNbOfCandies = 50;

	public static Candies generate() {
		int randomNbCandyNb = RandomGenerator.generateRandomInt(maximumNbOfCandies) + 1;
		int randomNbCandyType = RandomGenerator.generateRandomInt(typesOfCandies.length);
		Candies candySurprise = new Candies(randomNbCandyNb, typesOfCandies[randomNbCandyType]);
		return candySurprise;
	}

	private Candies(int candyNb, String candyType) {
		this.candyNb = candyNb;
		this.candyType = candyType;
	}

	@Override
	public void enjoy() {
		if (this.candyNb == 1) {
			System.out.println("Enjoy 1 delicious " + this.candyType + " candy!");
		} else {
			System.out.println("Enjoy " + this.candyNb + " delicious " + this.candyType + " candies!");
		}
	}

	@Override
	public String toString() {
		return "[Candies] number = " + this.candyNb + ", type = " + this.candyType;
	}

	@Override
	public SurpriseTypes getSurpriseType() {
		return SurpriseTypes.CANDIES;
	}
}
