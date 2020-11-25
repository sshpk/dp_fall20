package pk.cuiatd.fa20.assignment3;

public class Demo {

	public static void main(String[] args) {
		// create dungeon and members
	    Dungeon party = new DungeonImpl();
	    
	    OldWizard wizard = new OldWizard();
	    RogueWarrior rogueWarrior = new RogueWarrior();
	    BarbarianViking viking = new BarbarianViking();

	    // add dungeon members
	    party.addMember(wizard);
	    party.addMember(rogueWarrior);
	    party.addMember(viking);

	    // perform actions -> the other dungeon members
	    // are notified by the dungeon
	    System.out.println("++++++++++++++++++++++");
	    wizard.act(Action.CAST_SPELL);
	    System.out.println("++++++++++++++++++++++");
	    rogueWarrior.act(Action.SWORD);
	    System.out.println("++++++++++++++++++++++");
	    viking.act(Action.GOLD);

	}

}
