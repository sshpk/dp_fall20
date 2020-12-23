package pk.cuiatd.dp.method_ref;

import java.util.Arrays;
import java.util.List;

public class StaticMethodReference2 {
	public static void ThreadStatus(){  
		System.out.println("Thread is running...");  
	}  
	public static void main(String[] args) {  
		//Thread t2=new Thread(StaticMethodReference2::ThreadStatus);  
		Thread t2=new Thread(()->System.out.println("Thread is running..."));
		t2.start();  
		
		List<String> messages = Arrays.asList("hello", "students", "of", "bse 7a!");
		//messages.forEach(x->StringUtils.capitalize(x));
		messages.forEach(StringUtils::capitalize);
		//messages.forEach(System.out::println);
	}  
}
