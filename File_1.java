import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_1 {
    public static void main(String[] args)throws IOException {
        File f = new File("C:\\Users\\Lenovo\\OneDrive\\Desktop\\Rajput.txt");
        FileWriter fw = new FileWriter(f);
        fw.write("PRAVEEN KAHA HO");
        fw.close();

    }
}
