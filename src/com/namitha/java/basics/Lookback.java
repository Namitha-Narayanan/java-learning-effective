package com.namitha.java.basics;

public final class Lookback {
	private final int bars;
	
	private Lookback(int bars) {
		this.bars = bars;
	}
	
	public static Lookback of(int bars) {
		if(bars <= 0) {
			throw new IllegalArgumentException("Lookback must be positive");
		}
		return new Lookback(bars);
	}
	
	public int bars() {
		return bars;
	}
	
@Override
public boolean equals(Object o) {
	if(this == o) return true;
	if(!(o instanceof Lookback)) return false;
	Lookback other = (Lookback) o;
	return this.bars == other.bars;
}

@Override
public int hashCode() {
	return Integer.hashCode(bars);
}

}
