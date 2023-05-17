package giveSurprises.giveSurprise;

import giveSurprises.bag.BagTypes;

public class GiveSurpriseAndHug extends AbstractGiveSurprises {

	protected GiveSurpriseAndHug(BagTypes bagType, int waitTime) {
		super(bagType, waitTime);
	}

	@Override
	public void giveWithPassion() {
		System.out.println("Warm wishes and a big hug!");
	}

}
