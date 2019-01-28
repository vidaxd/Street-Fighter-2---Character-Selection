package es.ulpgc.StreetFighter2_CharacterSelection;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.*;

public class Solution{
    public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves){
        List<String> characters = new ArrayList<>();
        if (moves.length != 0) {
            stream(moves).forEachOrdered(move -> {
                if ("up".equals(move)) {
                    if (position[0] != 0) position[0] -= 1;
                    characters.add(fighters[position[0]][position[1]]);

                } else if ("down".equals(move)) {
                    if (position[0] != 1) position[0] += 1;
                    characters.add(fighters[position[0]][position[1]]);

                } else if ("left".equals(move)) {
                    if (position[1] == 0) {
                        position[1] = fighters[position[0]].length - 1;
                    } else {
                        position[1] -= 1;
                    }
                    characters.add(fighters[position[0]][position[1]]);

                } else if ("right".equals(move)) {
                    if (position[1] == fighters[position[0]].length - 1) {
                        position[1] = 0;
                    } else {
                        position[1] += 1;
                    }
                    characters.add(fighters[position[0]][position[1]]);

                }
            });
            return characters.stream().toArray(String[]::new);
        }
        return new String[]{};
    }
}
