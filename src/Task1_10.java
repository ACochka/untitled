public class Task1_10 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(abcmath(array));
    }

    public static boolean abcmath(int[] arg) {
        int sum = arg[0];
        for(int i = 0; i < arg[1]; i++){
            sum+=sum;
            System.out.println(sum);
        }

        return sum%(arg[2]) == 0;

    }
}
