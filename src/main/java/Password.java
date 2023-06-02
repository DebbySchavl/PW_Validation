import java.util.Arrays;
import java.util.Scanner;

public class Password {

    public static void main(String[] args){

        String userPassword = userInput();
        validatePassword(userPassword);



    }


    public static String userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a password.");
        String password = scanner.nextLine();
        return password;
    }

    public static void validatePassword(String password){
        if (!checkPasswordLength(password.length())){
            System.out.println("Your password should have at least 5 and max 12 characters.");
            userInput();
        }

        if (!checkPasswordChars(password)) {
            System.out.println("Your password should contain numbers and characters.");
            userInput();
        }

        if (!checkPasswordChars(password)) {
            System.out.println("Your password doesn't contain any uppercase letters. Want to change? <yes/no>");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (answer.equals("yes")) {
                userInput();
            }

        }

        if (checkForBadPassword(password)){
            System.out.println("Your password is not a safe one");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (answer.equals("yes")) {
                userInput();
            }
        } else {
            System.out.println("You entered a valid password");
        }
    }

    public static boolean checkPasswordLength(int lengthPassword){


        return 4 < lengthPassword && lengthPassword < 13;

    }

    public static boolean checkPasswordChars(String password){

        return password.matches(".*[A-Za-z].*") && password.matches(".*[0-9].*");

}
    public static boolean checkPasswordForCapitals(String password){
            char ch;
            boolean hasCapital = false;

            for(int i=0;i < password.length();i++) {
                ch = password.charAt(i);
                if (Character.isUpperCase(ch)) {
                    hasCapital = true;
                    break;
                }
        }
            return hasCapital;
    }

    public static boolean checkForBadPassword(String password){
        String passwordLowerCase = password.toLowerCase();
        String[] badPassword = {"password", "password123", "password456","123456", "987654321"};
        return Arrays.asList(badPassword).contains(passwordLowerCase);
    }
}
