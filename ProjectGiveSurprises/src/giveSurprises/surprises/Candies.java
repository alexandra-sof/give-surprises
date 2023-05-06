package giveSurprises.surprises;

import java.util.Random;

public class Candies implements ISurprise{
	private int candyNb;
	private String candyType;
	private static String[] typesOfCandies={"chocolate", "jelly", "fruits", "vanilla"};
	private final static Random rand=new Random();	
	private final static int maximumNbOfCandies=50;
	
	public static Candies generate() {
		int randomNbCandyNb=rand.nextInt(maximumNbOfCandies)+1;
		int randomNbCandyType=rand.nextInt(typesOfCandies.length);
		Candies candySurprise=new Candies(randomNbCandyNb, typesOfCandies[randomNbCandyType]);
		return candySurprise;
	}
	
	public Candies(int candyNb, String candyType) {
		this.candyNb=candyNb;
		this.candyType=candyType;
	}
	
	@Override
	public void enjoy() {
		if(this.candyNb==1) {
			System.out.println("Enjoy 1 delicious " + this.candyType + " candy!");
		} else {
			System.out.println("Enjoy " + this.candyNb + " delicious " + this.candyType + " candies!");
		}
	}
	
	@Override
	public String toString() {
		return "[Candies] number = " + this.candyNb + ", type = " + this.candyType;
	}

}
