package pk.cui.dp.lab.q2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo2 {
	static List<Flight> flights = new ArrayList<Flight>();

	public static void main(String[] args) {
		try(BufferedReader in = new BufferedReader(new FileReader("flights.txt"))) {
		    String str;
		    while ((str = in.readLine()) != null) {
		    	String[] tokens = str.split(",");
		    	Flight flight = new Flight();
		    	flight.setFlightNr(tokens[0]);
		    	flight.setDestination(tokens[1]);
		    	flight.setTime(tokens[2]);
		    	flight.setGate(tokens[3]);
		    	flight.setRemarks(tokens[4]);
		    	System.out.println(flight);
		    	/*List<String> t =Arrays.asList(tokens);
		    	t.forEach(x->System.out.print(x));
			    System.out.println("++++++++++");*/
		    }
		}
		catch (IOException e) {
		    System.out.println("File Read Error");
		}

	}

}
