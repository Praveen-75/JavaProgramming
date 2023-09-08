import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String folderName = sc.nextLine();
        String path = "C:\\Users\\Lenovo\\OneDrive\\Desktop\\" + folderName;
        File fileRef = new File(path);
        fileRef.mkdir();

        fileRef = new File(path + "\\index.html");
        fileRef.createNewFile();
        FileWriter fr = new FileWriter(fileRef);
        fr.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n    <link rel=\"stylesheet\" href=\"style.css\">\n    <title>Document</title>\n</head>\n<body>\n    \n    <script src=\"script.js\"></script>\n</body>\n</html>");
        fr.close();

        fileRef = new File(path + "\\style.css");
        fileRef.createNewFile();
        fr = new FileWriter(fileRef);
        fr.write("*{\n    margin: 0;\n    padding: 0;\n    box-sizing: border-box;\n}\nhtml,body{\n    width: 100%;\n    height: 100%;\n}");
        fr.close();

        fileRef = new File(path + "\\script.js");
        fileRef.createNewFile();
    }
}
