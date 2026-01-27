package com.namitha.java.basics;

public class StrategyConfigDemo {

	public static void main(String[] args) {
		StrategyConfig h1 = StrategyConfig.builder()
				.timeFrame(TimeFrame.ofMinutes(60))
				.lookback(Lookback.of(120))
				.build();
		
		StrategyConfig m5 = StrategyConfig.builder()
					.timeFrame(TimeFrame.ofMinutes(5))
					.lookback(Lookback.of(250))
					.build();
				
		System.out.println(m5);

	}

}
