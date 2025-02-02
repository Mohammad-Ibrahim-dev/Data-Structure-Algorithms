package Array;
import java.util.Scanner;
//Take an array of names as input from the user and print them on the screen.
public class Names {
        public static void main(String[] Args) {
            Scanner sc = new Scanner(System.in);
            int size = 5;
            String[] name = new String[size];
            for (int i = 0; i < name.length; i++) {
            name[i] = sc.next();
            }
            for (String s : name) {
                System.out.println(s);
            }
        }
}