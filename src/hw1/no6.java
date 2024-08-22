package hw1;

//請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//5 + 5
//5 + ‘5’
//5 + “5”
//並請用註解各別說明答案的產生原因

public class no6 {
	public static void main(String[] args) {
		int a = 5;
		char b = '5';
		String c = "5";
		System.out.println(a + a);		//數字相加 5+5=10
		System.out.println(a + (int)b);	//字元'5'的ASCII=0035(十六進制)轉換為十進制=53 5+53=58
		System.out.println(a + c);		//5+文字5=55
	}
}
