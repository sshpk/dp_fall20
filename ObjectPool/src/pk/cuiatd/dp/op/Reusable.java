package pk.cuiatd.dp.op;

public class Reusable {
	
	boolean free = true;
	public String util() throws InstanceNotFreeException{
		if(free)
			return this.hashCode() + " rusable object";
		else throw (new InstanceNotFreeException());
	}
	public boolean isFree() {
		return free;
	}
	public void setFree(boolean free) {
		this.free = free;
	}
}
