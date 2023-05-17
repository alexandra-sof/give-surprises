package giveSurprises.tests;

import java.util.ArrayList;


import giveSurprises.bag.BagTypes;
import giveSurprises.gatherSurprises.GatherSurprises;
import giveSurprises.giveSurprise.GiveWithPassionTypes;
import giveSurprises.giveSurprise.AbstractGiveSurprises;
import giveSurprises.surprises.ISurprise;

public class Main {

	public static void generateAndGiveSurprises(GiveWithPassionTypes giveType, BagTypes bagType, int noSurprises,
			int waitTime) {
		AbstractGiveSurprises giveSurprises = AbstractGiveSurprises.generateGiveWithPassion(giveType, bagType,
				waitTime);
		ArrayList<ISurprise> surprises = GatherSurprises.gather(noSurprises);
		for (ISurprise surprise : surprises) {
			giveSurprises.put(surprise);
		}
		System.out.println("======================================================");
		System.out.println("Surprises gathered: ");
		giveSurprises.printBag();
		System.out.println("======================================================");
		System.out.println("Enjoy the surprises - " + giveSurprises.getBagType() + " - : ");
		giveSurprises.giveAll();
		// test give function on empty bag
		giveSurprises.give();
		System.out.println();
	}

	public static void main(String[] args) {
		generateAndGiveSurprises(GiveWithPassionTypes.APPLAUSE, BagTypes.FIFO, 5, 1);
		generateAndGiveSurprises(GiveWithPassionTypes.HUG, BagTypes.RANDOM, 5, 1);
		generateAndGiveSurprises(GiveWithPassionTypes.SING, BagTypes.LIFO, 5, 1);

	}
}
