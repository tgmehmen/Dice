package cs245.mehmen;

public class CrapsGame {
    Die d1 = new Die();
    Die d2 = new Die();
    private int added;
    private int pointer;

    public boolean Play(){
        added = d1.roll()+d2.roll();
        if (added==7 || added ==11){
            return true;
        }
        else if (added==2 || added ==3 || added==12){
            return false;
        }
        else{
            pointer=added;
            added=d1.roll()+d2.roll();
            while (added!=pointer && added!=7){
                added=d1.roll()+d2.roll();
            }
            if (added==pointer){
                return true;
            }
            else {
                return false;
            }
        }
    }



}
