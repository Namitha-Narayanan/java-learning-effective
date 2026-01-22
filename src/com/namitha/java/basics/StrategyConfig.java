package com.namitha.java.basics;

public class StrategyConfig {
		
	private final int lookback;
	private final double risk;
	private final boolean useTrailingStop;
		
	
	public static class Builder{
		private final int lookback;
		private double risk = 0.01;
		private boolean useTrailingStop = false;
		
		
		
		public Builder(int lookback) {
			this.lookback = lookback;
		}
		
		public Builder risk(double risk) {
			this.risk = risk;
			return this;
		}
		
		public Builder useTrailingStrop(boolean value) {
			this.useTrailingStop = value;
			return this;
		}
		
		public StrategyConfig build() {
			return new StrategyConfig(this);
		}
	}
		
		private StrategyConfig(Builder builder) {
			this.lookback = builder.lookback;
			this.risk = builder.risk;
			this.useTrailingStop = builder.useTrailingStop;
		}

	}


