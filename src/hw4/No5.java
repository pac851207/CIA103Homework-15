package hw4;

import java.util.ArrayList;
import java.util.Scanner;

public class No5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> date = new ArrayList<Integer>();
		for (int j = 0 ; j< 3 ;j++) {
			if (sc.hasNext()) {
				date.add(sc.nextInt());									
			}
		}
		sc.close();
		int[] leap = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] normal = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int sum = 0;
			if((date.get(0) % 4 == 0 && date.get(0) % 100 != 0) || (date.get(0) % 100 == 0 && date.get(0) % 400 == 0)) { //判斷成立=閏年
				if(date.get(1) == 2 && date.get(2) > 29) {
					System.out.println("輸入日期有誤"); //閏年2月超過29
				}else if(date.get(1) < 1 || date.get(1) > 12) {
					System.out.println("輸入日期有誤"); //月份小於1或大於12
				}else if((date.get(1) == 1 || date.get(1) == 3 || date.get(1) == 5 ||date.get(1) == 7 || date.get(1) == 8 || date.get(1) == 10 || date.get(1) == 12 ) && date.get(2) > 31) {
					System.out.println("輸入日期有誤"); //大月超過31
				}else if((date.get(1) == 4 || date.get(1) == 6 || date.get(1) == 9 || date.get(1) == 11) && date.get(2) > 30) {
					System.out.println("輸入日期有誤"); //小月超過30
				}else {for(int i = 0; i < date.get(1)-1; i++) { //閏年計算
						sum += leap[i];
					   }
						sum += date.get(2);
						System.out.println("輸入的日期為該年第" + sum + "天");}
			}
			else if(date.get(1) < 1 || date.get(1) > 12) {
				System.out.println("輸入日期有誤"); //月份小於1或大於12
			}else if((date.get(1) == 1 || date.get(1) == 3 || date.get(1) == 5 ||date.get(1) == 7 || date.get(1) == 8 || date.get(1) == 10 || date.get(1) == 12 ) && date.get(2) > 31) {
				System.out.println("輸入日期有誤"); //大月超過31
			}else if((date.get(1) == 4 || date.get(1) == 6 || date.get(1) == 9 || date.get(1) == 11) && date.get(2) > 30) {
				System.out.println("輸入日期有誤"); //小月超過30
			}else if(/* date.get(0) % 4 != 0 && */ date.get(1) == 2 && date.get(2) > 28){
				System.out.println("輸入日期有誤"); //平年2月超過28
			}else { 
				for(int i = 0; i < date.get(1)-1; i++) { //平年計算
					sum += normal[i];
				}
				sum += date.get(2);
				System.out.println("輸入的日期為該年第" + sum + "天");
			}
	}
}
