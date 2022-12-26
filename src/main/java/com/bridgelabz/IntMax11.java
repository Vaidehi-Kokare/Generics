package com.bridgelabz;

public class IntMax11 {

	public static <T extends Comparable<T>> T max(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		printMax(x, y, z, max);
		return max;
	}

	public static <T> void printMax(T x, T y, T z, T max) {
		System.out.printf("Max of %s %s and %s is %s\n", x, y, z, max);
	}

	public static void main(String[] args) {
		Integer x = 6, y = 5, z = 2;
		System.out.println("For Integer Values");
		max(x, y, z);
	}

}
