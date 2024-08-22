package hw2;

//• 請設計一隻Java程式，輸出結果為以下：
//1 2 3 4 5 6 7 8 9 10
//1 2 3 4 5 6 7 8 9
//1 2 3 4 5 6 7 8
//1 2 3 4 5 6 7
//1 2 3 4 5 6 
//1 2 3 4 5
//1 2 3 4 
//1 2 3 
//1 2 
//1

public class no6 {
	public static void main(String[] args) {
		int i , j , k = 10;
		for(i = 1 ; i <= 10 ; i++) {
			for(j = 1 ; j <= k ; j++) {
				System.out.print(j + " ");
			}
		k--;
		System.out.println();
		}
	}
}
