public class String2 {
    public static void main(String[] args) {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case 'a', 'i', 'e', 'o', 'u', 'A', 'I', 'E', 'O', 'U' -> {
                }
                default -> res = res + ch;
            }
        }
        System.out.println(res);
    }
}
