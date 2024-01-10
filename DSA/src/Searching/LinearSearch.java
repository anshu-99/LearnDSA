package Searching;
import java.util.Scanner;
public class LinearSearch {
    public static int linearSearch(int[] arr,int n){
//        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={12,21,33,41,45,53,22,10,65,69};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter element to search");
        int n=sc.nextInt();
        if(linearSearch(arr,n)>=0){
            System.out.println("Present at:"+linearSearch(arr,n)+" index");
        }else{
            System.out.println("Not Present");
        }
    }
}
