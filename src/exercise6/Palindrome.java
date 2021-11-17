package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        int reversednumber = 0;
        int tempnum = number;
        while (tempnum > 0) {
            int nextDigit = tempnum%10;
            reversednumber=reversednumber*10 + nextDigit;
            tempnum=tempnum/10;
        }
        boolean palindrome= number ==reversednumber;
        System.out.println("Palindrome: " + palindrome);
    }
}
