package com.namitha.java.basics;

public class EnumDemo {
	public static void main(String[] args) {
		PositionSide side = PositionSide.LONG;
		
		
		double priceChange = 0.0025;
		int quantity = 100000;
		
		double pnl = side.direction() * priceChange * quantity;
		
		
		System.out.println("Position Side: " +side);
		System.out.println("PnL impact: " +pnl);
	}
}
//pnl += side.direction() * priceChange * quantity