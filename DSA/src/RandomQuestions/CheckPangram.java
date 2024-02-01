package RandomQuestions;
import java.util.Arrays;
public class CheckPangram {
    public static boolean checkAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr = str1.toCharArray();
        char[] arr1 = str2.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr1);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr1[i]) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        String str1= "aeiou";
        String str2= "ouiea";

        System.out.println(checkAnagram(str1,str2));
    }
}
