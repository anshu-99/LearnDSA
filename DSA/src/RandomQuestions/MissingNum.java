package RandomQuestions;
import java.util.*;

public class MissingNum {
    public static int[] findMissingNum(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            if (arr[i] != i) {
                ans[i] = i;
            }
        }

        return ans;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 8};
        int[] result = findMissingNum(arr);
        printArr(result);
    }
}
