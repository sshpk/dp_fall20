package pk.cuiatd.fa20.assignment2;

public class Appliance {
	private int id;
	private String name;
	private boolean status;
	public Appliance(int id, String name){
		this.id = id;
		this.name = name;
		this.status = false;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Appliance [id=" + id + ", name=" + name + "]";
	}
	
	public void on() {
		setStatus(true);
		System.out.println(this+" is turned on");
		
	}
	public void off() {
		setStatus(true);
		System.out.println(this+" is turned off");
		
	}
}
