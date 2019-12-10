package test191210;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// 정수를 입력하고 마지막에 0을 입력하세요
		
		Scanner scan = new Scanner(System.in);
		int num = 0, getSoo=0, sum=0;
		double avg=0;
		boolean run = true;
		
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요 : ");
		
		while(run) {
			num=scan.nextInt();
			if(num==0) 
				run = false;
				else {
				getSoo++;
				sum += num;
				avg = (sum/getSoo);			
			} 
		}	System.out.println("입력한 수는 "+getSoo+"개");
			System.out.print("평균은 "+avg+"입니다.");
		
		
		
		
		
		
		
		
		
		
	}

}
