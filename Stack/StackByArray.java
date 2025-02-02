package Stack;

import java.util.Scanner;

public class StackByArray {
    static  int size=5;
    static int top=-1;
    static int[] stack=new int[size];

    public static void push(int data ){
        if(top>=size-1){
            System.out.println("stack is full");
        }
        else {
        ++top;
        stack[top]=data;}
    }

    public static void pop(){
        if(top<0){
            System.out.println("stack is empty");
        }
        else{
        System.out.println(stack[top]);
        top--;}
    }

    public static void peek(){
        System.out.println(stack[top]);
    }

    public static void Size(){
        System.out.println(top+1);
    }

    public static void Display(){

        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data,option;
        System.out.println("Stack Data Structure\n1->push\n2->pop\n3->peek\n4->display data");
        while (true){
            option=sc.nextInt();
            switch (option){
                case 1 : {data= sc.nextInt();
                        push(data);
                        break;
                }
                case 2 : pop();break;
                case 3 : peek();break;
                case 4 : Size();break;
                case 5 : Display();break;
                default: System.out.println("invalid input");
            }
        }

    }
}
