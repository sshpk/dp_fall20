package pk.cuiatd.dp.method_ref;

import java.util.Arrays;
import java.util.List;


public class MethodRefDemo {

	public static void main(String[] args) {
		List<Integer> intSeq = Arrays.asList(1,2,3);
		//intSeq.forEach(x -> System.out.println(x));
		intSeq.forEach(System.out::println);
		
		Calculator  calc = x->System.out.println(x*x);
		//calc.squareAndPrint(5);
		intSeq.forEach(x->calc.squareAndPrint(x));
		//intSeq.forEach(calc::squareAndPrint);

	}

}
