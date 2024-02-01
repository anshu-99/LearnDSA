package RandomQuestions;
import java.util.*;
public class CheckPalindrome {
    static boolean checkPalin(String str , String str1){
        if(str.length() != str1.length()){
            return false;
        }
        StringBuilder sb= new StringBuilder(str1);
        sb.reverse();

        return str.contentEquals(sb);
    }
    static public void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter Strings to check");
        String str = sc.nextLine();
        String str1= sc.nextLine();
        System.out.println(checkPalin(str,str1));
    }
}
