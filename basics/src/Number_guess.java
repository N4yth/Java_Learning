import java.util.Random;
import java.util.Scanner;

public class Number_guess {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int nb_random = random.nextInt(0,101);
        boolean win = false;

        System.out.println("Guess the number between 1 and 100");
        for (int i = 5; i > 0 ; i--) {
            System.out.println("Your guess (left: " + i + "):");
            String guess = scan.nextLine();
            if (nb_random == Integer.parseInt(guess)) {
                System.out.println("Well play you win");
                win = true;
                break;
            }
            else if (nb_random > Integer.parseInt(guess)) {
                System.out.println("too small");
            }
            else if (nb_random < Integer.parseInt(guess)) {
                System.out.println("too high");
            }
        }
        if (!win) {
            System.out.println("Sorry you loose ;-; the number was : "+ nb_random);
        }
        scan.close();
    }
}
