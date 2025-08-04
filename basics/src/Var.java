public class Var {
    public static void main(String[] args) throws Exception {
        int test_int = 15;
        String test_str = "je sais pas";
        Float test_float = 15.12f;
        int[] test_list_int = {1, 5 , 15};
        System.out.println(test_int);
        System.out.println(test_str);
        System.out.println(test_float);
        for (int i = 0 ; i < test_list_int.length; i++)
            System.out.print(test_list_int[i] + " ");
    }
}
