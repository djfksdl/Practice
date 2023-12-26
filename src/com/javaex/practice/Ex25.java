package com.javaex.practice;

public class Ex25 {
	public static void main(String[] args) {
		int a = 13;
		System.out.println((a>13) && (a>=13)); // false
		System.out.println((a>13) || (a>=13)); // true
		System.out.println((a/3 == 4) && (a%3 == 2)); // t and f = false
		System.out.println((a/3 == 4) || (a%3 == 2)); // t or f = true
		System.out.println((a/3 == 4) && (a%3 == 2) || (a/3 == 4)); // t and false or t = f or t = true
	}
}
