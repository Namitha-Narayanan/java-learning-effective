package com.namitha.java.basics;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class TimeFrame {
	
	private static final Map<Integer, TimeFrame> CACHE = new ConcurrentHashMap<>();
	
	private final int minutes;
	
	private TimeFrame(int minutes) {
		this.minutes = minutes;
	}
	
	public static TimeFrame ofMinutes(int minutes) {
		return CACHE.computeIfAbsent(minutes, TimeFrame::new);
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	

	public static void main(String[] args) {
		TimeFrame t1 = TimeFrame.ofMinutes(5);
		TimeFrame t2 = TimeFrame.ofMinutes(5);
		
		System.out.println(t1 == t2);

	}

}
