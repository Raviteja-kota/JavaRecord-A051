import java.io.*;
public class FileOperationDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("output.txt");
        fw.write("Hello File");
        fw.close();
    }
}
