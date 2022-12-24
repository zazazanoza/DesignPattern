package adapter;

//再起呼び出しを利用して総和を求めるクラス
public class SumByRecursive {

	//0からnまでの総和を求める
	public int nSum(int n) {
		if (n == 0)
			return 0;
		if (n > 0)
			return nSum(n - 1) + n;
		else
			return nSum(n + 1) + n;
	}

	//nからmまでの総和を求める
	public int nmSum(int n, int m) {

		if (m == n)
			return m;

		//mの方が小さい場合、mからnまでの総和を求める
		if (m < n) {
			int temp = n;
			n = m;
			m = temp;
		}

		if (n > 0)
			return this.nSum(m) - this.nSum(n - 1);
		else if (m < 0)
			return this.nSum(n) - this.nSum(m + 1);
		else
			return this.nSum(m) + this.nSum(n);
	}

}
