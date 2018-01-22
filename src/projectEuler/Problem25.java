package projectEluer;

import java.math.BigDecimal;

public class Problem25 {

	public static void main(String[] args) {
		int n = 412;
//		System.out.println(fun(412,new BigDecimal(1),new BigDecimal(1)));
		String r = fun(n,new BigDecimal(1),new BigDecimal(1));
		while(String.valueOf(r).length()<1000){
			n++;
			r = fun(n,new BigDecimal(1),new BigDecimal(1));
		}
		System.out.println("4780个长度："+fun(4780,new BigDecimal(1),new BigDecimal(1)).length());
		System.out.println(n);

	}
	
	
	public static String  fun(long n,BigDecimal r1,BigDecimal r2){
		if(n ==0 ){
			return r1.toString();
		}
		return fun(n-1,r2,r1.add(r2));
	}

}
