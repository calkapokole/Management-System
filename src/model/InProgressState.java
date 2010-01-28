package model;

public class InProgressState implements State {
	private static final long serialVersionUID = 8539062878230692746L;
	private final String name = "In progress";

	@Override
	public void next(StateContext stateContext) {
		stateContext.setState(new FinishedState());
	}

	@Override
	public void prev(StateContext stateContext) {
		stateContext.setState(new NoneState());
	}

	public String getName() {
		return name;
	}

}
