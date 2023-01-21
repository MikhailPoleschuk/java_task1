import java.util.Arrays;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        int i = new Random().nextInt(2001);
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));
        int n = Integer.toBinaryString(i).length();
        System.out.println(n);
        int count_max = 0;
        int count_min = 0;
        int end = Short.MAX_VALUE;
        int[] m1 = new int[0];
        int[] m2 = new int[0];


        for (int j = i; j < end; j++) {
            if (j % i == 0) {
                int[] tmp1 = new int[m1.length + 1];

                for (int item = 0; item < tmp1.length-1; item++) {
                    tmp1[item] = m1[item];
                }
                tmp1[tmp1.length-1] = j;
                m1 = tmp1;


                count_max++;
            } else {
                int[] tmp2 = new int[m2.length + 1];

                for (int item = 0; item < tmp2.length-1; item++) {
                    tmp2[item] = m2[item];
                }
                tmp2[tmp2.length-1] = j;
                m2 = tmp2;
                count_min++;
            }
        }
        System.out.println(m1.length);
        System.out.println(m2.length);
        


    }



}