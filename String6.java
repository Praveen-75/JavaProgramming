public class String6 {
    public static void main(String[] args) {
        String s = "kuch bhi likh do 123 or 123";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                sum += Character.getNumericValue(ch);
            }
        }
        System.out.println(sum);
    }
}
