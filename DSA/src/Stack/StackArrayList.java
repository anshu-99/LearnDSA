package Stack;

import java.util.ArrayList;

public class StackArrayList {
    class Stack{
        static ArrayList<Integer> stackElement=new ArrayList<>();

        public static boolean isEmpty(){
            return stackElement.size()==0;
        }
        public static void push(int data){
            stackElement.add(data);
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=stackElement.get(stackElement.size()-1);
            stackElement.remove(stackElement.size()-1);
            return top;
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
