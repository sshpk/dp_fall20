package pk.cuiatd.dp.op;

public class InstanceNotFreeException extends Exception {

	private static final long serialVersionUID = 3L;
	
	public InstanceNotFreeException() {
		super("The instance you are trying to access is not free");
	}

}
