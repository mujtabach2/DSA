package HashMap;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Collections;
// n this exercise, you are provided a list of Tennis Players along with their number of Grand Slam wins of
// all time and you are required to use a HashMap to list them from highest to lowest wins along with
// classifying them according to their wins. Please refer to the expected output of the program for more details.

// You are provided with Driver class that has a main method which generates the list of players and passes it
// to a function public static String[] sortByWins(String[] players, Integer[] wins).
// This function returns a String[] which main method uses to display the output. The Code for
// Driver class with main method is provided below.
// Your job is to complete public static String[] sortByWins(String[] players, Integer[]
// wins) method. Please note the following:
//  Use HashMap to write this function and make sure to return a String[] that shows the name of
// the player along with number of wins.
//  The function should return a String[] in a way that it is sorted by number of wins in descending
// order.
//  The function takes 2 arrays; a String[] for player names and Integer[] for number of wins.
// The size of both the arrays will always be same.
//  String[] always corresponds to Integer[]. It means that String[0] = Integer[0]
// and so on. Hence, names of the players would always correspond to wins at the same index.
public class Driver {
    public static String[] sortByWins(String[] players, Integer[] wins)
    {
        
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        for (int i = 0; i < players.length; i++)
        {
            map.put(wins[i], players[i]);
        }

        Arrays.sort(wins, Collections.reverseOrder());

        String[] result = new String[players.length];

        for (int i = 0; i < players.length; i++)
        {
            
            result[i] = map.get(wins[i]) + " " + wins[i];
        }
        return result;
    
    }
        
    public static void main(String[] args) 
    {
        String[] players = new String[]
        {
            "Pete Sampras", "Novak Djokovic", "Roger Federer", "Roy Emerson", "Rafael Nadal",
            "Bjorn Borg"
        };
        Integer[] wins = new Integer[]{
        14, 21, 20, 12, 22, 11
        };
        for (String result: sortByWins(players, wins))
        {
            System.out.println(result);
        }
    }
}