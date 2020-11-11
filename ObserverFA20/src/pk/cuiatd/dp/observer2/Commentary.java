package pk.cuiatd.dp.observer2;

import java.util.ArrayList;

public class Commentary implements Publisher{
	ArrayList<Subscriber> subscribers = new ArrayList<Subscriber>();
	private String desc;
	
	@Override
	public void subsrcibe(Subscriber s) {
		if(!subscribers.contains(s)){
			subscribers.add(s);
		}
		
	}

	@Override
	public void unSubsrcibe(Subscriber s) {
		if(subscribers.contains(s)){
			subscribers.remove(s);
		}	
	}

	@Override
	public void notifySubscribers() {
		for(Subscriber s:subscribers){
			s.update(desc);
		}
		
	}

	public void setDesc(String desc) {
		this.desc = desc;
		notifySubscribers();
	}
}
