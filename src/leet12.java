public class leet12 {
    public String intToRoman(int num) {
        StringBuffer sb = new StringBuffer();
        int romanI[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < romanI.length; i++) {
            while (num >= romanI[i]) {
                num -= romanI[i];
                sb.append(romanS[i]);
            }
        }
        return sb.toString();
    }
}
