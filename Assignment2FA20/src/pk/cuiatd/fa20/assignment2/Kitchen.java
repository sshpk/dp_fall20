package pk.cuiatd.fa20.assignment2;

import java.util.Iterator;

public class Kitchen implements Iterable<Appliance>{
	private Appliance [] appliances = new Appliance [5];
	private int index;
	public void addAppliance(String name){
		int i = index++;
		appliances[i] = new Appliance(i,name);
	}
	public Appliance[] getAppliances(){
		return appliances;
	}
	@Override
	public Iterator<Appliance> iterator() {
		return new ApplianceIterator(appliances);
	}
	public class ApplianceIterator implements Iterator<Appliance>{
		private Appliance [] appliances;
		int pos;
		public ApplianceIterator(Appliance []appliances){
			this.appliances = appliances;
		}
		@Override
		public boolean hasNext() {
			if(pos >= appliances.length || appliances[pos] == null)
				return false;
			return true;
		}
		@Override
		public Appliance next() {
			return appliances[pos++];
		}
		@Override
		public void remove() {
			if(pos <=0 )
				throw new IllegalStateException("Illegal position");
			if(appliances[pos-1] !=null){
				for (int i= pos-1; i<(appliances.length-1);i++){
					appliances[i] = appliances[i+1];
				}
				appliances[appliances.length-1] = null;
			}
		}
	}
}
