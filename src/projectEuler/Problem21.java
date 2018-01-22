package projectEluer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Problem21 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		for(int i=1;i<10000;i++){
			if(functionD(i)){
				set.add(i);
				set.add(func(i));
				System.out.println(i+"<=>"+func(i));
			}
		}
		int sum = 0;
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()){
			sum += it.next();
		}
		System.out.println(sum);
	}
	
	public static boolean functionD(int num){
		int dFun = func(num);
		if(num == func(dFun) && num != dFun){
			return true;
		}
		return false;
	}
	
	public static int func(int num){
		int sum = 1;
		for(int i=2;i<Math.sqrt(num);i++){
			if(num%i == 0){
				sum += i;
				if(i !=num/i){
					sum += num/i;
				}
			}
		}
		return sum;
	}
	
	

}
