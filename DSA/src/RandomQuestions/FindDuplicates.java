package RandomQuestions;
import java.util.*;
public class FindDuplicates {
    public static HashSet<Integer> getDuplicates(int[] arr){
        HashSet<Integer> ans = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    ans.add(arr[i]);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={2,1,2,3,4,1,4,3,5,6,5,7,11,21,22,33,11,34};
        System.out.println(getDuplicates(arr));
    }
}
