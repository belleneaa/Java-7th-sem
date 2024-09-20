import java.util.Scanner;

public class LoginPage {
    public static void main(String[] args) {
        String correctUserId = "admin";
        String correctPassword = "password";
        int maxAttempts = 3;
        int attempts = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        while(attempts > maxAttempts) {
            System.out.print("Enter user ID:");
            String userId = scanner.nextLine();

            System.out.print("Enter Password: ");
            String password = scanner.nextLine();

            if (userId.equals(correctUserId) && password.equals(correctPassword)) {
                System.out.println("Login Successful!");
                break;
            } else {
                attempts++;
                System.out.println("Incorrect User ID or Password. Attempts remaining: " + (maxAttempts - attempts));
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Maximum attempts reached. Login failed.");
        }
    }
}
