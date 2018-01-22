package projectEuler;

import java.math.BigDecimal;

public class Problem16 {

    public static void main(String[] args) {
        long no = 1000;
        String res = fun(no);
        System.out.println("计算结果:"+res);
        System.out.println(sum(res));
    }

    public static String fun(long no){
        BigDecimal mul = new BigDecimal("32768");
        for(int i=15;i<no;i++){
            mul = mul.multiply(new BigDecimal("2"));
        }
        return mul.toString();
    }

    public static long sum(String res){
        long sum = 0;
        if(res.length() > 0){
            for (int i=0;i<res.length();i++){
                if(Integer.valueOf(res.charAt(i)+"") >= 0 ){

                    sum += Integer.valueOf(res.charAt(i)+"");
                }
            }
        }
        return sum;
    }
    public static void fun(){
    }

}
