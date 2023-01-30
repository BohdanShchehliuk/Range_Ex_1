import java.lang.reflect.Array;
import java.util.Arrays;

public class User {

    public static void main(String[] args) {
        System.out.println(rangeExtraction(new int[]{-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20}));
    }

    public static String rangeExtraction(int[] arr) {
        Arrays.sort(arr);
        String s = "";

        for (int i = 0; i < arr.length; i++) {
            int numb = 0;
int kor = i;
            for (int k = i; k < arr.length; k++) {

                if (k+1<arr.length&&arr[k] + 1 == arr[k + 1]) {
                    numb = numb + 1;
                } else {
                    if (numb >= 2) {
                        s = s + arr[i] + "-" + arr[k] + ",";
i = k;
                    } else {
                        s = s + arr[i] + ",";
                    }

                    k = arr.length;
                }
            }
        }
        return s.substring(0, s.length() - 1);
    }
}
