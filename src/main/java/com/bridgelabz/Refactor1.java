package com.bridgelabz;

public class Refactor1 {
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

	public static <T> void printMax(T x, T y, T z, T max) {
		T a1 = x, a2 = y, a3 = z;
		System.out.printf("Maximum values %s, %s & %s ", a1.toString(), a2.toString(), a3.toString());

	}

	public static void main(String[] args) {
		Refactor1 max = new Refactor1();
		Integer a = max.max(2,6,5);
		System.out.println("is " + a);
		Float f = max.max(3.4f,236.66f,658.45f);
		System.out.println("is " + f);
		String s = max.max("Apple", "Peach", "Banana");
		System.out.println("is " + s);

	}

}
