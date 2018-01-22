package projectEluer;

import java.util.*;

/**
 * 若三边长{a,b,c}均为整数的直角三角形周长为p，当p = 120时，恰好存在三个不同的解：

 {20,48,52}, {24,45,51}, {30,40,50}
 在所有的p ≤ 1000中，p取何值时有解的数目最多
 */
public class Problem39 {

    public static void main(String[] args){
        Map<Integer,Integer> map = new TreeMap<>();
        for(int i=12;i<=1000;i++){
            map.put(fun(i),i);
        }
        Set<Integer> set = map.keySet();
        int max = 0;
        TreeSet<Integer> treeSet = new TreeSet<>(set);
        Iterator it = treeSet.iterator();
        while(it.hasNext()){
            int temp = (Integer) it.next();
            max = max>temp?max:temp;
            System.out.println(temp);
        }
        System.out.println("最大："+max/6);
        System.out.println("最大p："+map.get(max));
    }

    public static int fun(int p){


        int count = 0;
        int a = 1;
        int b = 1;
        int c = 1;
        for(a = 1;a<p/2;a++){
            for(b = 1;b<p/2;b++){
                c = p -a -b;
                if(check(a,b,c)){
                    count++;
                    if(p == 1000) {
                        System.out.println(a + ":" + b + ":" + c + ":");
                    }
                }
            }
        }
        return count;
    }

    public static boolean check(int a,int b,int c){
        if(a+b >c && a+c>b && b+c >a){
            if(((square(a)+square(b)) == square(c)) || ((square(a)+square(c)) == square(b)) || ((square(c)+square(b)) == square(a))){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    public static int square(int a){
        return a*a;
    }
}
