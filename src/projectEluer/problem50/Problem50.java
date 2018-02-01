package projectEluer.problem50;

import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.Map;

public class Problem50 implements  Callable<String>{
    private long begin;
    private long end;

    public Problem50(long begin,long end,int i){
        this.begin = begin;
        this.end = end;
        Thread.currentThread().setName("Thread"+i);
    }

    public String call() {
        long res = 0;
        int count = 0;
        try {
            for (long i = begin; i < end; i++) {
                if (checkPrime(i)) {
                    Thread.sleep(100);
                    int temp = check(i);
                    if (count < temp) {
                        count = temp;
                        res = i;
//                        System.out.println(Thread.currentThread().getName()+"-"+res+"能连续"+count+"次累加");
                    }
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return count+"-"+res;
    }
    public static int check(long num){
        long sum = 0;
        int count = 0;
        StringBuilder s = null;
        for(long j=2;j<num;j++) {
            sum = 0;
            count = 0;
            s = new StringBuilder(num+"=");
            for (long i = j; sum < num; i++) {
                if (checkPrime(i)) {
                    count ++;
                    s.append(i + "+");
                    sum += i;
                    if (sum == num) {
                        System.out.println(Thread.currentThread().getName()+"-"+"正解：" + num+"连续"+count+"次"+s.toString().substring(0,s.toString().length()-1));
                        return count;
                    }
                }
            }
        }
//        System.out.println(s.toString().substring(0,s.toString().length()-1));
        return count;
    }

    /**
     *
     * 判断是否是素数
     * @param n
     * @return
     */
    public static boolean checkPrime(long n) {
        for (long i = 2; i < n / 2+1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
