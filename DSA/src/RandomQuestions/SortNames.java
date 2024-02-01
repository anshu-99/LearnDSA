package RandomQuestions;
import java.util.*;
public class SortNames {
    public static void sortName(String[] arr){
        Arrays.sort(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        String[] arr={"Udbhav", "Anubha","Anant","Satyam","Shubham"};
        sortName(arr);
    }
}
