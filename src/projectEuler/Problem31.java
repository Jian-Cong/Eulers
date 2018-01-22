package projectEluer;

import java.util.ArrayList;
import java.util.List;

public class Problem31 {
    static int goal = 10;
    static int count = 0;

    public static void main(String[] args) {
        int[] array = {1, 2, 5, 10, 20, 50, 100, 200};
        int sum = 0;
        for (int a = 0; a <= 200; a++) {
            int asum = a * array[0];
            sum += asum;
            if (sum == goal) {
                count++;
                System.out.println("1*"+a);
                sum -= asum;
                continue;
            }
            if (sum < 200) {
                for (int b = 0; b <= 100; b++) {
                    int bsum = b * array[1];
                    sum += bsum;
                    if (sum == goal) {
                        count++;
                        System.out.println("1*"+a+"+2*"+b);
                        sum -= bsum;
                        continue;
                    }
                    if (sum < 200) {
                        for (int c = 0; c <= 40; c++) {
                            int csum = c * array[2];
                            sum += csum;
                            if (sum == goal) {
                                count++;
                                System.out.println("1*"+a+"+2*"+b+"+5*"+c);
                                sum -= csum;
                                continue;
                            }
                            if (sum < 200) {
                                for (int d = 0; d <= 20; d++) {
                                    int dsum = d * array[3];
                                    sum += dsum;
                                    if (sum == goal) {
                                        count++;
                                        System.out.println("1*"+a+"+2*"+b+"+5*"+c+"+10*"+d);
                                        sum -= dsum;
                                        continue;
                                    }
                                    if (sum < 200) {
                                        for (int e = 0; e <= 10; e++) {
                                            int esum = e * array[4];
                                            sum += esum;
                                            if (sum == goal) {
                                                count++;
                                                System.out.println("1*"+a+"+2*"+b+"+5*"+c+"+10*"+d+"+20*"+e);
                                                sum -= esum;
                                                continue;
                                            }
                                            if (sum < 200) {
                                                for (int f = 0; f <= 4; f++) {
                                                    int fsum = f * array[5];
                                                    sum += fsum;
                                                    if (sum == goal) {
                                                        count++;
                                                        System.out.println("1*"+a+"+2*"+b+"+5*"+c+"+10*"+d+"+20*"+e+"+50*" + f);
                                                        sum -= fsum;
                                                        continue;
                                                    }
                                                    if (sum < 200) {
                                                        for (int g = 0; g <= 2; g++) {
                                                            int gsum = g * array[6];
                                                            sum += gsum;
                                                            if (sum == goal) {
                                                                count++;
                                                                System.out.println("50*" + f + "+100*" + g);
                                                                sum -= gsum;
                                                                continue;
                                                            }
                                                            if (sum < 200) {
                                                                for (int h = 0; h <= 1; h++) {
                                                                    int hsum = h * array[7];
                                                                    sum += hsum;
                                                                    if (sum == goal) {
                                                                        count++;
                                                                        System.out.println("50*" + f + "+100*" + g + "+200*" + h);
                                                                        sum -= hsum;
                                                                        continue;
                                                                    }
                                                                    sum -= hsum;
                                                                    sum = sum > 0 ? sum : 0;
                                                                }
                                                            }
                                                            sum -= gsum;
                                                            sum = sum > 0 ? sum : 0;
                                                        }
                                                    }
                                                    sum -= fsum;
                                                    sum = sum > 0 ? sum : 0;
                                                }
                                            }
                                            sum -= esum;
                                            sum = sum > 0 ? sum : 0;
                                        }
                                    }
                                    sum -= dsum;
                                    sum = sum > 0 ? sum : 0;
                                }
                            }
                            sum -= csum;
                            sum = sum > 0 ? sum : 0;
                        }
                    }
                    sum -= bsum;
                    sum = sum > 0 ? sum : 0;
                }
            }
            sum = 0;
            sum = sum > 0 ? sum : 0;
        }
        System.out.println(count);
    }
}
