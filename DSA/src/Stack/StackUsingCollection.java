package Stack;
import java.util.*;
public class StackUsingCollection {
    static class StackUse{
        static Stack<Integer> s=new Stack<>();
//        PUSH
        public static void pushElement(int data){
            s.push(data);
        }
//        POP
        public static void popElement(){
            s.pop();
        }
//        PEEK
        public static int peekElement(){
            return s.peek();
        }
    }

    public static void main(String[] args) {
        for(int i=2;i<=20;i+=2){
            StackUse.pushElement(i);
        }
        while(!StackUse.s.isEmpty()){
            System.out.println(StackUse.peekElement());
            StackUse.popElement();
        }
    }
}
