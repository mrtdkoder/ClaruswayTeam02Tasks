package j12_Arrays.Tasks;

import java.util.Arrays;

public class Task18 {
    // task-> sayi arr'deki iç arr'lerin toplamını yeni bir arr'ya atayıp print eden code create ediniz
// input :int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};
// output : int yeniArr[]={6,11,-7}
    public static void main(String[] args) {
        int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};
        int l = sayi.length;
        int yeniArr[] = new int[l];
        for (int a=0; a < l;  a++) {
           int ttl =0;
//            for (int b: sayi[a]) {
//                ttl += b;
//            }
            ttl = Arrays.stream(sayi[a]).sum();

            yeniArr[a] = ttl;
        }

        System.out.println("Arrays.toString(yeniArr) = " + Arrays.toString(yeniArr));
    }
}
