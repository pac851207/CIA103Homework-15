package Hw3;

import java.util.Random;
import java.util.Scanner;

//請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//對則顯示正確訊息

public class No2 {
	public static void main(String[] args) {
		 Random random = new Random();

	        // 產生0到9之間的隨機數字
	        int randomNumber = random.nextInt(10); // 10表示上限（不包含），所以範圍是0到9

	        System.out.println("隨機數字: " + randomNumber);
	        System.out.println("開始猜數字吧!");
	     
	        for(;;) {
	        	Scanner sc = new Scanner(System.in);
//	    		System.out.println("請輸入:");
	    		if(sc.nextInt() == randomNumber) {
	    			System.out.println("答對了! 答案就是" + randomNumber);
	    			break;
	    		}else {
	    			System.out.println("猜錯囉");
	    		}
	        }
	        
	}
}
