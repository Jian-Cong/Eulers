package projectEluer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Problem11 {
	public static String[][] num = new String[20][];
	public static void main(String[] args) {
		List<Long> list = new ArrayList<>();
		Map<Long,String> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int i=0;
		boolean isDone = false;
		while(!isDone ){
			String s = sc.nextLine();
			if(s.equals("q")){
				isDone = true;
				sc.close();
			}else if(s != null && s.contains(" ")){
				num[i]=s.split(" ");
			}
			i++;
		}

		for(int a=0;a<17;a++){
			for(int b=0;b<20;b++){
				if(a<17 && b<17){
					long down = down(a,b);
					System.out.println((a+1)+"行"+(b+1)+"列下"+down);
					list.add(down);
					map.put(down, "第"+(a+1)+"行"+(b+1)+"列下"+num[a][b]+","+num[a+1][b]+","+num[a+2][b]+","+num[a+3][b]);
					long right = right(a,b);
					System.out.println((a+1)+"行"+(b+1)+"列右"+right);
					list.add(right);
					map.put(right, "第"+(a+1)+"行"+(b+1)+"列右"+num[a][b]+","+num[a][b+1]+","+num[a][b+2]+","+num[a][b+3]);
					long adjacent = adjacent(a,b);
					System.out.println((a+1)+"行"+(b+1)+"列正对角"+adjacent);
					list.add(adjacent);
					map.put(adjacent, "第"+(a+1)+"行"+(b+1)+"列正对角"+num[a][b]+","+num[a+1][b+1]+","+num[a+2][b+2]+","+num[a+3][b+3]);
					if(b>=3){
						long ob = obadjacent(a, b);
						System.out.println((a+1)+"行"+(b+1)+"列反对角"+ob);
						list.add(ob);
						map.put(ob, "第"+(a+1)+"行"+(b+1)+"列反对角"+num[a][b]+","+num[a+1][b-1]+","+num[a+2][b-2]+","+num[a+3][b-3]);
					}
				}else if(b>= 17){
					long ob = obadjacent(a, b);
					System.out.println((a+1)+"行"+(b+1)+"列反对角"+ob);
					list.add(ob);
					map.put(ob, "第"+(a+1)+"行"+(b+1)+"列反对角"+num[a][b]+","+num[a+1][b-1]+","+num[a+2][b-2]+","+num[a+3][b-3]);
				}
			}
			System.out.println((a+1)+"行结束>>>>>>>>>>>>>>");
		}
		long max = list.get(0);
		for(int m=0;m<list.size();m++){
			if(list.get(m) > max){
				max = list.get(m);
			}
		}
		if(map.containsKey(max)){
			System.out.println("最大值："+max);
			System.out.println(map.get(max));
		}else{
			System.out.println("error");
		}
		
	}
	
	public static long down(int a, int b){
		long mul = 1;
		for(int i =0;i<4;i++){
			mul = new BigDecimal(mul).multiply(new BigDecimal(num[a+i][b])).longValue();
		}
		return mul;
	}
	
	public static long right(int a, int b){
		long mul = 1;
		for(int i =0;i<4;i++){
			mul = new BigDecimal(mul).multiply(new BigDecimal(num[a][b+i])).longValue();
		}
		return mul;
	}
	
	public static long adjacent(int a, int b){
		long mul = 1;
		for(int i =0;i<4;i++){
			mul = new BigDecimal(mul).multiply(new BigDecimal(num[a+i][b+i])).longValue();
		}
		return mul;
	}
	
	public static long obadjacent(int a, int b){
		long mul = 1;
		for(int i =0;i<4;i++){
			mul = new BigDecimal(mul).multiply(new BigDecimal(num[a+i][b-i])).longValue();
		}
		return mul;
	}

}
