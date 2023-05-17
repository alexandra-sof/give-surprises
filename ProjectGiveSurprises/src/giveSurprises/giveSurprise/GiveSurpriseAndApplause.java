package giveSurprises.giveSurprise;

import giveSurprises.bag.BagTypes;

public class GiveSurpriseAndApplause extends AbstractGiveSurprises {

	protected GiveSurpriseAndApplause(BagTypes bagType, int waitTime) {
		super(bagType, waitTime);
	}

	@Override
	public void giveWithPassion() {
		System.out.println("Loud applause to you… For it is in giving that we receive.");
	}

}
