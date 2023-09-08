
public class String5 {
    public static void main(String[] args) {
        String s = "a kese ho bhai";
        String[] words = s.split(" ");
        String res = "";
        for (String word : words) {
            res = res + word;
        }
        System.out.println(res.trim());
    }
}
