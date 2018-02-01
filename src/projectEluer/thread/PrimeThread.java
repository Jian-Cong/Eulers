package projectEluer.thread;

import java.util.concurrent.Callable;

public class PrimeThread implements Callable<Long>{
	private long start;
	private long end;
	private long sum;
	
	public PrimeThread(long start,long end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public Long call() throws Exception {
		System.out.println("开始计算"+start+"到"+end+"的质数和");
		for(long i=start;i<end;i++){
			if(check(i)){
				sum += i;
			}
		}
		System.out.println(start+"到"+end+"计算结束");
		return sum;
	}
	
	public static boolean check(long num){
		boolean flg = true;
		for(long i=2;i<num;i++){
			if(num % i == 0){
				flg = false;
				break;
			}
		}
		return flg;
	}
	
	/*public static void main(String[] args){
		PrimeThread p = new PrimeThread("1", 2,10);
		p.start();
		System.out.println(p.getSum());
	}*/

	

}
