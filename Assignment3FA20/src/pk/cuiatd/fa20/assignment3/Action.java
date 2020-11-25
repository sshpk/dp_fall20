package pk.cuiatd.fa20.assignment3;

public enum Action {
	//sees in astonishment
	CAST_SPELL("casted a spell", "sees in astonishment", -7),
	GOLD("found gold", "fights for his share of the gold", -6),
	SWORD("draws his sword", "use his shield", -2),
	NONE("", "", 0);

	private String title;
	private String description;
	private int strengthRed;

	Action(String title, String description, int strengthRed) {
		this.title = title;
		this.description = description;
		this.strengthRed = strengthRed;
	}

	public String getDescription() {
		return description;
	}

	public String toString() {
		return title;
	}
	
	public int getStrengthReduction(){
		return strengthRed;
	}
}
