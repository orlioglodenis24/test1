package control;

import java.util.Scanner;

public class ControlNr1 {
    public static void printDigits(String input) {
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                System.out.print(c + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string=scanner.next();

        String input=string;
        System.out.println("Цифры в строке:");
        printDigits(input);
    }
}

