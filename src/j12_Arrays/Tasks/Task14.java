package j12_Arrays.Tasks;

import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
         verilen Stringde bulunan rakamların toplamını print eden parametreli METHOD create ediniz.
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */

        String str = "ade1r4d3";
        toplamYazdir(str);
    }

    private static void toplamYazdir(String str) {
        char[] charArray = str.toCharArray();
        int ttl = 0;
        for (char c : charArray) {
            if (Character.isDigit(c)) {
                ttl+=Integer.valueOf(c+"");
            }
        }
        System.out.println("ttl = " + ttl);
    }


}

