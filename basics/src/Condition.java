import java.util.Random;

public class Condition {
     public static void main(String[] args) throws Exception {
        Random random = new Random();
        int nb_random = random.nextInt(0,11);
        if (nb_random > 5) {
            System.out.println("Plus grand que 5");
        }
        else if ( nb_random < 5 ) {
            System.out.println("Plus petit que 5");
        } else {
            System.out.println("egale a 5");
        }
        System.out.println(nb_random);
    }
}
