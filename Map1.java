import java.util.HashMap;
import java.util.Scanner;

public class Map1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        int arr[] = {7, 11, 15, 76, 98, 6, 190, 3452, 64537, 149, 3, 1, 2, 87, 4};
        int target = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int comp = target - arr[i];
             if (map.containsKey(comp)) {
                System.out.print(map.get(comp) + " ");
                System.out.println(i);
            } else {
                map.put(arr[i], i);
            }
        }
    }
}
