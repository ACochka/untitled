public class Task1_5 {
    public static void main(String[] args) {
        System.out.println(operation(2, 10, 5));
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
}
