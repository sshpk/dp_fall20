package pk.cuiatd.fa20.assignment2;

import java.util.Iterator;

public class KitchenOperator {
	private static KitchenOperator instance = null;
	private Kitchen kitchen;
	private KitchenOperator(){
		kitchen = new Kitchen();
		kitchen.addAppliance("Mixer");
		kitchen.addAppliance("Fuser");
		kitchen.addAppliance("StarPress");
		kitchen.addAppliance("Shell Assembler");
		kitchen.addAppliance("Unload Buffer");
	}
	public static KitchenOperator getInstance() {
		if(instance == null)
			instance = new KitchenOperator();
		return instance;
	}
	public void init(){
		Iterator<Appliance> iterator = kitchen.iterator();
		OnCommand onCmd;
		while(iterator.hasNext()){
			onCmd = new OnCommand(iterator.next());
			onCmd.execute();
		}
	}
	public void finish(){
		Iterator<Appliance> iterator = kitchen.iterator();
		OffCommand offCmd;
		while(iterator.hasNext()){
			offCmd = new OffCommand(iterator.next());
			offCmd.execute();
		}
	}
}
