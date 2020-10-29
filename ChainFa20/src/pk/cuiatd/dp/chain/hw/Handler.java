package pk.cuiatd.dp.chain.hw;

public interface Handler {
	void setNext(Handler next);
	void handle(File file);
	String getName();
}
