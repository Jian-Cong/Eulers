package projectEluer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Problem6 {
	/**
	 * 求1到100平方和与和的平方的差
	 * @param args
	 */
	public static void main(String[] args) {
		List<Long> sumSq = new ArrayList<>();
		List<Long> sqSum = new ArrayList<>();
		// 和的平方
		long suq = 0;
		// 平方和
		long squ = 0;
		for(long i=1;i<=100;i++){
			sumSq.add(i*i);
			sqSum.add(i);
		}
		suq = new BigDecimal(getsum(sqSum)).multiply(new BigDecimal(getsum(sqSum))).longValue();
		System.out.println("和的平方："+suq);
		squ = getsum(sumSq);
		System.out.println("平方和："+squ);
		System.out.println(new BigDecimal(suq).subtract(new BigDecimal(squ)));
	}
	
	public static long getsum(List<Long> list){
		long sum = 0;
		for(Long l:list){
			sum = new BigDecimal(sum).add(new BigDecimal(l)).longValue();
		}
		return sum;
	}

}
