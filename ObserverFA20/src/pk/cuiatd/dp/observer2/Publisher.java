package pk.cuiatd.dp.observer2;

public interface Publisher {
	void subsrcibe(Subscriber s);
	void unSubsrcibe(Subscriber s);
	void notifySubscribers();
}
