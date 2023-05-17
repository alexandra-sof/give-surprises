package giveSurprises.bag;

import giveSurprises.random.RandomGenerator;
import giveSurprises.surprises.ISurprise;

public class RandomBag extends AbstractBag {

	@Override
	public ISurprise takeOut() {
		if (!this.surprisesBag.isEmpty()) {
			int idx = RandomGenerator.generateRandomInt(this.surprisesBag.size());
			return this.surprisesBag.remove(idx);
		}
		return null;
	}

	@Override()
	public BagTypes getBagType() {
		return BagTypes.RANDOM;
	}

}
