package projectEluer;

/**
 *
 * 找出所有各位数字的阶乘和等于其本身的数，并求它们的和
 */
public class Problem34 {

    public static void main(String[] args) {
        int sum = 0;
        for(int i=10;i<10*fun(9,1);i++){
//        for(int i=10;i<146;i++){
            String str = i+"";
            if(str.length() == 2 && str.contains("5")){
//                i = 100;
                continue;
            }
            if(str.length() == 3 && str.contains("7")){
//                i = 1000;
                continue;
            }
            if(str.length() == 4 && str.contains("8")){
//                i = 10000;
                continue;
            }
            if(str.length() == 5 && str.contains("9")){
//                i = 100000;
                continue;
            }
            int res = check(i);
            if(res > 0) {
                System.out.println(res);
                sum += res;
            }
        }
        System.out.println("结果为："+sum);

    }

    public static int fun(int n,int mul){
        if(n == 1 || n == 0){
            return mul;
        }
        return fun(n-1,n*mul);
    }

    public static int check(int n){
        String str = n+"";
        int sum = 0;
        for(int i=0;i<str.length();i++){
//            System.out.println(Integer.valueOf(str.charAt(i)+""));
            sum += fun(Integer.valueOf(str.charAt(i)+""),1);
        }
        if(sum == n){
            return  sum;
        }
        return 0;
    }

}
