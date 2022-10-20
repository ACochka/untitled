public class Task1_7 {
    public static void main(String[] args) {
        System.out.println(addUpTo(10));
    }

    public static int addUpTo(int n) {
        int result = 0;
        for (int i = 1; i<=n; i++){
            result += i;
        }
        return result;
    }
}
