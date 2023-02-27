package j12_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.
        Scanner input = new Scanner(System.in);

        int arr[] = new int[7];
        int i = 0;
        do {
            System.out.print((i+1) + ". item : ");
            arr[i] = input.nextInt();
            i++;

        } while (i < 6);
        Arrays.stream(arr).forEach(x->{
            if (x % 2 == 1) {
                System.out.println(x);
            }
        });

    }
}
