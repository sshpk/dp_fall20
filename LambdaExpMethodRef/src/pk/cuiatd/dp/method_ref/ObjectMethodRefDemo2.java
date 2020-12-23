package pk.cuiatd.dp.method_ref;

import java.util.function.BiFunction;
class Arithmetic{
	public int add(int a, int b){
		return a+b;
	}
}
public class ObjectMethodRefDemo2 {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer>adder = new Arithmetic()::add;
		int num1 = 10, num2 = 20;
		int result = adder.apply(10, 20);
		System.out.println(num1+"+"+num2+"="+result);
	}
}

