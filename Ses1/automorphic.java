public class Automorphic {
    int n;

    public boolean isAutomorphic() {
        int sqr = n * n;
        int length = String.valueOf(n).length();

        if (sqr % Math.pow(10, length) == n) {
            return true;
        } else {
            return false;
        }
    }
}
