package j12_Arrays.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        // Task-> verilen bir array'den istenmeyen elemanı silip  kalanlari
        // yeni bir array'a atayıp print eden METHOD create ediniz

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};
        Scanner input = new Scanner(System.in);
        System.out.println("{3,4,2,3,5,7,3,8,5,2,4} What is the number getting rid of? :"); int num = input.nextInt();


        int[] newArr = new int[arr.length-1];
        int idx = 0;
        for (int i:arr) {
            if (i!= num) {
                newArr[idx++] = i;
            }
        }
        System.out.println(Arrays.toString(newArr));


    }
}
