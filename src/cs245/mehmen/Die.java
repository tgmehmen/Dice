package cs245.mehmen;

import java.util.Random;

public class Die {
    private int numSides;
    private int face;
    private static Random roller = new Random();

    public Die() {
        numSides = 6;
        //roller = new Random();
        roll();
    }
    public Die(int sides){
        numSides = sides;
        if (sides < 1){
            throw new IllegalArgumentException("side needs to be more than 1");
        }
        //roller = new Random();
        roll();
    }

    public int roll() {
        face = roller.nextInt(numSides) + 1;
        return face;
    }
}