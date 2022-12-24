package adapter;

public class Main {

	public static void main(String[] args) {
		CalcSum calcSum =new CalcSumAdapter();
		
		//0からnまでの総和を求める
		System.out.println(calcSum.nSum(10));
		//nからmまでの総和を求める
		System.out.print(calcSum.nmSum(5, 10));
		
	}

}
