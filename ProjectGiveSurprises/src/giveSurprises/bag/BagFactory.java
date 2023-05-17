package giveSurprises.bag;

public class BagFactory implements IBagFactory {
	private static BagFactory factory = null;

	private BagFactory() {

	}

	public static BagFactory getFactory() {
		if (BagFactory.factory == null) {
			BagFactory.factory = new BagFactory();
		}
		return factory;
	}

	public IBag makeBag(BagTypes type) {
		switch (type) {
		case FIFO:
			return new FifoBag();
		case LIFO:
			return new LifoBag();
		case RANDOM:
			return new RandomBag();
		default:
			return null;
		}
	}

}
