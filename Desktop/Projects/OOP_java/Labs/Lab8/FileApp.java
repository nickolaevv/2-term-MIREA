import java.io.*;
import java.io.BufferedReader;

public class FileApp {
    public static void main(String[] args) throws IOException {

        File file = new File("test.txt");

        file.createNewFile();

        FileWriter writer = new FileWriter(file);


        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("введите текст:");
        String text = input.readLine();


        writer.write(text);
        writer.flush();
        writer.close();

    
        FileReader reader = new FileReader(file);
        char[] output = new char[200];
        reader.read(output);

        System.out.println(output);

        reader.close();


    }
}
