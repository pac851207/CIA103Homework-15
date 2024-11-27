package Hw5;

public class No5 {
	public static void main(String[] args) {
		genAuthCode();
	}
	public static void genAuthCode() {
		final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	    final int LENGTH = 8; // 設定生成隨機字符串的長度
	    StringBuilder sb = new StringBuilder(LENGTH);
	    for (int i = 0; i < LENGTH; i++) {
            int index = (int) (Math.random() * CHARACTERS.length()); // 隨機選擇字符的索引
            sb.append(CHARACTERS.charAt(index)); // 將選擇的字符附加到 StringBuilder 中
        }
        System.out.println("本次產生隨機驗證碼為 : " + sb.toString());
	}
	
	
	
	
	
}
