package giveSurprises.giveSurprise;

import giveSurprises.bag.BagTypes;

public class GiveSurpriseAndHug extends AbstractGiveSurprises {
	
	public GiveSurpriseAndHug(BagTypes bag, int waitTime) {
		super(bag, waitTime);
	}

	@Override
	void giveWithPassion() {
		System.out.println("Warm wishes and a big hug!");
	}
}
