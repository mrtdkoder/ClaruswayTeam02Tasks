package j12_Arrays.Tasks;

import java.util.Scanner;

public class Task05 {


    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.
        Scanner input = new Scanner(System.in);
        System.out.print("an int :"); int anInt = input.nextInt();

        char[] chrArray = (anInt+"").toString().toCharArray();
        for (int i=chrArray.length-1; i>=0; i--) {
            System.out.print(chrArray[i]);
        }

    }

}
