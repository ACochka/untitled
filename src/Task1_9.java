public class Task1_9 {
    public static void main(String[] args) {
        int[] array = {3, 4, 5};
        System.out.println(sumOfCubes(array));
    }

    public static int sumOfCubes(int[] arg) {
        int sum = 0;
        for(int i = 0; i< arg.length; i++){
            sum+=arg[i]*arg[i]*arg[i];
        }
        return sum;

        }
    }
