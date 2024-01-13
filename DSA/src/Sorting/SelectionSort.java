package Sorting;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int smallIdx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallIdx]>arr[j]){
                    smallIdx=j;
                }
            }
            int temp=arr[smallIdx];
            arr[smallIdx]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr={33,22,11,55,43,32,21};
        System.out.print("Before Sorting:");
        printArray(arr);
        System.out.println();
        System.out.print("After Sorting:");
        selectionSort(arr);
        printArray(arr);
    }
}
