package com.formacionbdi.springboot.app.eureka;

import java.text.NumberFormat;
import java.util.Locale;

public class Test {

	public static void main(String[] args) {
		double amount =200.0;
		Locale locale = new Locale("en", "US");      
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
		System.out.println(currencyFormatter.format(amount));

	}

}
