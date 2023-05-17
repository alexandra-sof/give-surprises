package giveSurprises.bag;

import giveSurprises.surprises.ISurprise;

public class FifoBag extends AbstractBag {

	@Override
	public ISurprise takeOut() {
		if (this.surprisesBag.isEmpty()) {
			return null;
		}
		return this.surprisesBag.remove(0);
	}

	@Override()
	public BagTypes getBagType() {
		return BagTypes.FIFO;
	}

}
