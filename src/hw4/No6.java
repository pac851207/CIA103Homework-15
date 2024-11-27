package hw4;

public class No6 {
	public static void main(String[] args) {
		int[][] score = {
				{10, 37, 100, 77, 98, 90, 0}, //1號成績
				{35, 75, 70, 95, 70, 80, 0},  //2號成績
				{40, 77, 79, 70, 89, 100, 0}, //3號成績
				{100, 89, 90, 89, 90, 75, 0}, //4號成績
				{90, 64, 75, 60, 75, 50, 0},  //5號成績
				{85, 75, 70, 75, 90, 20, 0},  //6號成績
				{75, 70, 79, 85, 89, 99, 0},  //7號成績
				{70, 95, 90, 89, 90, 75, 0}   //8號成績
		};
		for(int i = 0 ; i < 6 ; i++) { 		//橫排
			int max = score[0][i];
			for(int k = 0 ; k < 8 ; k++) {	//直排
				if(score[k][i] > max) {
					max = score[k][i];
				}
			}	
			for(int k = 0 ; k < 8 ; k++) {
				if(score[k][i] == max) {
					score[k][6] += 1;
				}
			}
		}
		for(int j = 0 ; j < 8 ; j++) {
		System.out.println((j+1) + "號最高分有" + score[j][6] + "次" );
		}
	}
}
