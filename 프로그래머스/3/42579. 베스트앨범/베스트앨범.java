import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> genres_play = new HashMap<>();
        HashMap<String, List<List<Integer>>> genres_songs = new HashMap<>();
        
        for (int i = 0; i < genres.length; i++) {
            String k = genres[i];
            if (genres_play.containsKey(k)) {
                genres_play.put(k, genres_play.get(k) + plays[i]);
                genres_songs.get(k).add(Arrays.asList(i, plays[i]));
            } else {
                genres_play.put(k, plays[i]);
                genres_songs.put(k, new ArrayList<>());
                genres_songs.get(k).add(Arrays.asList(i, plays[i]));
            }
        }
        
        List<String> sorted_genre = genres_play.entrySet()
            .stream()
            .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())) 
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
        
        List<Integer> answer = new ArrayList<>();
        for(String g : sorted_genre) {
            List<List<Integer>> songs = genres_songs.get(g);
            songs.sort(
                Comparator.comparing((List<Integer> l) -> l.get(1)).reversed()  
                          .thenComparing(l -> l.get(0))                       
            );

            
            if (songs.size() == 1) {
                answer.add(songs.get(0).get(0));
                continue;
            } 
            
            for (int i = 0; i < 2; i++) {
                answer.add(songs.get(i).get(0));
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}