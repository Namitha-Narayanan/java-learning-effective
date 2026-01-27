package com.namitha.java.basics;

public class EnumDemo {
	public static void main(String[] args) {
		Side side = Side.BUY;
		
		//Side side = Side.SELL;
		
		
		if(side == Side.BUY) {
			//System.out.println("Entering Long Position");
			System.out.println(side.direction());
		}else {
			//System.out.println("Entering Short Position");
			System.out.println(side.direction());
		}
	}
}
//pnl += side.direction() * priceChange * quantity