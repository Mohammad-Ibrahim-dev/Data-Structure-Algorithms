package String;

import java.util.Scanner;

public class StringShorter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your email :");
        String email = sc.next();
        String username;
//        for (int i = 0; i < email.length(); i++) {      // logic 1
//            if(email.charAt(i)=='@') break;
//            else username+=email.charAt(i);
//        }
        int indx = email.indexOf('@');     //logic2
        username = email.substring(0, indx);
        System.out.println("username: " + username);
    }
}