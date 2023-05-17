package giveSurprises.surprises;

public abstract class AbstractSurprise implements ISurprise {
	
	public static AbstractSurprise generateSurprise(SurpriseTypes type) {
		switch (type) {
		case CANDIES:
			return Candies.generate();
		case FORTUNECOOKIE:
			return FortuneCookie.generate();
		case MINIONTOY:
		 default:
			return MinionToy.generate();
		}
	}
	


}
