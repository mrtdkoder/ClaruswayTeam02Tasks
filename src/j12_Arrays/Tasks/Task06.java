package j12_Arrays.Tasks;

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlarını buyukten kucuge siralayip return eden METHOD create ediniz
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(reverseSort(array)));
    }

    public static int[] reverseSort(int[] array) {
        Arrays.sort(array);
        int[] result = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            result[array.length-i-1] = array[i];
        }
        return result;
    }

}
