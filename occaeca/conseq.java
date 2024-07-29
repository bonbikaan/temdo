public class Main {
    public static <T> T identity(T arg) {
        return arg;
    }

    public static void main(String[] args) {
        System.out.println(identity(5));               // Outputs: 5
        System.out.println(identity("hello"));         // Outputs: hello
        System.out.println(identity(java.util.Arrays.asList(1, 2, 3)));  // Outputs: [1, 2, 3]
    }
}
