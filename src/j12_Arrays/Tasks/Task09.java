package j12_Arrays.Tasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // Task -> Girilen 5 sayıyı , giriş sırasına göre tersten print eden code create ediniz

        Scanner input = new Scanner(System.in);

        int arr[] = new int[5];
        int i = 0;
        do {
            System.out.print((i+1) + ". number : ");
            arr[i] = input.nextInt();
            i++;
        } while (i < 5);

        for(i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
