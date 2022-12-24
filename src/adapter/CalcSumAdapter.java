package adapter;

public class CalcSumAdapter extends CalcSum {
	private SumByRecursive sumByRecursive = new SumByRecursive();
	
	@Override
	public int nSum(int n) {
		return sumByRecursive.nSum(n);
	}

	@Override
	public int nmSum(int n, int m) {
		return sumByRecursive.nmSum(n, m);
	}

}

//public class CalcSumAdapter extends CalcSum {
//	SumByFormula sumByFormula = new SumByFormula();
//	
//	@Override
//	public int nSum(int n) {
//		return sumByFormula.nSum(n);
//	}
//
//	@Override
//	public int nmSum(int n, int m) {
//		return sumByFormula.nmSum(n, m);
//	}
//
//}
