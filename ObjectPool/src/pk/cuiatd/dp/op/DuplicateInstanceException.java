package pk.cuiatd.dp.op;

public class DuplicateInstanceException extends Exception {
	private static final long serialVersionUID = 2L;
	public DuplicateInstanceException() {
		super("A duplicate instance of the Reusable class is found");
	}
}
