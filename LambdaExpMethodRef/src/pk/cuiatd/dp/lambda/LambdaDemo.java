package pk.cuiatd.dp.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.io.File;

public class LambdaDemo {
	public static void main(String[] args) {
		/*
		Expression Lambda
		The syntax () indicates no parameters.
		The arrow operator "->" separates method parameters from the lambda body.
	   	The statement System.out.println("Hello world") is the body of the lambda expression.
		 */
		MyInterface lambda1 = () -> System.out.println("Hello world - Expression Lambda");
		lambda1.call();

		// Block Lambda
		MyInterface lambda2 = () -> {
			for(int i = 0; i<3; i++)
				System.out.println("Hello world - Block Lambda");
		};
		lambda2.call();

		FileFilter filter = (File file) -> file.getName().endsWith("pdf");
		boolean result = filter.accept(new File("abc.pdf"));
		System.out.println(result);

		Runnable task = () -> System.out.println("Hello world from a thread: "+Thread.currentThread().getName());
		Thread t = new Thread(task);
		t.start();

		Comparator<String> comparator = (String s1, String s2) ->
		Integer.compare(s1.length(), s2.length());
		System.out.println(comparator.compare("hello", "HELLO"));

		Calculator calc = (int x, int y)-> x+y;
		System.out.println(calc.add(2, 3));

		Calculator2  calc2 = x->x*x;
		System.out.println(calc2.square(3));

		int a = 5;
		ITest test =() -> a;
		System.out.println(test.method());

		List<Integer> intSeq = Arrays.asList(1,2,3);
		//intSeq.forEach(x -> System.out.println(x));

		intSeq.forEach((Integer x) -> {
			int y = x * 2;
			System.out.println(y);
		});

	}
}
