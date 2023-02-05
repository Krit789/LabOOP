
/**
 *
 * @author Jarukrit
 */
public class Fraction {

    public int topN;
    public int btmN;

    public String toFraction() {
        String output = topN + "/" + btmN;
        return output;
    }

    public String toFloat() {
        return "" + (topN / (double) btmN);
    }

    public void addFraction(Fraction f) {
        if (btmN == f.btmN) {
            topN += f.topN;
            btmN += f.btmN;
        } else {
            topN = topN * f.btmN + f.topN * btmN;
            btmN = btmN * f.btmN;
        }
    }

    public boolean myEquals(Fraction x) {
        return toFloat().equals(x.toFloat());
    }

    public void LowestTermFraction() {
        int gcd = gcd(topN, btmN);
        topN = (topN / gcd);
        btmN = (btmN / gcd);
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
