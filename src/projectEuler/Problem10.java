package projectEluer;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.ArrayList;
import java.util.List;

import projectEluer.thread.PrimeThread;

public class Problem10 {

	public static void main(String[] args) throws NumberFormatException, InterruptedException, ExecutionException {
		/*long ti = System.currentTimeMillis();
		long sum = 0;
		for(long i=2;i<500000;i++){
			if(check(i)){
				sum += i;
//				System.out.println("当前质数："+i);
			}
		}
		System.out.println("总用时："+(System.currentTimeMillis()-ti));
		System.out.println(sum);*/
		long ti = System.currentTimeMillis();
		System.out.println("开始计算");
		int size = 10;
		long cons = 50000;
		ExecutorService pool = Executors.newFixedThreadPool(size);
		List<Future> list = new ArrayList<>();
		for(int i=0;i<size;i++){
			long start = 0;
			if(i==0){
				start = 2;
			}else{
				start = cons*i;
			}
			long end = cons*(i+1);
			Callable c = new PrimeThread(start,end);
			Future f = pool.submit(c);
			list.add(f);
		}
		pool.shutdown();
		long sum = 0;
		for(Future fl:list){
			sum += Long.valueOf(fl.get().toString());
		}
		System.out.println("总用时："+(System.currentTimeMillis()-ti));
		System.out.println("和："+sum);
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
}
