package C242;

public class SummativeSums {


    public static int addIndex(int[] arr){
        int a = 0;

        for (int i =0; i < arr.length; i++){
            a += arr[i];    //
            // System.out.println(a); for checking all test adding with index
        }

        return a;
    }
    public static void main(String[] args) {
        int[] test1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] test2 = { 999, -60, -77, 14, 160, 301 };
        int[] test3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                140, 150, 160, 170, 180, 190, 200, -99 };

        System.out.println("#1 Array Sum: " + addIndex(test1));
        System.out.println("#2 Array Sum: " + addIndex(test2));
        System.out.println("#3 Array Sum: " + addIndex(test3));

    }



}
