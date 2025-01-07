// Author : Samridhi Gupta
// Date   : 07/01/2025
// Topic  : Palindrome Number

import java.util.Scanner;

public class Palidrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        isPalidrome(num);

    }

    static void isPalidrome(int num) {
        int temp = num;
        int reverse = 0;
        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
        if (reverse == temp) {
            System.out.println(temp + " is a palidrome number");
        } else {
            System.out.println(temp + " is not a palidrome number");
        }
    }
}
