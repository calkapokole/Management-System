package model;

public class None {
	private static None self = new None();
	
	public None self() {
		return self;
	}
	public boolean isNull() {
		return true;
	}
	public boolean isEmpty() {
		return true;
	}
	public String toString() {
		return "None";
	}
	
}
