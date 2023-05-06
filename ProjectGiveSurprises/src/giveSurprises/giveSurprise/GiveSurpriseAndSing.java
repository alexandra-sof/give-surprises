package giveSurprises.giveSurprise;

import giveSurprises.bag.BagTypes;

public class GiveSurpriseAndSing extends AbstractGiveSurprises {
	
	public GiveSurpriseAndSing(BagTypes bag, int waitTime) {
		super(bag, waitTime);
	}

	@Override
	void giveWithPassion() {
		System.out.println("Singing a nice song, full of joy and genuine excitement…");
	}
}
