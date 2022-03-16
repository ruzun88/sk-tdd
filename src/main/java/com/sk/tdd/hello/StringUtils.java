package com.sk.tdd.hello;

import java.text.NumberFormat;
import java.util.Locale;

public class StringUtils {
	private StringUtils() {}
	public static String comma(int num) { 
		return NumberFormat.getNumberInstance(Locale.US).format(num);
	}
}
