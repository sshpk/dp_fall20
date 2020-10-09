package pk.cuiatd.dp.op;

import java.util.Vector;

public class ReusablePool {
	private static  ReusablePool instance;
	private Vector<Reusable> reusables;

	private ReusablePool(int size){
		reusables = new Vector<Reusable>(size);
		for (int i=0; i<size; i++){
			reusables.add(new Reusable());
		}
	}
	public static ReusablePool getInstance(){
		if(instance == null){
			instance = new ReusablePool(2);
		}
		return instance;
	}
	public Reusable acquireReusable() throws NotFreeInstanceException{
		if(reusables.size()>0){
			Reusable r = reusables.lastElement();
			reusables.remove(r);
			return r;
		}
		else{
			throw (new NotFreeInstanceException());
		}
		
	}
	public void releaseReusable(Reusable reusable) throws DuplicateInstanceException{
		if(reusables.contains(reusable)==false){
			reusables.add(reusable);
			reusable.setFree(true);
		}
		else{
			throw (new DuplicateInstanceException());
		}
	}
	
}
