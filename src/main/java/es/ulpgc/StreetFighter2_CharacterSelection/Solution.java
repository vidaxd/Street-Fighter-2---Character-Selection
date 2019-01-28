package es.ulpgc.StreetFighter2_CharacterSelection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution{
    public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves){
        List<String> characters = new ArrayList<>();
        if (moves.length != 0) {
            for (String move: moves) {
                switch (move) {
                    case "up":
                        if (position[0]!=0) position[0]-=1;
                        characters.add(fighters[position[0]][position[1]]);
                        break;

                    case "down":
                        if (position[0]!=1) position[0]+=1;
                        characters.add(fighters[position[0]][position[1]]);
                        break;

                    case "left":
                        if (position[1]==0) {
                            position[1]=fighters[position[0]].length-1;
                        } else {
                            position[1]-=1;
                        }
                        characters.add(fighters[position[0]][position[1]]);
                        break;

                    case "right":
                        if (position[1]==fighters[position[0]].length-1) {
                            position[1]=0;
                        } else {
                            position[1]+=1;
                        }
                        characters.add(fighters[position[0]][position[1]]);
                        break;
                }
            }
            String[] result = new String[characters.size()];
            for (int i = 0; i < result.length; i++) {
                result[i] = characters.get(i);
            }
            return result;
        }
        return new String[]{};
    }
}
