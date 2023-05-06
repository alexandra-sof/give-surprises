package giveSurprises.giveSurprise;

import giveSurprises.bag.BagTypes;

public class GiveSurpriseAndApplause extends AbstractGiveSurprises{
	
	public GiveSurpriseAndApplause(BagTypes bag, int waitTime) {
		super(bag, waitTime);
	}

	@Override
	void giveWithPassion() {
		System.out.println("Loud applause to you… For it is in giving that we receive.");
	}
}
