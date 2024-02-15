package programmers;

import java.util.Arrays;
import java.util.HashMap;

public class pro1_MemoriesSrore {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain","deny"};
        int[] yearning = {5, 10, 1, 13};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        int[] answer = new int[photo[0].length];

        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        for(int i=0; i<photo.length; i++) {
            String[] persons = photo[i];
            int score = 0;

            for(int j=0; j<persons.length; j++) {
                String person = persons[j];
                if(map.containsKey(person)){ // map의 key에 photo 속 사람이 있다면
                    score+=map.get(person); // 점수 추가
                }
            }
            answer[i]=score;
        }
        System.out.println(Arrays.toString(answer));
    }
}
