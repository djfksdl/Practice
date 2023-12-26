package com.javaex.practice;

public class Ex19 {
	public static void main(String[] args) {
		int num01 = 40;
		int num02 = 50;
		int result = (num01++) + (++num02); //40(41) + 51 = 91
		
		System.out.println(result); // 91
		System.out.println(num01); // 41
		System.out.println(num02); // 51
	}
}
