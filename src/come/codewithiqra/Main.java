package come.codewithiqra;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        System.out.println("Input Seconds: ");
        int seconds = io.nextInt();
        int a = seconds % 60;
        int b = seconds / 60;
        int c = b / 60;
        b = b /60;
        System.out.println(b+ ":"+ c+ ":"+ a);

    }
}
