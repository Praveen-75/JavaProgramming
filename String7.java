public class String7 {
    public static String capitalize(String s) {
        if (s.length() == 1)
            return s.toUpperCase();
        String firstPart = Character.toString(s.charAt(0)).toLowerCase();
        String lastPart = Character.toString(s.charAt(s.length()) - 1).toUpperCase();
        String middlePart = s.substring(1, s.length() - 1);
        return firstPart + lastPart + middlePart;
    }

    public static void main(String[] args) {
        String s = "Hello";
        String[] words = s.split("");
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < words.length; i++) {
            sb.append(capitalize(words[i]));
            sb.append("");
        }
        System.out.println(sb.toString().trim());
    }
}
