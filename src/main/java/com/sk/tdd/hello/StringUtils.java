package com.sk.tdd.hello;

import java.text.NumberFormat;
import java.util.Locale;

public class StringUtils {
	public static String comma(int num) {
		String strNum = NumberFormat.getNumberInstance(Locale.US).format(num);
		return strNum;
	}
}
