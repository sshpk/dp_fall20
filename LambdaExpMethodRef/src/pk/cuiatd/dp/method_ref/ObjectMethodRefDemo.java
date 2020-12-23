package pk.cuiatd.dp.method_ref;

public class ObjectMethodRefDemo {  
	public interface Calculator{  
		void addAndPrint(int x, int y);  
	}
	public void sumAndPrint(int a, int b){
		int c=a+b;
		System.out.println(a+"+"+b+"="+c);
	}  
	public static void main(String[] args) {  
		ObjectMethodRefDemo methodReference = new ObjectMethodRefDemo();  
		Calculator calc = methodReference::sumAndPrint;  
		calc.addAndPrint(4,3);    
		Calculator calc2 = methodReference::sumAndPrint;  
		calc2.addAndPrint(9,3);
		
	}

}  
