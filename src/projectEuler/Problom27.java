package projectEluer;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;;

public class Problom27 {
	private static TreeMap<Integer,String> map = new TreeMap<>();

	public static void main(String[] args) {
		int N = 1000;
        for(int i=-999;i<N;i++){
            for(int j=-999;j<N;j++){
                fun(i,j);
            }
        }
        Set<Integer> set = map.keySet();
        TreeSet<Integer> treeSet = new TreeSet<>(set);
        String res = map.get(treeSet.last());
        System.out.println(res);
        

	}
	
	public static void fun(int a,int b){
        int res = b;
        int n = Math.abs(a);
        int count = 0;
        for(int i=0;i<=n;i++){
            res = i*i+a*i+b;
            if(!check(Math.abs(res))){
                break;
            }
            count++;
        }
        StringBuilder formula = new StringBuilder("n*n");
        if(a>0){
            formula.append("+"+a+"*n");
        }else if(a<0){
        	formula.append(a+"*n");
        }
        if(b>0){
        	formula.append("+"+b);
        }else if(b<0){
        	formula.append(b);
        }
        map.put(count,formula.toString());
    }

    public static boolean check(int num){
        boolean flg = true;
        for(int i=2;i<num;i++){
            if(num%i == 0){
                flg = false;
                break;
            }
        }
        return flg;
    }

}
