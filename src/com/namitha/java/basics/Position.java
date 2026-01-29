package com.namitha.java.basics;

public class Position {
	
	private final int quantity;
	
	/*
	 * When quantity > 0 --> LONG
	 * When quantity == 0 --> FLAT
	 * When quantity < 0 --> SHORT
	 * */
	
	public Position(int quantity) {
		this.quantity = quantity;
	}
	
	public int quantity() {
		return quantity;
	}
	
	public boolean isLong() {
		return quantity > 0;
	}
	
	public boolean isShort() {
		return quantity < 0;
	}
	
	public boolean isFlat() {
		return quantity == 0;
	}


}
