package pk.cuiatd.dp.sess2.sol;

public class Context {
	private SortingStrategy strategy;

	public Context(SortingStrategy strategy) {
		this.strategy = strategy;
	}
	public void setStrategy(SortingStrategy strategy) {
		this.strategy = strategy;
	}
	public void sort(char arr[]){
		strategy.sort(arr);
	}
}
