package pk.cui.dp.q1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo {

	public static void main(final String[] arguments) throws InterruptedException,
	ExecutionException {

		ExecutorService executor = Executors.newSingleThreadExecutor();

		System.out.println("Number Reversal Service called for 1234");
		Future<Integer> number1234 = executor.submit(new NumberReversalService(1234));

		System.out.println("Number Reversal Service called for 2076");
		Future<Integer> number2076 = executor.submit(new NumberReversalService(2076));

		Integer result1 = number1234.get();
		System.out.println("reverse(1234) = " + result1);

		Integer result2 = number2076.get();
		System.out.println("reverse(2076) = " + result2);

		executor.shutdown();
	}  

}
