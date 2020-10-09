package pk.cuiatd.dp.op.task;

import java.util.UUID;

public class ExpensiveResourcePool<T> extends ObjectPool<T> {

	public ExpensiveResourcePool(int size) {
		super(size);
	}

	@Override
	public T createNew() {
		//return an object with random name
		return (T) new ExpensiveResource(UUID.randomUUID().toString());
	}

}