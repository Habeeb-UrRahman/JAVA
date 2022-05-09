import java.util.Scanner;

public class Fight {
    private static boolean playing = false;
    private static int enemyHealth = 100;
    private static int playerHealth = 100;
    private static double enemyChoice = Math.ceil(Math.random() * 3);
    private static String pName;

    public static void checkHealth(){
        if(enemyHealth <= 0){
            System.out.println("Hooray! "+pName+" won this match!");
            playing = false;
        }else if(playerHealth <= 0){
            System.out.println(pName+" has fallen! Rocky won this game!");
            playing = false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String wantPlay;
        // asking the player if they want to play
        System.out.println("Want to play a fighting game?: ");
        wantPlay = sc.next();

        // if the player chooses to play, it wil lstart the game loop
        if(wantPlay.equals("Yes") || wantPlay.equals("yes")){

            System.out.println("Enter your name: ");
            pName = sc.next();

            System.out.println("Hey folks!, were going to have an exiting game today!");
            System.out.println("In the left corner, we have Rocky Balboa!!!!!");
            System.out.println("and in the right corner, we have "+pName+"!!!!!");
            System.out.println("");

            playing = true;
        }

        while(playing == true){
            System.out.println("Rocky has "+enemyHealth+" health remaining.");
            System.out.println("You have "+playerHealth+" health remaining.");

            String action;
            System.out.println("What would you like to do? (a)upper cut (b)side punch (c)down cut: ");
            action = sc.next();
    
            enemyChoice = Math.ceil(Math.random() * 3);
            checkHealth();

            if(action.equals("a") && enemyChoice == 2){
                checkHealth();
                System.out.println("oohh! and "+pName+" throws a devistating blow into Rocky!");
                enemyHealth-=10;
                checkHealth();

            }else if (action.equals("a") && enemyChoice == 3){
                checkHealth();
                System.out.println("OH! "+pName+" JUST GOT SMASHED!");
                playerHealth -=10;
                checkHealth();
            }else if (action.equals("b") && enemyChoice == 3){
                checkHealth();
                System.out.println("Rocky just got smashed!!!!");
                enemyHealth-=10;
                checkHealth();
            }else if (action.equals("b") && enemyChoice == 1){
                checkHealth();
                System.out.println(pName+" better step up his game!");
                playerHealth-=10;
                checkHealth();
            }else if (action.equals("c") && enemyChoice == 1){
                checkHealth();
                System.out.println("Rockey just got pucnhed so hard that he might not even know he exists!");
                enemyHealth-=10;
                checkHealth();
            }else if (action.equals("c") && enemyChoice == 2){
                checkHealth();
                System.out.println(pName+" Just got smashed!");
                playerHealth -=10;
                checkHealth();
            }else if(action.equals("a") && enemyChoice == 1){
                System.out.println("Their fists collided! this is intense!");
            }else if(action.equals("b") && enemyChoice == 2){
                System.out.println("Their fists collided! this is intense!");
            }else if (action.equals("c") && enemyChoice == 3){
                System.out.println("Their fists collided! this is intense!");

            }

        }
        sc.close();
    }

}
