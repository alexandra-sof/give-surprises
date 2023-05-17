package giveSurprises.bag;

import giveSurprises.surprises.ISurprise;

public class LifoBag extends AbstractBag {

	@Override
	public ISurprise takeOut() {
		if (this.surprisesBag.isEmpty()) {
			return null;
		}
		return this.surprisesBag.remove(this.surprisesBag.size() - 1);
	}

	@Override()
	public BagTypes getBagType() {
		return BagTypes.LIFO;
	}

}
