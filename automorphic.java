public class automorphic {
    public static boolean isAutomorphic(int n) {
        int sqr = n * n;
        int powerOf10 = (int) Math.pow(10, String.valueOf(n).length());

        if (sqr % powerOf10 == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 25;
        boolean isAutomorphic = isAutomorphic(n);
        System.out.println("Is Automorphic: " + isAutomorphic);
    }
}
