package pk.cuiatd.dp.state.lab;

public class Context {
	 private State state;
	    
	    public Context() {
	        state = new LowerCaseState();
	    }

	    /**
	     * Set the current state.
	     * Normally only called by classes implementing the State interface.
	     * @param newState the new state of this context
	     */
	    void setState(State newState) {
	        state = newState;
	    }

	    public void writeName(String name) {
	        state.writeName(this, name);
	    }
}
