package hw1;

//請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長

public class no4 {
	public static void main(String [] args){
		double PI = 3.1415;
		double radius = 5;
		double area = radius*radius*PI;
		double circumference = 2*radius*PI;
		System.out.println("園面積 = " + area);
		System.out.println("圓周長 = " + circumference);
	}

}
