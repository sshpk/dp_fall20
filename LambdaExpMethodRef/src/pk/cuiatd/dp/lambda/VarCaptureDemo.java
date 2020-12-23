package pk.cuiatd.dp.lambda;

import java.util.Arrays;
import java.util.List;

public class VarCaptureDemo {
	private static int var = 100;
	public static void main(String[] args) {
		List<Integer> intSeq = Arrays.asList(1,2,3);
		intSeq.forEach(x -> System.out.println(x + var));
	}
}
