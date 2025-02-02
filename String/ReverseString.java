package String;

import java.util.Scanner;
// reverse a given string
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        StringBuilder str;
        str= new StringBuilder(sc.nextLine());
        for (int i = 0; i < str.length()/2; i++) {
            int front= i;
            int back =str.length()-i-1;
            char frontCh=str.charAt(front);
            char backCh=str.charAt(back);
            str.setCharAt(front,backCh);
            str.setCharAt(back,frontCh);
        }
        System.out.println("Reverse String : "+str);
    }
}
