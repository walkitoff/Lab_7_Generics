
public class GenericsTest {
    public static void main(String[] args) {

        Triple<String, Integer, Integer> oTeam1 = new Triple<>("Buffalo", 4, 5 );
        Triple<String, Integer, Integer> oTeam2 = new Triple<>("Kansas City", 3, 6 );
        Triple<String, Integer, Integer> oTeam3 = new Triple<>("LA Chargers", 5, 4 );
        Triple<String, Integer, Integer> oTeam4 = new Triple<>("Denver", 2, 7 );
        Triple<String, Integer, Integer> oTeam5 = new Triple<>("Philadelphia", 9, 0 );

        Triple<String, Integer, Integer>[] aoTriple = new Triple[]{oTeam1, oTeam2, oTeam3, oTeam4, oTeam5};

        Pair<String, Double>[] aoPair = new Pair[5];
        double tempWinPercent;
        String tempTeamName;

        int iIndexOfHighScore = 0; //used for aoPair highest scoring team

        for(int i = 0; i < aoTriple.length; i++) {
            //calculate win %  [(wins)/(total games)] ...*100 would give an actual %, but instructions say to leave as decimal
            tempWinPercent = ((double)aoTriple[i].getB() / (aoTriple[i].getB() + aoTriple[i].getC()));

            //store team name
            tempTeamName = aoTriple[i].getA();

            //create new Pair to hold team Name & win %
            Pair<String, Double> oTempPair = new Pair<>(tempTeamName, tempWinPercent);

            //add oTempPair to  aoPair array
            aoPair[i] = oTempPair;

            //find Index of team w/Highest win %
            if (i == 0 || (aoPair[i].getB() > aoPair[i - 1].getB())){
                iIndexOfHighScore = i;
            }

        }
        System.out.println("\nTHE TEAM WITH THE MOST WINS IS: " + aoPair[iIndexOfHighScore].getA().toUpperCase());

        System.out.println("\n****************************");
        for( int i = 0; i < aoPair.length; i++){
            System.out.printf("%s %14S - %3d%% %4s\n","*", aoPair[i].getA(), (int)(aoPair[i].getB() * 100), "*");
        }
        System.out.println("****************************");


    }
}
