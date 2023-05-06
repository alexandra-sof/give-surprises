package giveSurprises.tests;

import java.util.ArrayList;

import giveSurprises.bag.BagFactory;
import giveSurprises.bag.BagTypes;
import giveSurprises.bag.IBag;
import giveSurprises.gatherSurprises.GatherSurprises;
import giveSurprises.giveSurprise.GiveSurpriseAndApplause;
import giveSurprises.giveSurprise.GiveSurpriseAndHug;
import giveSurprises.giveSurprise.GiveSurpriseAndSing;
import giveSurprises.giveSurprise.AbstractGiveSurprises;
import giveSurprises.surprises.ISurprise;

public class Main {

	public static void main(String[] args) {
		AbstractGiveSurprises giveAndHug=new GiveSurpriseAndHug(BagTypes.FIFO, 1);
		int n=5;
		ArrayList<ISurprise> surprises=GatherSurprises.gather(n);
		System.out.println("======================================================");
		System.out.println("Surprises gathered: ");
		for(ISurprise surprise:surprises) {
			System.out.println(surprise);
			giveAndHug.put(surprise);
		}
		System.out.println("======================================================");
		System.out.println("Enjoy the surprises /FIFO/ : ");
		giveAndHug.giveAll();
		giveAndHug.give();
		
		System.out.println("\n======================================================");
		AbstractGiveSurprises giveAndApplaud=new GiveSurpriseAndApplause(BagTypes.RANDOM, 1);
		surprises=GatherSurprises.gather(n);
		System.out.println("Surprises gathered: ");
		for(ISurprise surprise:surprises) {
			System.out.println(surprise);
			giveAndApplaud.put(surprise);
		}
		System.out.println("======================================================");
		System.out.println("Enjoy the surprises /RANDOM/ : ");
		giveAndApplaud.giveAll();
		giveAndApplaud.give();

		System.out.println("\n======================================================");
		AbstractGiveSurprises giveAndSing=new GiveSurpriseAndSing(BagTypes.LIFO, 1);
		BagFactory bagFactory=BagFactory.getFactory();
		IBag bagFifo=bagFactory.makeBag(BagTypes.FIFO);
		surprises=GatherSurprises.gather(n);
		for(ISurprise surprise:surprises) {
			System.out.println(surprise);
			bagFifo.put(surprise);
		}
		giveAndSing.put(bagFifo);
		System.out.println("======================================================");
		System.out.println("Enjoy the surprises /LIFO/ : ");
		giveAndSing.giveAll();
		giveAndSing.give();

	}

}
