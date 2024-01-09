package Stack;

import java.util.ArrayList;

public class StackArrayList {
    static class Stack{
        static ArrayList<Integer> stackElement=new ArrayList<>();

        public static boolean isEmpty(){
            return stackElement.isEmpty();
        }
        public static void push(int data){
            stackElement.add(data);
        }
        public static void pop(){
            if(isEmpty()){
                return;
            }
            int top=stackElement.get(stackElement.size()-1);
            stackElement.remove(stackElement.size()-1);
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return stackElement.get(stackElement.size()-1);
        }
    }

    public static void main(String[] args) {
//        Stack s=new Stack();
        for(int i=2;i<=40;i+=2){
            Stack.push(i);
        }
        while(!Stack.isEmpty()){
            System.out.println(Stack.peek());
            Stack.pop();
        }

    }
}
