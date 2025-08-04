public class Func_call {
    public static void main(String[] args) throws Exception {
        int a = 10;
        int b = 5;
        System.out.println(add(a, b));
        System.out.println(sub(a, b));
    }

    public static int add(int a, int b) throws Exception {
        return a + b;
    }

    public static int sub(int a, int b) throws Exception {
        return b - a;
    }
}
