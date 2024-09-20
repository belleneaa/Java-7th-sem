import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birthdate (yyyy-mm-dd): ");
        String birthdateString = scanner.next();
        LocalDate birthdate = LocalDate.parse(birthdateString);

        System.out.println("Enter the date to calculate age from (yyyy-mm-dd): ");
        String dateFromString = scanner.next();
        LocalDate dateFrom = LocalDate.parse(dateFromString);

        Period period = Period.between(birthdate, dateFrom);
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        
         System.out.println("You are " + years + " years, " + months + " months, and " + days + " days old.");
    }
}
