package giveSurprises.bag;

import java.util.ArrayList;

import giveSurprises.surprises.ISurprise;

public abstract class AbstractBag implements IBag {
	ArrayList<ISurprise> surprisesBag;

	public AbstractBag() {
		this.surprisesBag = new ArrayList<ISurprise>();
	}

	@Override
	public void put(ISurprise newSurprise) {
		if (newSurprise != null) {
			this.surprisesBag.add(newSurprise);
		}
	}

	@Override
	public void put(IBag bagOfSurprises) {
		while (!bagOfSurprises.isEmpty()) {
			this.put(bagOfSurprises.takeOut());
		}
	}

	@Override
	public boolean isEmpty() {
		if (this.surprisesBag.size() == 0 || this.surprisesBag == null) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (ISurprise surprise : surprisesBag) {
			sb.append(surprise).append("\n");
		}
		return sb.toString();
	}

	@Override
	public void print() {
		System.out.print(this.toString());
	}

}
