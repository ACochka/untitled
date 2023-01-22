import java.util.Arrays;

public class Task2 {
    public static void main(String[] args){

        System.out.println(repeat("mice",5));
        int[] array = {10, 4, 1, 4, -10, -50, 32, 21};
        System.out.println("differenceMaxMin " + differenceMaxMin(array));
        int[] array1 = {9, 2, 2, 0};
        System.out.println("isAvgWhole " + isAvgWhole(array1));
        int[] array2 = {3, 3, -2, 408, 3, 3};
        System.out.println(Arrays.toString(cumulativeSum(array2)));
        System.out.println("getDecimalPlaces " + getDecimalPlaces("438.0000"));
        System.out.println("Fibonacci " + Fibonacci(7));
        System.out.println("isValid " + isValid("39280"));
        System.out.println("isStrangePair " + isStrangePair("bush", "hubris"));
        System.out.println("isPrefix " + isPrefix("automation", "auto-"));
        System.out.println("isSuffix " + isSuffix("arachnophobia", "-phobia"));
        System.out.println("boxSeq " + boxSeq(5));
    }

    public static String repeat(String word, int count){
        String result = "";
        for(char a: word.toCharArray()){
            for(int i = 0; i < count; i++){
                result += a;
        }}
        return result;
    }

    public static int differenceMaxMin(int[] array){
        int maxNum = array[0];
        int minNum = array[0];
        for(int i = 1; i < array.length; i++){
            if (array[i] <minNum){ minNum = array[i];}
            if (array[i] >maxNum){ maxNum = array[i];}
        }
        return (maxNum - minNum);
    }

    public static boolean isAvgWhole(int[] array){
        double sum = 0;
        for(int a: array){
            sum+= a;
        }
        double result = sum/ array.length;
        return (result - (int)result) == 0;
    }

    public static int[] cumulativeSum(int[] array){

        int temp = 0;
        for(int i = 0; i < array.length; i++){
            array[i] = array[i] + temp;
            temp = array[i];
        }
        return array;
    }

    public static int getDecimalPlaces(String num){
        if (num.contains("." )){
            return num.length() - num.indexOf(".") - 1;
        }else{
            return 0;
        }
    }

    public static int Fibonacci(int n){
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n - 1];
    }


    public static boolean isValid(String index){
        int flag = 1;
        if (index.contains(" ")) {
            flag = 0;
        }
        if (index.length() != 5){
            flag = 0;
        }
        for(char a: index.toCharArray()){
            if (!(Character.isDigit(a))){
                flag = 0;
            }
        }
        return flag == 1;
    }


    public static boolean isStrangePair(String first, String second){
        if(first.charAt(0) == second.charAt(second.length() - 1) & second.charAt(0) == first.charAt(first.length() - 1)){
            return true;
        }else {
            return false;
        }
    }


    public static boolean isPrefix(String word, String prefix){
        return word.regionMatches(0, prefix, 0, prefix.length() - 1);

    }


    public static boolean isSuffix(String word, String suffix){
        return word.regionMatches(word.length() - suffix.length() + 1, suffix, 1, suffix.length() - 1);
    }


    public static int boxSeq(int n){
        if (n%2 == 0){
            return n;
        }else{
            return n + 2;
        }
    }

}
