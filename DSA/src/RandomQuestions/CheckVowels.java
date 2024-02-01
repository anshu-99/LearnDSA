package RandomQuestions;

import java.util.Scanner;

public class CheckVowels {
    public static void checkVowels(String str){
        int v = 0;
        int c = 0;
        for(int i = 0; i < str.length(); i++){
            char currentChar = Character.toLowerCase(str.charAt(i)); // Convert to lowercase for case-insensitivity
            if(currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u'){
                v++;
            } else {
                // If the character is not a space, increment consonant count
                if(currentChar != ' '){
                    c++;
                }
            }
        }
        System.out.println("Number of Vowels: " + v);
        System.out.println("Number of Consonants: " + c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();
        checkVowels(str);
    }
}
