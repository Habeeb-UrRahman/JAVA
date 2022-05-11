import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class AgeCalculator {
    public static void main(String[] args) {

        System.out.print("Enter date of birth in YYYY-MM-DD format: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        LocalDate dob = LocalDate.parse(input);
        System.out.println("You are "+calculateAge(dob)+" years old");
        System.out.println("Or "+calculateAge(dob)+" years"+" and "+calculateAge(dob)*12+" months old");
        System.out.println("Or "+calculateAge(dob)+" years"+", "+calculateAge(dob)*12+" months"+" and "+calculateAge(dob)*365+" days old");
        System.out.println("Or "+calculateAge(dob)+" years"+", "+calculateAge(dob)*12+" months"+", "+calculateAge(dob)*365+" days"+" and "+(calculateAge(dob)*365)*24+" hours old");
        System.out.println("Or "+calculateAge(dob)+" years"+", "+calculateAge(dob)*12+" months"+", "+calculateAge(dob)*365+" days"+", "+(calculateAge(dob)*365)*24+" hours"+" and "+((calculateAge(dob)*365)*24)*60+" minutes old");
        System.out.println("Or "+calculateAge(dob)+" years"+", "+calculateAge(dob)*12+" months"+", "+calculateAge(dob)*365+" days"+", "+(calculateAge(dob)*365)*24+" hours"+", "+((calculateAge(dob)*365)*24)*60+" minutes"+" and "+(((calculateAge(dob)*365)*24)*60)*60+" seconds old");
    }
    public static int calculateAge(LocalDate dob) {
        LocalDate curDate = LocalDate.now();

        if ((dob != null) && (curDate != null)) {
            return Period.between(dob, curDate).getYears();
        }
        else {  
            return 0;
        }
    }
}
