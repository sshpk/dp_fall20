package pk.cuiatd.fa20.assignment2;

public class OffCommand implements Command{
	Appliance appliance;
	public OffCommand(Appliance appliance){
		this.appliance=appliance;
	}
	@Override
	public void execute() {
		appliance.off();

	}

}

