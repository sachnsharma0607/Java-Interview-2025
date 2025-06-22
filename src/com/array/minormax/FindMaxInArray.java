package com.array.minormax;

public class FindMaxInArray {
	public static void main(String[] args) {
		int[] a = { 101, 120, 300, 405, 67, 56,301 };
		FindMaxInArray.maxInArray(a);
		//FindMaxInArray.minInArray(a);
	}

	public static void minInArray(int[] a) {
		int[] arr = a;
		int firstmin = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(firstmin>a[i])
			{
				secondMin=firstmin;
				firstmin=a[i];
			}
			else if(secondMin>a[i])
			{
				secondMin=a[i];
			}
		}
		System.out.println("firstmin : "+firstmin);
		System.out.println("secondMin :  "
				+ ""
				+ ""+secondMin);
	}

	public static void maxInArray(int[] a) {
		int[] arr = a;
		int firstmax = 0;
		int secondMax = 0;
		for (int i = 0; i < arr.length; i++) {

			if (a[i] > firstmax) {
				secondMax = firstmax;
				firstmax = a[i];
			} else if (a[i] > secondMax) {
				secondMax = a[i];
			}
		}
		System.out.println(firstmax);
		System.out.println(secondMax);
	}
}
