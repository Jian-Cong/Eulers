package projectEluer;

import java.util.ArrayList;
import java.util.List;

public class Problem30 {

	public static void main(String[] args) {
		boolean flg = true;
		List<Integer> list = new ArrayList<>();
		int i=2;
		while(flg && i<200000){
			if(i == fun(i)){
				System.out.println(">>>"+i);
				list.add(i);
			}
			i++;
		}
		int sum = 0;
		for(Integer j:list){
			sum+= j;
		}
		System.out.println(sum);
	}
	
	public static int fun(int n){
		int sum = 0;
		String goal = n+"";
		for(int i=0;i<goal.length();i++){
			sum += multi(Integer.valueOf(goal.charAt(i)+""));
		}
		return sum;
	}
	
	public static int multi(int n){
		return (int) Math.pow(n, 5);
	}

}
