package projectEluer;

/**
 * 197被称为圆周素数，因为将它逐位旋转所得到的数：197/971和719都是素数
 * <p>
 * 小于一百万的圆周素数有多少个
 */
public class Problem35 {
    static int N = 1000000;

    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i < N; i++) {
            if (checkCircle(i)) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("总个数：" + count);
    }

    public static boolean checkCircle(int num) {
        int temp = num;
        String str = num + "";
        // 个位数且是素数
        if (checkPrime(num)) {
            String firstStr = str.substring(1, str.length()) + (str.charAt(0) + "");
            int first = Integer.valueOf(firstStr);
            while (first != num) {
                if (!checkPrime(first)) {
                    return false;
                }
                firstStr = firstStr.substring(1, str.length()) + (firstStr.charAt(0) + "");
                first = Integer.valueOf(firstStr);
            }
            return true;
        }
        return false;
    }

    public static boolean checkPrime(int n) {
        for (int i = 2; i < n / 2+1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
