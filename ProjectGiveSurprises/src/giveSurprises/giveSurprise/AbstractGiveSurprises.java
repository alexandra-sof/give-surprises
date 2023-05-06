package giveSurprises.giveSurprise;

import java.util.concurrent.TimeUnit;

import giveSurprises.bag.BagFactory;
import giveSurprises.bag.BagTypes;
import giveSurprises.bag.IBag;
import giveSurprises.surprises.ISurprise;

public abstract class AbstractGiveSurprises {
	private IBag bag;
	private int waitTime;
	private static final BagFactory bagFactory=BagFactory.getFactory();
	
	public AbstractGiveSurprises(BagTypes bag, int waitTime) {
		this.bag=bagFactory.makeBag(bag);
		this.waitTime=waitTime;
	}
	
	public void put(ISurprise newSurprise) {
		this.bag.put(newSurprise);	
	}
	
	public void put(IBag surprises) {
		this.bag.put(surprises);
	}
	
	public void give() {
		if(!this.bag.isEmpty()) {
			this.bag.takeOut().enjoy();	
			giveWithPassion();
		} else {
			System.out.println("The bag is empty :(");
		}
	}
	
	public void giveAll() {
		if(this.bag.isEmpty()) {
			System.out.println("The bag is empty :(");
		} else {
			while(!this.bag.isEmpty()) {
				this.bag.takeOut().enjoy();
				giveWithPassion();
				if(this.bag.size()>0) {
					try {
						  TimeUnit.SECONDS.sleep(this.waitTime);
						} catch (InterruptedException e) {
						  e.printStackTrace();
						}
				}
			}
		}	
	}
	
	public boolean isEmpty() {
		return this.bag.isEmpty();
	}
	
	abstract void giveWithPassion();	

}
