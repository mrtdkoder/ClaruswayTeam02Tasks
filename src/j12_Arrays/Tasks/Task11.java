package j12_Arrays.Tasks;

import java.util.Arrays;

public class Task11 {
    static int Dolar=0;
    static int pound=0;
    public static void main(String[] args) {
        /*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup print eden code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String[] arr = str.split(" ");

        Arrays.stream(arr).forEach(i -> {
            if (i.startsWith("$")) addDolar(i);
            if (i.startsWith("£")) addPound(i);
        });
        System.out.println("Dolar = " + Dolar +" Pound = " + pound);
    }

    private static void addPound(String args) {
        if (args.startsWith("£")) {
            pound += Integer.parseInt(args.substring(1));
        }
    }

    public static void addDolar(String args) {
        if (args.startsWith("$")) {
            Dolar += Integer.parseInt(args.substring(1));
        }
    }
}
