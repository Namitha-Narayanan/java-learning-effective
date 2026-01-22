package com.namitha.java.basics;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class Currency {
	
	private static final Map<String, Currency> CACHE = new ConcurrentHashMap<>();
	
	private final String code;
	
	private Currency(String code) {
		this.code = code;
	}
	
	public static Currency of(String code) {
		return CACHE.computeIfAbsent(code, Currency::new);
	}
	
	public String getCode() {
		return code;
	}

	public static void main(String[] args) {
		Currency c1 = Currency.of("EUR");
		Currency c2 = Currency.of("EUR");
		
		System.out.println(c1 ==c2);
		System.out.println(c1.getCode().equals(c2.getCode()));
		
	}

}
