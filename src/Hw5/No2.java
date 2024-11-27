package Hw5;
import java.util.ArrayList;
import java.util.Random;

public class No2 {
	public static void main(String[] args) {
		randAvg();
	}
	
	
	
	public static void randAvg(){
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int sum = 0;
		for (int j = 0 ; j< 10 ;j++) {
			int randomNumber = new Random().nextInt(101);
			numbers.add(randomNumber);	
			sum = sum + randomNumber;
		}
		
		for (int k = 0 ; k < numbers.size() ; k++) {
			System.out.print(numbers.get(k) + " ");
		}
		System.out.println("平均值 = " + sum/numbers.size());
	}
}
