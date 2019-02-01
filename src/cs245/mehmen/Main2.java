package cs245.mehmen;

public class Main2 {

    public static void main(String[] args) {
	    CrapsGame cg = new CrapsGame();
        int count = 0;
        double perc;
        boolean outcome;



	    for (int i = 0; i < 100000; i++){
            outcome=cg.Play();
	        if(outcome){
	            count ++;
	            //System.out.println("Win");
            }
	        else {
                //System.out.println("Lose");
            }

        }
	    perc = count/1000.0;
	    System.out.println(count+" number of wins for a "+perc+" winning percentage");


    }
}
