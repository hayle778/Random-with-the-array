/*
- tell the computer to select the random number with the the right data type from the array
-
*/
import java.util.Random;

public class FortuneTeller {
//public static void main(String[]args) {

// we need the ft to select by default(randomly);



static  String[] fortunes = { " Today is your day. ",
                "You are amazing",
                "You upcoming vacation will be good",
                "School is good for your next carrer",
                "computer science will be your fate",
                "yes we do",
                "Your behaviour is awesome",
                "you smell bad."
        };


    public static void main(String[]args) {
// when we add the value for bound in the parenthesis, it is where the random value rotates at
       Random random = new Random();
// it gonna select the next value since we ran as a random
      int r = random.nextInt(fortunes.length);
      //we gonna print out the name of the array + the name of the data type.
       System.out.println(fortunes[r]);



}
}
