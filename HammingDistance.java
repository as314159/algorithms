public class HammingDistance {
    public int hammingDistance(int x, int y) {
        if (x == 0 && y == 0) {
            return 0;
        }
        StringBuilder sbx = null;
        StringBuilder sby = null;
        sbx = new StringBuilder(Integer.toBinaryString(x));
        sby = new StringBuilder(Integer.toBinaryString(y));
        int lensbx = sbx.length();
        int lensby = sby.length();
        int len = -1;
        if (lensbx > lensby) {
            len = lensbx;
            while (sbx.length() != sby.length()) {
                sby.insert(0, "0");
            }
        } else {
            len = lensby;
            while (sbx.length() != sby.length()) {
                sbx.insert(0, "0");
            }
        }
        sbx = sbx.reverse();
        sby = sby.reverse();
        int z = 0;
        for (int count = 0; count < len; count++) {
            if (sbx.charAt(count) != sby.charAt(count)) {
                ++z;
            }
        }
        return z;
    }
}
