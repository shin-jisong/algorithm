import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String line = br.readLine();
            String[] triangle = line.split("\\s+");
            int[] numbers = Arrays.stream(triangle).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(numbers);
            if (numbers[0] == 0) {
                break;
            }

            if (Math.pow(numbers[0], 2) + Math.pow(numbers[1], 2) == Math.pow(numbers[2], 2)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}