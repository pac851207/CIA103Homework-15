package hw1;

//請由程式算出256559秒為多少天、多少小時、多少分與多少秒

public class no3 {
	public static void main(String[] args) {
		int question = 256559;
		int day = 86400;
		int hour = 3600;
		int min = 60;
		int day1 = question/day;
		int hour1 = (question%day)/hour;
		int min1 = ((question%day)%hour)/min;
		int sec = ((question%day)%hour)%min;
		System.out.println(day1 + "天" + hour1 + "小時" + min1 + "分鐘" + sec + "秒");
		//System.out.println(hour1);
		//System.out.println(min1);
		//System.out.println(sec);
	}
}
