package hw2;

//• 請設計一隻Java程式，輸出結果為以下：1 4 9 16 25 36 49 64 81 100


public class no4 {
	public static void main(String[] args) {
		int product = 0;
		for(int i = 1 ; i <= 10 ; i++) {
			product = i*i;
			System.out.print(product + " ");
		}
	}
}
