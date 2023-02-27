package j12_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /* TASK :
        Girilen 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden  code create ediniz (negatif sayilar dahil )

         */
        Scanner input = new Scanner(System.in);

        int arr[] = new int[8];
        int i = 0;
        do {
            System.out.print((i+1) + ". item : ");
            arr[i] = input.nextInt();
            if (arr[i]>-1) {
                i++;
            }
        } while (i < 8);

        Arrays.stream(arr).forEach(x -> {
            if (x%3==0) {
                System.out.print(x + " ");
        }});

    }

}
