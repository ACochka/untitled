public class Extra {
    public static void main(String[] args){
        System.out.println(getDecimalPlaces("432.0 0"));

    }


    public static int getDecimalPlaces(String num){
        if (num.contains(".")){
            return num.length() - num.indexOf('.') - 1;
        }else {
            return 220;
        }
    }
}
