package pk.cuiatd.fa20.assignment2;


public class OnCommand implements Command{
	Appliance appliance;
	public OnCommand(Appliance appliance){
		this.appliance=appliance;
	}
	@Override
	public void execute() {
		appliance.on();

	}
}

