package com.namitha.java.basics;

import java.util.Objects;

public final class StrategyConfig {
	
	private final TimeFrame timeFrame;
	private final Lookback lookback;
	private final Side side;
	
	private StrategyConfig(Builder builder) {
		this.timeFrame = builder.timeFrame;
		this.lookback = builder.lookback;
		this.side = builder.side;
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
	
	public Side side() {
		return side;
	}
	
	public static final class Builder{
		
		private TimeFrame timeFrame;
		private Lookback lookback;
		private Side side;
		
		private Builder() {}
		
		public Builder timeFrame(TimeFrame timeFrame) {
			this.timeFrame = Objects.requireNonNull(timeFrame,"timeFrame");
			return this;
		}
		
		public Builder lookback(Lookback lookback) {
			this.lookback = Objects.requireNonNull(lookback,"lookback");
			return this;
		}
		
		public Builder side(Side side) {
			this.side = Objects.requireNonNull(side,"side");
			return this;
		}
		
		public StrategyConfig build() {
			if(timeFrame == null) {
				throw new IllegalStateException("TimeFrame must be set");
			}
			if(lookback == null) {
				throw new IllegalStateException("Lookback must be set");
			}
			if(side == null) {
				throw new IllegalStateException("Side must be set");
			}
			return new StrategyConfig(this);
			
		}
	}
	@Override
	public String toString() {
		return "StrategyConfig {" +
				"timeFrame = " +timeFrame.minutes() + "m" +
				", lookback = " + lookback.bars() + " l" +
				" side = " + side.direction() +
				'}';
	}
	@Override
	public boolean equals(Object o){
		if(this == o) return true;
		if(!(o instanceof StrategyConfig)) return false;
		StrategyConfig other = (StrategyConfig) o;
		return Objects.equals(lookback, other.lookback) 
				&& Objects.equals(timeFrame, other.timeFrame)
				&& Objects.equals(side, other.side);
		
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(lookback, timeFrame, side);
	}
	
	
	}


