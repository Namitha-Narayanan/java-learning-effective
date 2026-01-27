package com.namitha.java.basics;

import java.util.Objects;

public final class StrategyConfig {
	
	private final TimeFrame timeFrame;
	public final Lookback lookback;
	
	private StrategyConfig(Builder builder) {
		this.timeFrame = builder.timeFrame;
		this.lookback = builder.lookback;
	}
	
	public static Builder builder() {
		return new Builder();
		}
	
	public TimeFrame timeFrame() {
		return timeFrame;
	}
	
	public Lookback lookback() {
		return lookback;
	}
	
	public static final class Builder{
		
		private TimeFrame timeFrame;
		private Lookback lookback;
		
		private Builder() {}
		
		public Builder timeFrame(TimeFrame timeFrame) {
			this.timeFrame = Objects.requireNonNull(timeFrame,"timeFrame");
			return this;
		}
		
		public Builder lookback(Lookback lookback) {
			this.lookback = Objects.requireNonNull(lookback,"lookback");
			return this;
		}
		
		public StrategyConfig build() {
			if(timeFrame == null) {
				throw new IllegalStateException("TimeFrame must be set");
			}
			if(lookback == null) {
				throw new IllegalStateException("Lookback must be set");
			}
			return new StrategyConfig(this);
			
		}
	}
	@Override
	public String toString() {
		return "StrategyConfig {" +
				"timeFrame = " +timeFrame.minutes() + "m" +
				", lookback = " + lookback.bars() +
				'}';
	}
	
	
	}


