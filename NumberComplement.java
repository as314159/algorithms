public class NumberComplement {
    public int findComplement(int num) {
        String numinbinary = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        if (num < 0) {
            sb.append("-");
        }
        for (int i = 0; i < numinbinary.length(); i++) {
            if (numinbinary.charAt(i) == '0') {
                sb.append("1");
            } else {
                sb.append("0");
            }
        }
        int complement = Integer.parseInt(sb.toString(), 2);
        return complement;
    }
}
