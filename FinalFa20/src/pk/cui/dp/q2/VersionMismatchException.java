package pk.cui.dp.q2;

public class VersionMismatchException extends Exception {
	private static final long serialVersionUID = 4070484547587406857L;

	public VersionMismatchException(String message) {
		super(message);
	}
}
