package pk.cuiatd.fa20.assignment3;

public abstract class MemberBase implements Member {
	protected Dungeon dungeon;
	protected int strength;

	@Override
	public void joinedParty(Dungeon dungeon) {
		this.strength = 20;
		System.out.println(this+" walks in the Dungeons & Dragons" );
		this.dungeon = dungeon;	
	}

	@Override
	public void partyAction(Action action) {
		this.strength+=action.getStrengthReduction();
		System.out.println(this+" "+action.getDescription());
		if(strength<10)
			System.out.println(this+ "  is about to die");
		
	}

	@Override
	public void act(Action action) {
		if (dungeon != null) {
			System.out.println(this+" "+action);
			dungeon.act(this, action);
		}
	}

	@Override
	public abstract String toString();

}
