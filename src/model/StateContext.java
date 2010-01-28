package model;

public class StateContext {
	private State myState;

	public StateContext() {
		setState(new NoneState());
	}

	public void setState(State stateName) {
		this.myState = stateName;
	}

	public State getState() {
		return myState;
	}

	public void next() {
		this.myState.next(this);
	}

	public void prev() {
		this.myState.prev(this);
	}

}
