package com.namitha.java.basics;

public enum PositionSide {
	
	LONG(+1),
	SHORT(-1);
	
	private final int direction;
	
	PositionSide(int direction){
		this.direction = direction;
	}
	
	public int direction() {
		return direction;
	}
	
//PnL = sign * priceChange
}
