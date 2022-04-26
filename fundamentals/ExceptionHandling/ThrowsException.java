import java.io.*;

public class ThrowsException {
    public static void findFile() throws IOException {
        File newFile = new File("test.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }    
    
    public static void main(String[] args) {
        try {
            findFile();
        } catch(IOException exception) {
            System.out.println(exception);
        }
    }
}