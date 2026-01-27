package com.namitha.java.basics;

public class ImmutableDemo {
	public static void main(String[] args) {
		Lookback lb = Lookback.of(100);
		//System.out.println(lb.bars());
		boolean n = true;
		if(n) {
			lb = Lookback.of(200);
			System.out.println(lb.bars());
		}
		
	}
}
