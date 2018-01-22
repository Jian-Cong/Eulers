package projectEluer;

/**
 * 0-9全数字
 * 子串的可整除性
 *
 */
public class Problem43 {
    public static void main(String[] args){
        long sum = 0;
        for(long i=1023456789;i<9876543210l;i++){
            if(check(i) && checkChild(i)){
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println("总和："+sum);
//        System.out.println(check(1406357289) && checkChild(1406357289));

    }

    /**
     * 检查是否是全数字
     * @return
     */
    public static boolean check(long num){
        String str = num+"";
        for(int i=0;i<10;i++){
            if(!str.contains(i+"")){
                return false;
            }
        }
        return true;
    }

    public static boolean checkDivide(int num){
        for(int i=2;i<num/2;i++){
            if(num%i == 0){
                return true;
            }else{
                continue;
            }
        }
        return false;
    }

    public static boolean checkChild(long num){
        String str = num +"";
        for(int j = 3;j<str.length();j++) {
            for (int i = 1; i <j; i++) {
                String s = str.substring(i, i + j);
                if (!checkDivide(Integer.valueOf(s))) {
                    return false;
                }
            }
        }
        return true;
    }

}
