package Searching;
import java.util.*;
public class BinaryUsingCollections {
    public static void main(String[] args) {
        int[] arr={12,23,43,55,65,11,21,32,46};
        Scanner sc= new Scanner(System.in);
        Arrays.sort(arr);
        System.out.println("enter element to search");
        int num=sc.nextInt();
        int i=Arrays.binarySearch(arr,num);
        System.out.println("Present at "+(i+1)+" position and "+i+" index");
    }
}
