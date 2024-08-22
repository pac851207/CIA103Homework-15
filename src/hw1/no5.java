package hw1;

//某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本金加利息共有多少錢 (用複利計算，公式請自行google)
//A = P (1 + r/n)^(nt)
//其中A為最終的本利和，P為本金，r為年利率，n為計息次數，t為投資年限。
public class no5 {
	public static void main(String[] args) {
		double p = 1500000;
		double r = 1.02;
		//double n = 10;
		double year1 = p*r;
		double year2 = year1*r;
		double year3 = year2*r;
		double year4 = year3*r;
		double year5 = year4*r;
		double year6 = year5*r;
		double year7 = year6*r;
		double year8 = year7*r;
		double year9 = year8*r;
		double year10 = year9*r;
		
		System.out.println(year10);
	}
}
