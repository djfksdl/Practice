package com.javaex.practice;

public class Ex35 {

	public static void main(String[] args) {
		//?? long형 변수를 사용하여 빛이 1년동안 진행하는 거리를 계산하여 출력하세요.
		
		long light = 300000L*86400*365; // ?? 300000나 86400뒤에 L을 붙이니 답이 나오고 그냥 마지막에 L을 붙이면 안나옴
		System.out.println("빛이 1년동안 가는 거리는 " + light + " km 입니다.");

	}

}
