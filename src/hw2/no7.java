package hw2;

//• 請設計一隻Java程式，輸出結果為以下：
//A  65
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF

public class no7 {
	public static void main(String[] args) {
		int k ;
		for(int j = 0 ; j <= 5 ; j++) {
			char i = (char) ('A' + j);
			for (k = 0 ; k <= j ; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}	
}
