package projectEluer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Problem20 {

	public static void main(String[] args) {
		JC();
	}
	
	public static void JC(){
		BigDecimal mul = new BigDecimal(1);
		int i=100;
		while(i>1){
			mul = mul.multiply(new BigDecimal(i));
			i--;
		}
		sum(mul);
	}
	
	public static void sum(BigDecimal mul){
		List<Integer> list = new ArrayList<>();
		System.out.println("mul:"+mul);
		int mod = 0;
		BigDecimal divs = mul;
		for(int i=0;i<divs.toString().length();i++){
			mod = Integer.valueOf(divs.toString().charAt(i)+"");
			list.add(mod);
		}
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+",");
			if(i != 0 && i%10==0){
				System.out.println();
			}
		}
		getsum(list);
	}
	
	public static void getsum(List<Integer> list){
		long sum = 0;
		for(int i=0;i<list.size();i++){
			sum += list.get(i);
		}
		System.out.println(sum);
	}

}
