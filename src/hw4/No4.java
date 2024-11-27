package hw4;

import java.util.ArrayList;
import java.util.Scanner;

public class No4 {
	public static void main(String[] args) {
		int[][] x ={
	            {25, 32, 8, 19, 27},
	            {2500, 800, 500, 1000, 1200}
	    };
//		System.out.println(x);	
//		System.out.println(x[0][1]);
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0 ; i < x[1].length ; i++) {
			if(x[1][i] >= k) {
				list.add(x[0][i]);
			}
		}
		System.out.print("有錢可借的員工編號 : ");
		for(int i = 0; i < list.size(); i++) {
		System.out.print(list.get(i) + " ");
		}
		System.out.println("共" + list.size() + "人!");
	}
}
