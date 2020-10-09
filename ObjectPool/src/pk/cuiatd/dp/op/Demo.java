package pk.cuiatd.dp.op;

public class Demo {

	public static void main(String[] args) {
		ReusablePool pool = ReusablePool.getInstance();
		Reusable r1, r2, r3;
		try{
		
		r1 = pool.acquireReusable();
		System.out.println(r1.util());
		
		r2 = pool.acquireReusable();
		System.out.println(r2.util());
		
			
		pool.releaseReusable(r2);
		
		r3 = pool.acquireReusable();
		System.out.println(r3.util());
		
		System.out.println(r2.util());
		
		}catch(Exception ex){
			ex.printStackTrace();
		}

	}

}
