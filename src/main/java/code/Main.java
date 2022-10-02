package code;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner my_scanner = new Scanner(System.in);
        StringManager my_stringManager = new StringManager();
        my_stringManager.setMy_string(my_scanner.nextLine());

        my_stringManager.SayHi();

    }
}
