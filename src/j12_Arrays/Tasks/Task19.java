package j12_Arrays.Tasks;

public class Task19 {
    public static void main(String[] args) {
        //Task-> Asagidaki multi dimensional array'lerin ic array'lerinde ayni index'e sahip
        // elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru)
        // arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }

        int[][] arr1 = { {1,2}, {3,4,5}, {6} } , arr2 = { {7,8,9}, {10,11}, {12} };



        for (int i=0; i<arr1.length; i++) {
            for (int j=0; j<arr1[i].length;j++){
                if (j>arr2[i].length-1) {
                    break;
                }
                System.out.printf("arr1[%d][%d] : %d + arr2[%d][%d] : %d = %d \n", i,j, arr1[i][j], i,j, arr2[i][j], arr1[i][j]+arr2[i][j]);
            }
        }

    }
}
