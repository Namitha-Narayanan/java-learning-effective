package com.namitha.java.basics;

public final class OrderDecision {
	
	private OrderDecision() {
		
	}
	
	public static OrderSide decide(Position current, PositionSide target ) {
		
		if(current.isFlat()) {
			return target == PositionSide.LONG
					? OrderSide.BUY
					: OrderSide.SELL;
		}
		
		if(current.isShort() && target == PositionSide.LONG) {
			return OrderSide.BUY;
		}
		
		if(current.isLong() && target == PositionSide.SHORT) {
			return OrderSide.SELL;
		}
		
		return null;
	}

}
//As per Bloch, A class with only static methods should not be instantiable