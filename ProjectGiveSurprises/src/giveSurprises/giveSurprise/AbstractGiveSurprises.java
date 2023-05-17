package giveSurprises.giveSurprise;

import java.util.concurrent.TimeUnit;

import giveSurprises.bag.BagFactory;
import giveSurprises.bag.IBag;
import giveSurprises.bag.IBagFactory;
import giveSurprises.bag.BagTypes;
import giveSurprises.surprises.ISurprise;

public abstract class AbstractGiveSurprises {
	private IBag bag;
	private int waitTime;
	private final IBagFactory bagFactory;

	public AbstractGiveSurprises(BagTypes bagType, int waitTime) {
		this.bagFactory = BagFactory.getFactory();
		this.bag = bagFactory.makeBag(bagType);
		this.waitTime = waitTime;
	}

	public static AbstractGiveSurprises generateGiveWithPassion(GiveWithPassionTypes type, BagTypes bagType,
			int waitTime) {
		switch (type) {
		case APPLAUSE:
			return new GiveSurpriseAndApplause(bagType, waitTime);
		case HUG:
			return new GiveSurpriseAndHug(bagType, waitTime);
		case SING:
		default:
			return new GiveSurpriseAndSing(bagType, waitTime);
		}
	}

	public void put(ISurprise newSurprise) {
		this.bag.put(newSurprise);
	}

	public void put(IBag bagOfSurprises) {
		this.bag.put(bagOfSurprises);
	}

	public void give() {
		if (this.isEmpty()) {
			this.emptyBagMessage();
			return;
		}
		this.bag.takeOut().enjoy();
		giveWithPassion();
	}

	public void giveAll() {
		if (this.isEmpty()) {
			this.emptyBagMessage();
			return;
		}
		while (!this.isEmpty()) {
			try {
				TimeUnit.SECONDS.sleep(this.waitTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.give();
		}
	}

	public boolean isEmpty() {
		return this.bag.isEmpty();
	}

	private void emptyBagMessage() {
		System.out.println("The bag is empty :(");
	}

	public abstract void giveWithPassion();

	public BagTypes getBagType() {
		return this.bag.getBagType();
	}

	public void printBag() {
		this.bag.print();
	}

}
