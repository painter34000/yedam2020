package com.yedam.hsw.classes;

import java.util.Scanner;

public class BaseballGame {

	public static void main(String[] args) {

		int[] answer = new int[3];//컴퓨터가 던지는 볼
		int[]user=new int[3];//사용자가 맞추기 위해 던지는 볼
		int num =0;//배열 인덱스를 위해 사용하는 변수
		int count=0;//변번에 맞추는지 세기 위한 변수
		boolean loop = true;
		int strike=0;//Stting "Strike" Count=0
		int ball=0;//Setting "Ball"Count=0
		//배열의 길이 만듬 
		
		for(int i=0; i<answer.length; i++) {
			answer[i] = (int)(Math.random()*9)+1;
			for (int j=0; j<i; j++) {
				if(answer[j]==answer[i]) {i--;
				break;
				}
			}
		}
		//User가 세개의 정수를 입력하도록 하여, User배열에 숫자를 입력
		Scanner sc= new Scanner(System.in);
		System.out.println("1~9의 정수를 입력>>>");
		//for (int i=0; i<answer.length; i++)	{
		//System.out.println("["+answer[i]+"]");
		//}
		//answer 의 배열과 user배열을 서로 비교하여 Strike인지 Ball인지구분
		
		loop=true;
		while(loop) {
			for (int i = 0; i<user.length; i++) {
				num=sc.nextInt();
				user[i]=num;
				if(num<0 || num>10) {
					System.out.println("1~9의 정수를 입력");
					
					}
				}
			for(int i =0; i<answer.length; i++) {
				for (int j=0; j<user.length; j++) {
					//배열의 값이 서로 통일해야 strike처리
					if (answer[i]==user[j]&& i==j) {
						strike++;
					}else if (answer[i]==user[j]&& i!=j){
							ball++;
							
				}
			}
		}System.out.println(strike+"스트라이크"+ball+"볼");
		strike=0;
		ball=0;
		if (strike>3) {
			loop=false;
		}
		count=count+1;
		}
		System.out.println("횟수:"+(count-1));
		System.out.println("Game Over");
		sc.close();
		//종료
		
		
		
//		Scanner scn=new Scanner(System.in);
//		int ball= scn.nextInt();		
//		int[] answer = new int[3];
//		for (int i = 0; i < answer.length; i++) {
//			answer[i] = (int) (Math.random() * 9) + 1;
//		}
//		for (int i = 0; i < answer.length; i++) {
//			System.out.print("[" + answer[i] + "]");
//
//		}
//		
//		int Str=true;
//		while(Str) {ball += 1; i++;}
//			//3스트라이크가 되면 종료   , answer 배열에 들어 있는 값을 맞추자
//			
//		if(ball==answer)
//			{ System.out.println("스트라이크")
//		}else if(ball!=answer)
//	{
//		System.out.println("아웃");
//	}else break;
//	{
//		System.out.println("종료");
//	}

}
}
