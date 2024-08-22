package hw2;

//• 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)


public class no3 {
	public static void main(String[] args) {
		int product = 1;
		int count = 1;
		while(count <= 10) {
			product *= count;
			count++;
		}
		System.out.println(product);
	}
}
