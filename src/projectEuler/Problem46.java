package projectEluer;

/**
 * 每个奇合数可以写成一个素数和一个平方的两倍之和
 *
 * 最小的不能写成一个素数和一个平方的两倍之和的奇合数是多少
 */
public class Problem46 {

    public static void main(String[] args){
        long index = 33;
        boolean flg = true;
        index = index+2;
        for(;flg;index = index +2){
            // 是否是奇合数
            if(checkOddComposite(index)){
                //
                long j = index-1;
                boolean eq = false;
                for(;j>1;j--){
                    if(checkPrime(j)){
                        eq = checkFormula(index,j);
                        if(eq){
                            j = 1;
                        }
                    }
                }
                if(!eq && j == 1){
                    flg = false;
                    System.out.println("结束---"+index);
                }
            }
        }

    }

    /**
     * 检查是否是合数
     * @param num
     * @return
     */
    public static boolean checkOddComposite(long num){
        for(long i = 2;i<num/2;i++){
            if(num % i == 0){
                return true;
            }
        }
        return false;
    }

    /**
     * 检查是否是素数
     * @param num
     * @return
     */
    public static boolean checkPrime(long num){
        for(long i = 2;i<num/2;i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

    /**
     * 检查是否满足等式
     * @param num
     * @param prime
     * @return
     */
    public static boolean checkFormula(long num,long prime){
        int i = 1;
        long temp = prime + 2*i*i;
        for(;temp <= num;i++){
            temp = prime + 2*i*i;
            if(temp == num){
                System.out.println(num+"="+prime+"+"+"2*"+i+"*"+i);
                return true;
            }
        }
        return false;
    }
}
