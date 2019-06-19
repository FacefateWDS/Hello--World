package com.test.java1;

import java.util.*;
import java.lang.*;

public class Test {

	public static void main(String[] args) {

		String str = "数学87分，语文79分，英语98分,物理3，应2345";
		String strNumber[] = str.split("\\D+");
		int Length[] = new int[100];
		int a = 0;
		int sum = 0;
		for (int i = 0; i < strNumber.length; i++) {
			if (!strNumber[i].equals("")) {

				Length[a] = Integer.parseInt(strNumber[i]);
				++a;
			}
		}
		for (int i = 0; i < Length.length; i++) {
			if (Length[i] != 0) {
				sum += Length[i];

			}
		}
		System.out.println(sum);
	}
}
