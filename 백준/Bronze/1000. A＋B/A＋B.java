import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] words = line.split("\\s+");
        int a = Integer.parseInt(words[0]);
        int b = Integer.parseInt(words[1]);
        System.out.println(a + b);
    }
}
