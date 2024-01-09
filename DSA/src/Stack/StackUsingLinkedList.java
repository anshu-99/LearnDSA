package Stack;

public class StackUsingLinkedList {
//    LIFO (Last in First Out)
//    PUSH (Add data on top with O(1) )
//    POP (Delete data on top with O(1) )
//    PEEK ((Find data on top with O(1) ))
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next =null;
        }
    }
    static class Stack{
        public static Node head;
        public static boolean isEmpty(){
            return head==null;
        }
//        PUSH
      public static void push(int data){
            Node newNode= new Node(data);
            if(isEmpty()){
                head=newNode;
            }
            newNode.next=head;
            head= newNode;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            return top;
        }
    }

    public static void main(String[] args) {

    }
}
