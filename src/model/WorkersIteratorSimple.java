package model;

public class WorkersIteratorSimple extends WorkersIterator {
	MediaSimple m;
	
	public WorkersIteratorSimple(MediaSimple m) {
		this.m = m;
	}

	public boolean hasNext() {
		return true;
	}

	public Worker getNext() {
		return null;
	}

}
