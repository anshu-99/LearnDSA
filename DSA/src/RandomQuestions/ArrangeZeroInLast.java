package RandomQuestions;

public class ArrangeZeroInLast {
    public static void arrangeZero(int[] arr) {
        int nonZero=0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[nonZero];
                arr[nonZero] = temp;
                nonZero++;
            }
        }
    }
    public static void printArr(int[]  arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr={2,4,0,1,0,5,9,0};
        arrangeZero(arr);
        printArr(arr);
    }
}
