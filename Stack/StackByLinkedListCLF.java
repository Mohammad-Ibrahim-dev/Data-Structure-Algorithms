package Stack;

import java.util.LinkedList;
import java.util.Scanner;

public class StackByLinkedListCLF {
    static LinkedList<Integer> stack =new LinkedList<>();
    public static void push(int data){
        stack.add(data);
    }
    public static void pop(){
        stack.removeLast();
    }
    public static void peek(){
        System.out.println(stack.getLast());
    }
    public static void Size(){
        System.out.println(stack.size());
    }
    public static void Display(){
        System.out.println(stack);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data, option;
        System.out.println("Stack Data Structure\n1->push\n2->pop\n3->peek\n4->display data");
        while (true) {
            option = sc.nextInt();
            switch (option) {
                case 1: {
                    data = sc.nextInt();
                    push(data);
                    break;
                }
                case 2:
                    pop();
                    break;
                case 3:
                    peek();
                    break;
                case 4:
                    Size();
                    break;
                case 5:
                    Display();
                    break;
                default:
                    System.out.println("invalid input");
            }
        }
    }
}
