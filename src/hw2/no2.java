package hw2;

//• 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)

public class no2 {
	public static void main(String[] args) {
		int product = 1;
		for(int i = 1 ; i <= 10 ; i+=1) {
			product = product*i;
		}
		System.out.println(product);
	}
}
