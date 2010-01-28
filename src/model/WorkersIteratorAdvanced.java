package model;

public class WorkersIteratorAdvanced extends WorkersIterator {
	MediaAdvanced m;
	
	public WorkersIteratorAdvanced(MediaAdvanced m) {
		this.m = m;
	}

	public boolean hasNext() {
		return true;
	}

	public Worker getNext() {
		return null;
	}
	
	public boolean removeCurrent() {
		return true;
	}

}
