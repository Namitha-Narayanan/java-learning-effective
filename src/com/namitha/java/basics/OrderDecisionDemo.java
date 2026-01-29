package com.namitha.java.basics;


public class OrderDecisionDemo {
	
	public static void main(String[] args) {
		
		Position current = new Position(0);
		PositionSide target = PositionSide.LONG;
		
		OrderSide action = OrderDecision.decide(current, target);
		System.out.println("Moving from Flat --> Long, choose " +action); //BUY
		
		current = new Position(1);
		target = PositionSide.SHORT;
		
		action = OrderDecision.decide(current, target);
		System.out.println("Moving from Long --> Short, choose " +action); //SELL
		
		current = new Position(-1);
		target = PositionSide.LONG;
		action = OrderDecision.decide(current, target);
		System.out.println("Moving from Short --> Long, choose " +action); //BUY(FLIP from SHORT to LONG)
		
		
	}

}
