package String;

import java.util.Scanner;

//Inputa string from the user.Create a new string called‘result’ in which you will replace the letter‘e’ in the original string with letter‘i’.
//Example:
//original=“eabcdef’ ;result=“iabcdif”
//Original=“xyz”;result=“xyz"

public class StringCharReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        String result="";
        System.out.println("enter the String : ");
        input = sc.next();
        for (int i = 0; i < input.length(); i++) {   // logic 1
            if (input.charAt(i) == 'i') result += 'e';
            else result += input.charAt(i);
        }
//        use any one logic 1 or 2
//        result = input.replace("i", "e");         //logic 2
        System.out.println("Result: "+result);
    }
}
