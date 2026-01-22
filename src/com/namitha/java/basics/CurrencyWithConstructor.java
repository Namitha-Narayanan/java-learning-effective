package com.namitha.java.basics;

public class CurrencyWithConstructor{
	
	private final String code;
	
	public CurrencyWithConstructor(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}

	public static void main(String[] args) {
		CurrencyWithConstructor c1 = new CurrencyWithConstructor("EUR");
		CurrencyWithConstructor c2 = new CurrencyWithConstructor("EUR");
		
		System.out.println(c1==c2);
		System.out.println(c1.getCode().equals(c2.getCode()));

	}

}
