import java.util.HashSet;

public class Map2 {
    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15, 157, 11, 157, 15, 4, 85};
        HashSet<Integer> set = new HashSet<>();
        for (int a : arr) set.add(a);
        System.out.println(set);
    }
}
