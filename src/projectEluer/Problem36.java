package projectEluer;

import java.util.ArrayList;
import java.util.List;

/**
 * 找出所有小于一百万，且在十进制和二进制下均回文的数，并求它们的和
 */

public class Problem36 {
    static int N = 1000000;
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1;i<N;i++){
            if(checkHuiwen(i ) && checkHuiwen(Integer.toBinaryString(i ))){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("合计："+sum);


    }

    public static boolean checkHuiwen(int n) {
        String res = n + "";
        StringBuilder sb = new StringBuilder();
        for (int i = res.length() - 1; i >= 0; i--) {
            sb.append(res.charAt(i) + "");
        }
        if (sb.toString().equals(res)) {
            return true;
        }
        return false;
    }

    public static boolean checkHuiwen(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i)+"");
        }
        if(sb.toString().equals(str)){
            return true;
        }
        return false;
    }
}
