package giveSurprises.surprises;

public class MinionToy extends AbstractSurprise {
	private MinionTypes minionToy;
	private static int cnt = 0;

	public static MinionToy generate() {
		if (cnt == MinionTypes.values().length) {
			cnt = 0;
		}
		MinionToy minionToy = new MinionToy(MinionTypes.values()[cnt]);
		cnt++;
		return minionToy;
	}

	private MinionToy(MinionTypes minionToy) {
		this.minionToy = minionToy;
	}

	@Override
	public void enjoy() {
		System.out.println("WHAT WHAAA? Have fun playing with " + this.minionToy.toString() + " minion toy!");
	}

	@Override
	public String toString() {
		return "[Minion] name = " + this.minionToy.toString();
	}
	
	@Override
	public SurpriseTypes getSurpriseType() {
		return SurpriseTypes.MINIONTOY;
	}

}
