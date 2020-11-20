package pk.cuiatd.dp.state;

//context
public class TV {
	private State state;
	
	//Constructor
	public TV(State initialState) {
		this.state = initialState;
	}
	//delegate the work to the specific state
	public void doAction(){
		state.doAction();
	}
	public void changeState(State newState){
		this.state = newState;
	}
}
