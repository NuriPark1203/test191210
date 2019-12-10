package test191210;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		//  숫자 하나를 입력 받아서 
//		1부터 입력받은 숫자까지 
//		2의 배수, 3의 배수를 제외한 총합 계산
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 :");
		
		int num=0, sum = 0;
		num = scan.nextInt();
		for(int i=1;i<=num;i++) {
			if(i%2!=0 && i%3!=0) {
				System.out.println("i값 :"+i);
				sum += i;
			}									
		}	System.out.print("합은 : "+sum);

	}

}
