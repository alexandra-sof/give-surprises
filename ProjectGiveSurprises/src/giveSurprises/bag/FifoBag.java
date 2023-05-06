package giveSurprises.bag;

import giveSurprises.surprises.ISurprise;

public class FifoBag extends AbstractBag {
	
	@Override
	public ISurprise takeOut() {
		if(!this.surprisesBag.isEmpty()) {
			return this.surprisesBag.remove(0);
		}
		return null;
	}


}
