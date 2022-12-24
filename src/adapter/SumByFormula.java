package adapter;

//公式を用いて総和を求めるクラス
public class SumByFormula {

	//0からnまでの総和
	public int nSum(int n) {
		if (n == 0)
			return 0;
		if (n > 0)
			return n * (n + 1) / 2;
		else
			return n * (1 - n) / 2;
	}

	//nからmまでの総和
	public int nmSum(int n, int m) {

		if (m == n)
			return m;

		//mの方が小さい場合、mからnまでの総和を求める
		if (m < n) {
			int temp = n;
			n = m;
			m = temp;
		}
		return (m - n + 1) * (n + m) / 2;

	}

}
