import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class File_3 {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Lenovo\\OneDrive\\Desktop\\Rajput.txt");
        FileReader fr = new FileReader(f);
        StringBuilder data = new StringBuilder();
        int d;
        while ((d = fr.read()) != -1) {
            data.append((char) d);
        }
        System.out.println(data);
    }
}
