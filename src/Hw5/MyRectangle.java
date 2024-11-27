package Hw5;

public class MyRectangle {
	double width;
	double depth;
	
	void setWidth(double width) {	//將收到的引數指定給width屬性
		this.width = width;
	}
	
	void setDepth(double depth) {	//將收到的引數指定給depth屬性
		this.depth = depth;
	}
	
	double getArea() {	//能計算該長方形的面積
		double Area = width * depth ;
		return Area;
	}
	
	public MyRectangle() {	//不帶參數也無內容的建構子
	}
	
	public MyRectangle(double width, double depth) {	//傳入的兩個引數會指定給對應的屬性
		setWidth(width);
		setDepth(depth);
	}
	
	
}
