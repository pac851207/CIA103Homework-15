package hw4;

//• 請建立一個字串，經過程式執行後，輸入結果是反過來的
//例如String s = “Hello World”，執行結果即為dlroW olleH
//(提示：String方法，陣列)

public class No2 {
	public static void main(String[] args) {
		String s = "Hello World";
		String reversed = new StringBuilder(s).reverse().toString();
		System.out.println("反轉後 : " + reversed);
	}
}
