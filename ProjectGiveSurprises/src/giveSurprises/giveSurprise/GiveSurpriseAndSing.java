package giveSurprises.giveSurprise;

import giveSurprises.bag.BagTypes;

public class GiveSurpriseAndSing extends AbstractGiveSurprises {

	protected GiveSurpriseAndSing(BagTypes bagType, int waitTime) {
		super(bagType, waitTime);
	}

	@Override
	public void giveWithPassion() {
		System.out.println("Singing a nice song, full of joy and genuine excitement…");
	}

}
