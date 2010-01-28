package model;

import java.io.Serializable;

public interface State extends Serializable {
	public void prev(StateContext stateContext);

	public void next(StateContext stateContext);
	
	public String getName();
	
}
