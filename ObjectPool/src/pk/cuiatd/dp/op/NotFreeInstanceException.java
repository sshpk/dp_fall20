package pk.cuiatd.dp.op;

public class NotFreeInstanceException extends Exception {
	private static final long serialVersionUID = 1L;
	public NotFreeInstanceException(){
		super("No free Reusable instance is available");
	}
}
