import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] words1 = line.split("\\s+");

        line = reader.readLine();
        String[] words2 = line.split("\\s+");

        List<Integer> cards = new ArrayList<>();
        for (String word : words2) {
            cards.add(Integer.parseInt(word));
        }
        Collections.sort(cards);

        int card1, card2, card3;
        int target = Integer.parseInt(words1[1]);
        int result = 0;

        for (int i = 0; i < cards.size(); i++) {
            card1 = cards.get(i);
            for (int j = i + 1; j < cards.size(); j++) {
                card2 = cards.get(j);
                for (int k = j + 1; k < cards.size(); k++) {
                    card3 = cards.get(k);
                    int sum = card1 + card2 + card3;
                    if (sum > target) {
                        continue;
                    }
                    if (sum == target) {
                        result = sum;
                        break;
                    }
                    if (target - sum < target - result) {
                        result = sum;
                    }
                }
            }
        }

        System.out.println(result);
    }
}