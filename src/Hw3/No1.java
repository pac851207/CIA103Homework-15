package Hw3;

import java.util.ArrayList;
import java.util.Scanner;

//請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//三角形、其它三角形或不是三角形

public class No1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數:");
		ArrayList<Integer> input = new ArrayList<Integer>();
		//System.out.println("==============Start================");
		
		for (int i = 0 ; i< 3 ;i++) {
			if (sc.hasNext()) {
				input.add(sc.nextInt());									
			}
		}
				
		sc.close();
		//System.out.println("input = " + input);
		//System.out.println("==============End=================");
		if(input.get(0) + input.get(1) > input.get(2) && input.get(1) + input.get(2) > input.get(0) && input.get(0) + input.get(2) > input.get(1)) {
			if(input.get(0) == input.get(1) && input.get(0) == input.get(2)) {
				System.out.println("正三角形");
			}else if(input.get(0) == input.get(1) || input.get(1) == input.get(2) || input.get(0) == input.get(2)) {
				System.out.println("等腰三角形");
			}else if((input.get(0)+input.get(1))>input.get(2) || (input.get(1)+input.get(2))>input.get(0) || (input.get(0)+input.get(2))>input.get(1)) {
				System.out.println("其他三角形");
			}
		}else{
			System.out.println("不是三角形");
		}

	}
		
}	




