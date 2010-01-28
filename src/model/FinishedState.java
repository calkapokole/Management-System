package model;

public class FinishedState implements State {
	private static final long serialVersionUID = -7451651982000319939L;
	private final String name = "Finished";

	@Override
	public void next(StateContext stateContext) {
		throw new IllegalStateException("There is not next state after finished");
	}

	@Override
	public void prev(StateContext stateContext) {
		stateContext.setState(new InProgressState());
	}
	
	public String getName() {
		return name;
	}

}
