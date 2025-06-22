package com.stringtest;

public class Test01 {
	public static void main(String[] args) {
		int a = 3;
		int b = 2;
		int c = 4;
		int d = 5;

		if (a > b) {
			if (a > c) {
				if (a > d) {
					System.out.println(a);
				} else {
					System.out.println(d);
				}
			} else if (c > d) {
				System.out.println(c);
			} else
				System.out.println(d);
		} else {
			if (b > c) { 
				if (b > d) {
					System.out.println(b);
				} else
					System.out.println(d);

			} else if (c > d) {
				System.out.println(c);
			} else {
				System.out.println(d);
			}

		}
	}
}
