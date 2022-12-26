package com.bridgelabz;

public class ExtendMax {
	public <T extends Comparable<T>> T max(T x, T y, T z) {
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

	public static <T> void printMax(T a, T b, T c, T max) {
		T a1 = a, a2 = b, a3 = c;
		System.out.printf("Maximum values %s, %s & %s ", a1.toString(), a2.toString(), a3.toString());

	}

	public static void main(String[] args) {
		ExtendMax max = new ExtendMax();
		Integer a = max.max(2,6,5);
		System.out.println("is " + a);
		Float f = max.max(3.4f,236.66f,658.45f);
		System.out.println("is " + f);
		String s = max.max("Apple", "Peach", "Banana");
		System.out.println("is " + s);

	}

}
