public class Task1_8 {
    public static void main(String[] args) {
        System.out.println(nextEdge(9, 2));
    }

    public static int nextEdge(int firstSide, int secondSide ) {
        return firstSide + secondSide - 1 ;
    }
}
