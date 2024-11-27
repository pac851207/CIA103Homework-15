package Hw5;

import java.util.Scanner;

public class No1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int l = sc.nextInt();
		starSquare(k , l);
		sc.close();
	}
	public static void starSquare(int width, int height) {
		for(int i = 1 ; i <= height ; i++) {
			for(int j = 1 ; j <= width ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
