package com.javaex.practice;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		// 동전별 개수를 입력받아 총금액을 계산하는 프로그램을 작성하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 개수:");
		int count1 = sc.nextInt();
		
		System.out.print("100원 개수:");
		int count2 = sc.nextInt();
		
		System.out.print("50원 개수:");
		int count3= sc.nextInt();
		
		System.out.print("10원 개수:");
		int count4 = sc.nextInt();
		
		System.out.print("동전의 총합은 " + (500*count1 + 100*count2 + 50*count3 + 10*count4) + "원 입니다.");
		sc.close();

	}

}
