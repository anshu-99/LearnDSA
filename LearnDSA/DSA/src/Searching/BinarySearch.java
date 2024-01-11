package Searching;

import java.util.Scanner;

public class BinarySearch {
    public static int searchElement(int[] arr,int n){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if(n==arr[mid]){
                return mid;
            }
            if(n>arr[mid]){
                start=mid+1;
            }
            if(n<arr[mid]){
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={12,21,33,41,45,53,22,10,65,69};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter element to search");
        int n=sc.nextInt();
        if(searchElement(arr,n)>=0){
            System.out.println("Present at:"+searchElement(arr,n)+" index");
        }else{
            System.out.println("Not Present");
        }
    }
}
