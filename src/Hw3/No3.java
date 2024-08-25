package Hw3;

import java.util.Scanner;

//阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//的號碼與總數

public class No3 {
	public static void main(String[] args) {
		int count = 49;
		
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		for(int i = 1 ; i <= 49 ; i++) {
			if(i/10 == k || i%10 == k) {
				count--;
			}else {
				System.out.println(i);
			}
		}
		System.out.println("可以選擇的數字有 " + count + " 個");
	}
}
