package Stack;

import java.util.Stack;
public class ReverseStack {
    static class MainStack{
        static Stack<Integer> s=new Stack<>();
        public static void pushElement(int data){
            s.push(data);
        }
        public static int popElement(){
            return s.pop();
        }
    }
    static class InsertEnd{
        static Stack<Integer> s=new Stack<>();
        public static void pushElement(int data){
            s.push(data);
        }
        public static void popElement(){
            s.pop();
        }
    }

    public static void main(String[] args) {
        for(int i=1;i<=4;i+=1){
            MainStack.pushElement(i);
        }
        System.out.print("Main Stack: ");
        while (!MainStack.s.isEmpty()){
            System.out.print(MainStack.s.peek()+" ");
            InsertEnd.pushElement(MainStack.popElement());
        }
        System.out.println();
        System.out.print("Desired Stack: ");
        while (!InsertEnd.s.isEmpty()){
            System.out.print(InsertEnd.s.peek()+" ");
            InsertEnd.popElement();
        }
    }
}
