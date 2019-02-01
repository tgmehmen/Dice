package cs245.mehmen;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        if (x >= 0) {
            this.x = x;
        }
        else{
            throw new IllegalArgumentException("x cannot be negative");
        }
        if (y >= 0) {
            this.y = y;
        }
        else{
            throw new IllegalArgumentException("y cannot be negative");
        }
    }
    public Point(){
        x = 0;
        y = 0;
    }
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
