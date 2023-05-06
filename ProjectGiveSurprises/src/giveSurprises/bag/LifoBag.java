package giveSurprises.bag;

import giveSurprises.surprises.ISurprise;

public class LifoBag extends AbstractBag {

	@Override
	public ISurprise takeOut() {
		if(!this.surprisesBag.isEmpty()) {
			return this.surprisesBag.remove(this.surprisesBag.size()-1);
		} 
		return null;
	}

	
}
