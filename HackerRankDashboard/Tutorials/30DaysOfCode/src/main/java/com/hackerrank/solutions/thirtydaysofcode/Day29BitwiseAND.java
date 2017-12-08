/**
 * 
 */
package com.hackerrank.solutions.thirtydaysofcode;

import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */
public class Day29BitwiseAND {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int k = in.nextInt();
			if (((k - 1) | k) <= n) {
				System.out.println(k - 1);
			} else {
				System.out.println(k - 2);
			}

		}
	}
}
