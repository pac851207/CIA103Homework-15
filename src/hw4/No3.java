package hw4;

//• 有個字串陣列如下 (八大行星)：
//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 
//(提示：字元比對，String方法)


public class No3 {
	public static void main(String[] args) {
		String[] x = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int sum = 0;
		
		for(int i = 0; i < x.length; i++ ) {
			for (int j = 0; j < x[i].length(); j++) {
	            char c = x[i].charAt(j); // 取得字串中的第 j 個字元
	            String v = Character.toString(c);
	            //System.out.println("字元 " + (j + 1) + ": " + c);
	            if(v.equals("a") || v.equals("e") || v.equals("i") || v.equals("o") || v.equals("u")) {
	            	sum++;
	            }
//	            switch(v) {
//	            case "a" :
//	            	sum = sum + 1;
//	            	break;
//	            case "e" :
//	            	sum = sum + 1;
//	            	break;
//	            case "i" :
//	            	sum = sum + 1;
//	            	break;
//	            case "o" :
//	            	sum = sum + 1;
//	            	break;
//	            case "u" :
//	            	sum = sum + 1;
//	            	break;
//	            }
			}
		}
		System.out.println("母音有" + sum + "個");
	}
}
