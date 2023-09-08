public class String3 {
    public static void main(String[] args) {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case 'a', 'i', 'e', 'o', 'u', 'A', 'I', 'E', 'O', 'U' -> count++;
            }
        }
        System.out.println(count);
    }
}
