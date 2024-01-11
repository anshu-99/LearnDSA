package Sorting;

public class QuickSort {
    public static int partition(int[] arr, int low, int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }
    public static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int pivotIdx=partition(arr,low,high);
            quickSort(arr,low,pivotIdx-1);
            quickSort(arr,pivotIdx+1,high);
        }
    }
    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr={54,43,56,67,76,44,21,12,53,34};
        int n=arr.length;
        System.out.print("Unsorted Array: ");
        printArray(arr);
        System.out.println();
        quickSort(arr,0,n-1);
        System.out.print("Sorted Array: ");
        printArray(arr);
    }
}
