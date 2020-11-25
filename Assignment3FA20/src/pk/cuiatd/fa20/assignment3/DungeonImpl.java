package pk.cuiatd.fa20.assignment3;

import java.util.ArrayList;
import java.util.List;

public class DungeonImpl implements Dungeon{
	private final List<Member> members;

	public DungeonImpl() {
		members = new ArrayList<>();
	}

	@Override
	public void act(Member actor, Action action) {
		for (Member member : members) {
			if (!member.equals(actor)) {
				member.partyAction(action);
			}
		}
	}

	@Override
	public void addMember(Member member) {
		members.add(member);
		member.joinedParty(this);
	}
}
