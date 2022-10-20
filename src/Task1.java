public class Task1 {
    public static void main(String[] args) {
        System.out.println(remainder(-9, 45));

        System.out.println(triArea(7, 4));

        System.out.println(animals(5, 2, 8));

        System.out.println(profitableGamble(0.2,50, 9));

        System.out.println(operation(2, 10, 5));

        System.out.println(ctoa('a'));

        System.out.println(addUpTo(10));

        System.out.println(nextEdge(9, 2));

        int[] array = {3, 4, 5};
        System.out.println(sumOfCubes(array));

        int[] array1 = {1, 2, 3};
        System.out.println(abcmath(array1));
    }

    public static int remainder(int firstDigit, int secondDigit) {
        return firstDigit%secondDigit;
    }

    public static float triArea(int firstDigit, int secondDigit) {
        return (firstDigit*secondDigit)/2;
    }

    public static int animals(int chiken, int cows, int pigs) {
        return chiken*2 + cows*4 + pigs*4;
    }

    public static boolean profitableGamble(double prob, double prize, double pay) {
        if ((prob*prize - pay) > 0){
            return true;
        }else{
            return false;
        }
    }

    public static String operation(int first, int second, int third) {
        if (second+ third == first){
            return "added";
        } else if (second - third == first) {
            return "subtracted";
        } else if (second* third == first) {
            return "multiplication";
        }  else if (second / third == first) {
            return "separeted";
        }else {
            return "none";
        }
    }

    public static int ctoa(char symbol) {
        int result = (int) symbol;
        return result;
    }

    public static int addUpTo(int n) {
        int result = 0;
        for (int i = 1; i<=n; i++){
            result += i;
        }
        return result;
    }

    public static int nextEdge(int firstSide, int secondSide ) {
        return firstSide + secondSide - 1 ;
    }

    public static int sumOfCubes(int[] arg) {
        int sum = 0;
        for(int i = 0; i< arg.length; i++){
            sum+=arg[i]*arg[i]*arg[i];
        }
        return sum;

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
