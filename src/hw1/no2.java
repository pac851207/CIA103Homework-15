package hw1;

//請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)

public class no2 {
	public static void main(String[] args) {
		int egg = 200;
		int dozen = 12;
		int a = egg/dozen;
		int b = egg%dozen;
		System.out.println(a + "打" + b + "顆");
	}
}
