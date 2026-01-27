package com.namitha.java.basics;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


public class TimeFrame {
	
	private static final Set<Integer> ALLOWED_MINUTES = Set.of(1,5,10,15,30,60,240,1440);
	
	private static final Map<Integer, TimeFrame> CACHE = new ConcurrentHashMap<>();
	
	private final int minutes;
	
	private TimeFrame(int minutes) {
		this.minutes = minutes;
	}
	
	public static TimeFrame ofMinutes(int minutes) {
		if(!ALLOWED_MINUTES.contains(minutes)) {
			throw new IllegalArgumentException("Unsupported timeframe: " + minutes + " minutes");
			}
		return CACHE.computeIfAbsent(minutes, TimeFrame::new);
	}
	
	public int minutes() {
		return minutes;
	}
	
	

	public static void main(String[] args) {
		TimeFrame t1 = TimeFrame.ofMinutes(10);
		TimeFrame t2 = TimeFrame.ofMinutes(15);
		
		System.out.println(t1 == t2);

	}

}
