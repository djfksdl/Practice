package com.javaex.practice;

public class Ex35 {

	public static void main(String[] args) {
		//?? long형 변수를 사용하여 빛이 1년동안 진행하는 거리를 계산하여 출력하세요.
		
		long light = 300000L*86400*365; //>> 300000나 86400뒤에 L을 붙이니 답이 나오고 그냥 마지막에 L을 붙이면 안나옴 -> 앞의 값에서 int형을 유지하기때문에 값이 잘라져서 마지막에 L형하면 값자기 담을 수 있는 값이 커짐. 그래서 롱형*int형으로 해서 롱형으로 유지하면서 계산하면 오류가 나지 않음.
		// 아니면 상수로 주어진것을 변수로 저장해서 30000L로 놓고 계산하기
		System.out.println("빛이 1년동안 가는 거리는 " + light + " km 입니다.");

	}

}
