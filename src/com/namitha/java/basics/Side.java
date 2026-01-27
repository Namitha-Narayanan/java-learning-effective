package com.namitha.java.basics;

public enum Side {
//	BUY,
//	SELL
	
	
	BUY(1),
	SELL(-1);
	
	private final int direction;
	
	Side(int direction){
		this.direction = direction;
	}
	
	public int direction() {
		return direction;
	}
}


