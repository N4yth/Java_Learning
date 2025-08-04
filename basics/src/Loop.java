public class Loop {
    public static void main(String[] args) throws Exception {
        for (int i =0 ; i < 10 ; i++) {
            System.out.println("Loop : "+ i);
        }
        int y = 0;
        System.out.println("-----");
        while (y < 5) {
            System.out.println("Loop2 : "+ y);
            y++;
        }
        System.out.println("-----");
        String[] array = {"toto", "tata", "tutu"};
        for (String z : array) {
            System.out.println("Loop3 : "+ z);
        }
        System.out.println("-----");
        for (int i =0 ; i < 10 ; i++) {
            System.out.println("Loop4 : "+ i);
            if  (i == 3) {
                break;
            }
        }
        System.out.println("-----");
        for (int i =0 ; i < 10 ; i++) {
            if  (i % 2 == 0) {
                continue;
            } 
            else {
                System.out.println("Loop5 : "+ i);
            }
        }
    }
}
