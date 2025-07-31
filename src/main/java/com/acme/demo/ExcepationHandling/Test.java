package com.acme.demo.ExcepationHandling;

import java.util.Iterator;
import java.util.concurrent.ForkJoinPool;

public class Test {

	public static void main(String[] args) {

		int[] num1 = { 10, 20, 30, 40, 50, 60 };
		int[] num2 = { 1, 2, 0, 4, 5, 6, };

		for (int i = 0; i < num1.length; i++) {

			System.out.println(divide(num1[i], num2[i]));

		}

	}

	public static int divide(int a, int b) {
		try {
			return a / b;
		} catch (Exception e) {
			System.out.println(e);
			return -1;

		}

	}

}
