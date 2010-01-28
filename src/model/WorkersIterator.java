package model;

public abstract class WorkersIterator {
	protected int current;

	public abstract boolean hasNext();

	public abstract Worker getNext();

}
