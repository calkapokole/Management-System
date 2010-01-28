package model;

public class NoneState extends None implements State {
	private static final long serialVersionUID = 6671892246336916699L;
	private final String name = "None state";

	@Override
	public void next(StateContext stateContext) {
		stateContext.setState(new InProgressState());
	}

	@Override
	public void prev(StateContext stateContext) {
		throw new IllegalStateException("There is not prev state before None");
	}

	public String getName() {
		return name;
	}

}
