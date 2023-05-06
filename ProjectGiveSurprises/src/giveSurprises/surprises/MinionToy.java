package giveSurprises.surprises;

public class MinionToy implements ISurprise {
	private Minions minionToy;
	private static int cnt=0;
	
	public static MinionToy generate() {
		MinionToy minionToy=new MinionToy(Minions.values()[cnt]);
		cnt++;
		if(cnt==Minions.values().length) {
			cnt=0;
		}
		return minionToy;
	}
	
	public MinionToy(Minions minionToy) {
		this.minionToy=minionToy;
	}
	
	@Override
	public void enjoy() {
		System.out.println("WHAT WHAAA? Have fun playing with " + this.minionToy.toString() + " minion toy!");
	}
	
	@Override
	public String toString() {
		return "[Minion] name = " + this.minionToy.toString();
	}

}
