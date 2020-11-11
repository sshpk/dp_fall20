package pk.cuiatd.dp.observer1;

public interface Publisher {
	void subscribe(Subscriber s);
	void unscubscribe(Subscriber s);

}
