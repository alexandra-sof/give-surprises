package giveSurprises.bag;

import giveSurprises.surprises.ISurprise;

public interface IBag {

	// adds a surprise in the bag
	void put(ISurprise newSurprise);

	// adds all the surprises from another IBag
	// -> the 'bagOfSurprises' will be empty() afterwards
	void put(IBag bagOfSurprises);

	// removes a surprise from the bag and returns it
	ISurprise takeOut();

	// Checks if the bag is empty or not
	boolean isEmpty();

	// Returns the type of the bag
	BagTypes getBagType();
	
	// prints the content of the bag
	void print();

}
