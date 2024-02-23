package programmers;

import java.util.Arrays;
import java.util.HashMap;

public class pro1_runhorse {
    public static void main(String[] args){
        String [] players = {"mumu", "soe", "poe", "kai", "mine"};
        String [] callings = {"kai", "kai", "mine", "mine"};

        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<players.length;i++) {
            map.put(players[i], i);
        }

        for(String p: callings) {
            int ranking = map.get(p);
            String frontP = players[ranking-1];
            System.out.println(ranking);
            System.out.println(frontP);
            players[ranking-1] = p;
            players[ranking] = frontP;

            map.put(p, ranking -1);
            map.put(frontP, ranking);
        }
        System.out.println(Arrays.toString(players));

    }
}
