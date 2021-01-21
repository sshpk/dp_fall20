package pk.cui.dp.lab.q2;

public class Flight {
	private String flightNr = "";
	private String destination = "";
	private String time = "";
	private String gate = "";
	private String remarks = "";
	
	public Flight(){
		
	}

	public String getFlightNr() {
		return flightNr;
	}

	public void setFlightNr(String flightNr) {
		this.flightNr = flightNr;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getGate() {
		return gate;
	}

	public void setGate(String gate) {
		this.gate = gate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "Flight [flightNr=" + flightNr + ", destination=" + destination + ", time=" + time + ", gate=" + gate
				+ ", remarks=" + remarks + "]";
	}
	
}
