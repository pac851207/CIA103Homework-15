package Hw5;

public class No3 {
	public static void main(String[] args) {
		No3 no3 = new No3();
		int[][] intArray = {
				{1, 9, 3},
				{9, 5, 2}
		};
		double[][] doubleArray = {
				{1.2, 3.5, 2.2},
				{7.4, 2.1, 8.2}
		};
		System.out.println(no3.maxElement(intArray));
		System.out.println(no3.maxElement(doubleArray));
	}
	
	
	public static int maxElement(int x[][]) {
		
		int maxintArray = 0;
		int max = x[0][0];
		for(int i = 0 ; i < 3 ; i++) { 		//橫排
			for(int k = 0 ; k < 2 ; k++) {	//直排
				if(x[k][i] > max) {
					max = x[k][i];
				}
			}
			maxintArray = max;
		}
		return maxintArray;
		
	}
	
	public static double maxElement(double x[][]) {
		
		double maxdArray = 0;
		double max = x[0][0];
		for(int i = 0 ; i < 3 ; i++) { 		//橫排
			for(int k = 0 ; k < 2 ; k++) {	//直排
				if(x[k][i] > max) {
					max = x[k][i];
				}
			}
			maxdArray = max;
		}	
		return maxdArray;
		
	}
	
	
	
}
