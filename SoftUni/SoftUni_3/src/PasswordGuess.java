import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password=input.nextLine();
        String result="";
        if(password.equals("s3cr3t!P@ssw0rd")){
            result="Welcome";
        }else {
            result="Wrong password!";
        }
        System.out.printf(result);
    }
}