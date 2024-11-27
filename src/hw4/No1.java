package hw4;

//• 有個一維陣列如下：
//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//(提示：陣列，length屬性)

public class No1 {
	public static void main(String[] args) {
		int[] x = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0;
			for(int i= 0; i < x.length; i++) {
				sum = sum + x[i];
				//System.out.println(sum);
			}
			int sumAvg = sum / x.length;
			System.out.println("平均值 = " + sumAvg);
			System.out.println("大於平均值的元素有");
			for(int j = 0; j < x.length; j++) {
				if(x[j] > sumAvg) {
					System.out.println(x[j]);
				}
			}
			
	}
}
