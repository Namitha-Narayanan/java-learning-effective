package com.namitha.java.basics;

public class StrategyConfigDemo {

	public static void main(String[] args) {
		StrategyConfig h1 = StrategyConfig.builder()
				.timeFrame(TimeFrame.ofMinutes(60))
				.lookback(Lookback.of(120))
				.side(PositionSide.LONG)
				.build();
		
		StrategyConfig m5 = StrategyConfig.builder()
					.timeFrame(TimeFrame.ofMinutes(60))
					.lookback(Lookback.of(120))
					.side(PositionSide.LONG)
					.build();
				
		System.out.println(m5.equals(h1));
		System.out.println("HashCode for Config m5: " +m5.hashCode()+" \nHashCode for Config h1: " +h1.hashCode());;

	}

}
