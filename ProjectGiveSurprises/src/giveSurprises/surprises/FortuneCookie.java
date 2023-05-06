package giveSurprises.surprises;

import java.util.Random;

public class FortuneCookie implements ISurprise {
	private String message;
	public static String[] messageArray = {"A fresh start will put you on your way.", 
											"A good time to finish up old tasks.",
											"Go take a rest, you deserve it.", 
											"Nature, time and patience are the three great physicians.",
											"There’s no such thing as an ordinary cat.", 
											"Welcome change.",
											"A new perspective will come with the new year.", 
											"A pleasant surprise is waiting for you.",
											"Believe it can be done.", 
											"Courtesy begins in the home.",
											"Disbelief destroys the magic.", 
											"Happy life is just in front of you.",
											"If you continually give, you will continually have.", 
											"Imagination rules the world.",
											"A faithful friend is a strong defense.", 
											"Allow compassion to guide your decisions.",
											"Believe it can be done.", 
											"You love chinese food.",
											"Resting well is as important as working hard.",
											"If certainty were truth, we would never be wrong."};
	private final static Random rand=new Random();	
	
	public static FortuneCookie generate() {
		int randomNb=rand.nextInt(messageArray.length);
		FortuneCookie fortuneCookie=new FortuneCookie(messageArray[randomNb]);
		return fortuneCookie;
	}
	
	public FortuneCookie(String message) {
		this.message=message;
	}

	@Override
	public void enjoy() {
		System.out.println("FORTUNE: * " + this.message + " *");
	}
	
	@Override
	public String toString() {
		return "[FortuneCookie] message = " + this.message;
	}
}
