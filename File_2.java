import java.io.File;
import java.io.IOException;

public class File_2 {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Lenovo\\OneDrive\\Desktop\\Praveen.txt");
        boolean res = f.mkdir();
        f = new File("C:\\Users\\Lenovo\\OneDrive\\Desktop\\Rajput.txt");
        f.createNewFile();
        System.out.println(res);
        System.out.println(f.length());
        f.delete();
    }
}
