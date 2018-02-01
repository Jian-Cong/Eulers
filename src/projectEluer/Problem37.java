package projectEluer;

/**
 * 只有11个素数，无论从左往右还是从右往左逐一截去数字，剩下的仍然都是素数，求这些数的和
 *
 * 1不是质数也不是合数
 */
public class Problem37 {

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 10; i <= 739397; i++) {
            if (checkPrime(i) && checkLeft(i)) {
                System.out.println(i);
                count++;
                sum += i;
            }
        }
        System.out.println("合计：" + sum);
    }

    public static boolean checkLeft(int num) {
        int temp = num;
        String str = num + "";
        int length = str.length();
        int i = 1;
        String firstStr = str.substring(1, length--);
        int first = Integer.valueOf(firstStr);
        while (length > 0) {
            if (!checkPrime(first)) {
                return false;
            }
            if (length > 1) {
                firstStr = firstStr.substring(1, length--);
                first = Integer.valueOf(firstStr);
            } else {
                firstStr = firstStr.substring(0, 1);
                first = Integer.valueOf(firstStr);
                if (!checkPrime(first)) {
                    return false;
                }
                length = 0;
            }
        }
        length = str.length();
        String rightStr = str.substring(0, --length);
        int right = Integer.valueOf(rightStr);
        while (length > 0) {
            if (!checkPrime(right)) {
                return false;
            }
            if (length > 1) {
                rightStr = rightStr.substring(0, --length);
                right = Integer.valueOf(rightStr);
            } else {
                rightStr = rightStr.substring(0, 1);
                right = Integer.valueOf(rightStr);
                if (!checkPrime(right)) {
                    return false;
                }
                length = 0;
            }
        }
        return true;
    }

//    public static boolean checkRight(int num) {
//        int temp = num;
//        String str = num + "";
//        int length = str.length()-1;
//        int i=1;
//        while (length > 0) {
//            String firstStr = str.substring(0, length);
//            int first = Integer.valueOf(firstStr);
//            if (!checkPrime(first)) {
//                return false;
//            }
//            length++;
//        }
//        return true;
//    }


    public static boolean checkPrime(int n) {
        for (int i = 2; i < n / 2 + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        if(n == 1){
            return false;
        }
        return true;
    }
}

////        11
////        13
////        17
//        23
////        31
//        37
//        53
////        71
//        73
////        113
////        131
////        137
////        173
////        197
////        311
//        313
//        317
//        373
//        797
////        1373
////        1997
//        3137
////        3797
////        7331
////        73331
//        739397
