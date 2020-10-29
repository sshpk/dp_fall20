package pk.cuiatd.dp.chain.hw;

public abstract class BaseHandler implements Handler{
	protected Handler next;
	@Override
	public void setNext(Handler next) {
		this.next = next;
		
	}
	
}
