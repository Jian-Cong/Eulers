package projectEluer;

import java.math.BigDecimal;

public class Problem9 {

	public static void main(String[] args) {
		int k = 0;
		int a = 0;
		int b = 0;		
		for(int i=3;i<1000;i++){
			for(int j=i+1;j<1000;j++){
				a = i;
				b = j;
				k = 1000-i-j;
				if(1000*1000-2*i*j == 2000*k){
					System.out.println("a="+i);
					System.out.println("b="+j);
					System.out.println("c="+k);
					break;
				}
			}
		}
		String l = new BigDecimal(a).multiply(new BigDecimal(b)).multiply(new BigDecimal(k)).toString();
		System.out.println("乘积为："+l);
	}

}
