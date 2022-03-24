package homework14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Digits digits = new Digits();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваши числа:");
        String s = scanner.nextLine();
        checkNumber(s);
        char numbers[] = s.toCharArray();
        ArrayList<String[]> list = new ArrayList<String[]>();
        for (int i = 0; i < s.length(); i++) {

            if (numbers[i] == '0') {
                list.add(digits.number0);
            }
            if (numbers[i] == '1') {
                list.add(digits.number1);
            }
            if (numbers[i] == '2') {
                list.add(digits.number2);
            }
            if (numbers[i] == '3') {
                list.add(digits.number3);
            }
            if (numbers[i] == '4') {
                list.add(digits.number4);
            }
            if (numbers[i] == '5') {
                list.add(digits.number5);
            }
            if (numbers[i] == '6') {
                list.add(digits.number6);
            }
            if (numbers[i] == '7') {
                list.add(digits.number7);
            }
            if (numbers[i] == '8') {
                list.add(digits.number8);
            }
            if (numbers[i] == '9') {
                list.add(digits.number9);
            }
        }
        for (int i = 0; i <5; i++) {
            for (int j = 0; j < s.length(); j++) {
                System.out.print(list.get(j)[i] + "         ");
            }
            System.out.println();
        }

    }


    public static boolean checkNumber(String s) {

        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("You entered not a number! Error! Try again");
            return false;
        }
    }
}

