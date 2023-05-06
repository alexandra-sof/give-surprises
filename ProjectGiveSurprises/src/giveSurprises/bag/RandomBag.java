package giveSurprises.bag;

import java.util.Random;

import giveSurprises.surprises.ISurprise;

public class RandomBag extends AbstractBag {
	private static final Random rand=new Random();
	
	@Override
	public ISurprise takeOut() {
		if(!this.surprisesBag.isEmpty()) {
			int idx=rand.nextInt(this.surprisesBag.size());
			return this.surprisesBag.remove(idx);
		}
		return null;
	}
	
}
