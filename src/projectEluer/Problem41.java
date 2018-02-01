package projectEluer;

/**
 * 如果一个n位数恰好使用了1至n每个数字各一次，我们就称其为全数字的。例如，2143就是一个4位全数字数，同时它恰好也是一个素数。
 * 最大的全数字的素数是多少
 *
 */
public class Problem41 {
    private static long N = 987654321;
    public static void main(String[] args){
        long max = 0;
        for(long i=2143;i<N;i++){
            StringBuilder s = new StringBuilder(i+"");
            if(!s.toString().contains("0")) {
                // 位数
                int len = s.toString().length();
                //
                int first = Integer.valueOf(s.toString().substring(0, 1));
                if (first <= len) {
                    if (check(i) && checkPrime(i)) {
                        max = i;
                        System.out.println(max);
                    }
                } else {
                    switch (len) {
                        case 4:
                            i = 9999;
                            break;
                        case 5:
                            i = 99999;
                            break;
                        case 6:
                            i = 999999;
                            break;
                        case 7:
                            i = 9999999;
                            break;
                        case 8:
                            i = 99999999;
                            break;
                    }
                }
            }
        }
        System.out.println("最大为："+max);
    }

    public static boolean check(long num){
        String str = num+"";
        int length = str.length();
        for(int i=1;i<=length;i++){
            if(str.contains(i+"")){
                continue;
            }else {
                return false;
            }
        }
        return true;
    }

    public static boolean checkPrime(long n) {
        for (long i = 2; i < n / 2+1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
