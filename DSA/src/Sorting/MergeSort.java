package Sorting;

public class MergeSort {
    public static void conquer(int[] arr,int ei,int si,int mid){
        int[] mergedArray=new int[ei-si+1];

        int idx1=si;
        int idx2=mid+1;
        int x=0;

        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]<=arr[idx2]){
                mergedArray[x++]=arr[idx1++];
            }else{
                mergedArray[x++]=arr[idx2++];
            }
        }
        while(idx1<=mid){
            mergedArray[x++]=arr[idx1++];
        }
        while(idx2<=ei){
            mergedArray[x++]=arr[idx2++];
        }
        for(int i=0,j=si;i<mergedArray.length;i++,j++){
            arr[j]=mergedArray[i];
        }
    }
    public static void divide(int[] arr,int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,ei,si,mid);
    }
    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {23, 32, 11, 34, 43, 55, 67, 76, 41, 87};
        int n = arr.length;

        System.out.print("Before Sorting: ");
        printArray(arr);
        System.out.println();

        System.out.print("After Sorting: ");
        divide(arr, 0, n - 1);
        printArray(arr);
        System.out.println();
    }

}
