package com.tinet.test.wangll;


public class Test {
	public static void main(String[] args) {

		int[] array1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int[][] array2 = { array1, array1, array1, array1, array1, array1, array1, array1, array1, array1 };

		System.out.println("一维数组");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + "\t");
		}
		System.out.println();

		System.err.println("二维数组");
		for (int i = 0; i < array2.length; i++) {
			int[] arr = array2[i];
			for (int j = 0; j < arr.length; j++) {
				System.err.print("(" + arr[i] + ", " + j + ") \t");
			}
			System.err.println();
		}
		
		System.out.println("分支第一次提交");
		System.out.println("分支第二次提交");
		System.out.println("分支第三次提交");
		System.out.println("主干第四次提交");
	}
}