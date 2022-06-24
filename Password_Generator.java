import java.util.Random;
import java.util.Scanner;

public class Password {
   public static void main(String[] args) {
      String choice;
      Scanner sc = new Scanner(System.in);

      System.out.println("\n##################################################################################################");
      System.out.println(" ");
      System.out.println("---------------------Checkout Our New Password Generator Tool-----------------------");
      System.out.println(" ");
      System.out.println("The tool can help you generate password of any length\n* Just enter how long you want your password to be and it will generate a unique password of that length..\n");
      System.out.print("Would you like to try it ? : ");
      choice = sc.nextLine();

      if(choice.equals("No") || choice.equals("no")) {
        System.out.println("Thank You, Have A Good Day..");
        return;
      }
      System.out.println("\nOkay, Here You Go");
      try { 
         System.out.println("\nStarting Password Generator....");
         Thread.sleep(3000);
    }
    catch (InterruptedException e) {
        System.out.println(" ");
    }
    
    try {
        System.out.println("\n########################################");
        Thread.sleep(3000);
    }
    catch (InterruptedException e) {
        System.out.println(" ");
    }

      System.out.print("\nHow long do you want the password to be: ");
      int n = sc.nextInt();
      sc.close();
      System.out.println("\nHere's a random password with "+n+" charecters: \n");
      System.out.println(generatePassword(n));
   }

   private static char[] generatePassword(int length) {
      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
      String specialCharacters = "!@#$";
      String numbers = "1234567890";
      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
      Random random = new Random();
      char[] password = new char[length];

      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
      password[3] = numbers.charAt(random.nextInt(numbers.length()));
   
      for(int i = 4; i< length ; i++) {
         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
      }
      return password;
   }
}
