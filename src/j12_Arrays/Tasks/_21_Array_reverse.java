package j12_Arrays.Tasks;

import java.util.Scanner;

public class _21_Array_reverse {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */

        //Kodu aşağıya yazınız.

        Scanner input = new Scanner(System.in);
        System.out.print("bi sayi :");int girdi = input.nextInt();

        String str = Integer.toString(girdi);
        char[] ch = str.toCharArray();
        str = "";
        for (char c : ch) {
            str = c + str;
        }
        System.out.println("cikti = " + str);

    }
}



