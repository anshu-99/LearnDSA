package BackTracking;

public class StringPermutation {
    public static void stringPermutation(String str,String perm,int idx){
        if(str.isEmpty()){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currentChar=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            stringPermutation(newStr,perm+currentChar,idx+1);
        }
    }

    public static void main(String[] args) {
        String str="ABCDE";
        stringPermutation(str,"",0);
    }
}
