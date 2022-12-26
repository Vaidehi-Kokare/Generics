package com.bridgelabz;

public class MaxToStd {
	public static <T extends Comparable<T>> T max(T a, T b, T c, T d) {
		T max = a;
		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		if (d.compareTo(max) > 0) {
			max = d;
		}
		printMax(a, b, c, d, max);
		return max;
	}

	public static <T> void printMax(T a, T b, T c, T d, T max) {
		System.out.printf("Max of %s, %s, %s and %s is %s\n", a, b, c, d, max);
	}

	public static void main(String[] args) {
		Integer xInt = 3, yInt = 4, zInt = 5, wInt=10;
		Float xFl = 6.6f, yFl = 8.8f, zFl = 7.7f, wFl=9.9f;
		String xStr = "Apple", yStr = "Peach", zStr = "Banana", wStr = "Pear";
		
		max(xInt, yInt, zInt, wInt);
		max(xFl, yFl, zFl, wFl);
		max(xStr, yStr, zStr, wStr);
	}


}
