package giveSurprises.gatherSurprises;

import java.util.ArrayList;

import giveSurprises.random.RandomGenerator;
import giveSurprises.surprises.AbstractSurprise;
import giveSurprises.surprises.ISurprise;
import giveSurprises.surprises.SurpriseTypes;

public final class GatherSurprises {

	private GatherSurprises() {
	}

	public static ArrayList<ISurprise> gather(int n) {
		ArrayList<ISurprise> surprises = new ArrayList<ISurprise>(n);
		for (int i = 0; i < n; i++) {
			surprises.add(GatherSurprises.gather());
		}
		return surprises;
	}

	public static ISurprise gather() {
		int nbSurpriseTypes = SurpriseTypes.values().length;
		int rndNb = RandomGenerator.generateRandomInt(nbSurpriseTypes);
		SurpriseTypes surpriseType = SurpriseTypes.values()[rndNb];
		return AbstractSurprise.generateSurprise(surpriseType);
	}

}
