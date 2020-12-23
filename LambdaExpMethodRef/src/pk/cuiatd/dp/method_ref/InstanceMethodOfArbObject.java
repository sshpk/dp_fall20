package pk.cuiatd.dp.method_ref;

import java.util.Arrays;

public class InstanceMethodOfArbObject {
	public static void main(String[] args) {
		String[] stringArray = { "Steve", "Rick", "Aaron", "Negan", "Lucy", "Samuel", "Jon"};
		/* Method reference to an instance method of an arbitrary 
		 * object of a particular type
		 */
		Arrays.sort(stringArray, String::compareToIgnoreCase);
		for(String str: stringArray){
			System.out.println(str);
		}
	}
}
