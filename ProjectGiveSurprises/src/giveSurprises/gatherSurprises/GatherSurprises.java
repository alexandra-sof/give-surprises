package giveSurprises.gatherSurprises;

import java.util.ArrayList;
import java.util.Random;

import giveSurprises.surprises.Candies;
import giveSurprises.surprises.FortuneCookie;
import giveSurprises.surprises.ISurprise;
import giveSurprises.surprises.MinionToy;

public final class GatherSurprises {
	public static final Random rand=new Random();
	
	private GatherSurprises() {
	}
	
	public static ArrayList<ISurprise> gather(int n) {
		ArrayList<ISurprise> surprises=new ArrayList<ISurprise>(n);
		for(int i=0; i<n; i++) {
			surprises.add(GatherSurprises.gather());
		}
		return surprises;
	}
	
	public static ISurprise gather() {
		ISurprise surprise;
		int rndNb=rand.nextInt(3);
		if(rndNb==0) {
			surprise=FortuneCookie.generate();
		} else if(rndNb==1) {
			surprise=Candies.generate();
		} else {
			surprise=MinionToy.generate();
		}
		return surprise;
	}

}
