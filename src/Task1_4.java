public class Task1_4 {
    public static void main(String[] args) {
        System.out.println(profitableGamble(0.2,50, 9));
    }

    public static boolean profitableGamble(double prob, double prize, double pay) {
        if ((prob*prize - pay) > 0){
            return true;
        }else{
            return false;
        }
    }
}
