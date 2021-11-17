package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean PasswordValid=false;
        do {
            System.out.println("Enter a password: ");
            String password= input.nextLine();

            if(password.length()<8){
                continue;
            }

            boolean AllLettersAndDigits=true;

            for (int i = 0; i < password.length(); i++) {
                char symbol = password.charAt(i);
                boolean LetterOrDigits = Character.isLetterOrDigit(symbol);
                if (!LetterOrDigits) {
                    AllLettersAndDigits = false;
                    break;
                }
                int digitCount=0;
                boolean Digit=Character.isDigit(symbol);
                if(Digit){
                    digitCount++;
                }
                int digitCount=0;
                boolean Digit=Character.isDigit(symbol);
                if(Digit){
                    digitCount++;
                }
            }

            int digitCount=0;
            boolean Digit=Character.isDigit(symbol);
            if(Digit){
                digitCount++;
            }

            if (AllLettersAndDigits && digitCount>=2){
                PasswordValid=true;
                System.out.println("Password Valid!");
            }

        }while(!PasswordValid);
    }
}
