package pk.cuiatd.dp.builder;

public class GPSNavigator {
	private String route;
	
	public GPSNavigator() {
		this.route = "University Rd Abbottabad - Park Rd Islamabad";
	}
	public GPSNavigator(String route){
		this.route = route;
	}
	public String getRoute() {
		return route;
	}
}

