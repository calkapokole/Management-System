package model;

public class WorkersIteratorSimple extends WorkersIterator {
	Media m;
	
	public WorkersIteratorSimple(Media m) {
		this.m = m;
	}

	public boolean hasNext() {
		return true;
	}

	public Worker getNext() {
		return null;
	}

}
