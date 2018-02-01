package projectEluer;

import java.math.BigDecimal;

public class Project58 {

	public static void main(String[] args) {
		long squareSize = 13;
		long count = 8;
		double rate = new BigDecimal(count).divide(new BigDecimal(squareSize),10, BigDecimal.ROUND_HALF_UP)
				.doubleValue();
		long i=7;
		for(;rate>=0.1;i=i+2){
			for(int j=1;j<=4;j++){
				if(j!=4){
					long num = (i-2)*(i-2)+(i-1)*j;
					if(checkPrime(num)){
						count++;
					}
				}
			}
			squareSize = i*2-1;
			rate = new BigDecimal(count).divide(new BigDecimal(squareSize),10,BigDecimal.ROUND_HALF_UP)
					.doubleValue();
			System.out.println(i+"阶,素数"+count+"个，对角数"+squareSize+"个"+"比例为"+rate);
		}
		System.out.println(i+"阶,素数"+count+"个，对角数"+squareSize+"个"+"比例为"+rate);
	}
	
	public static boolean checkPrime(long n) {
        for (long i = 2; i < n / 2+1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
