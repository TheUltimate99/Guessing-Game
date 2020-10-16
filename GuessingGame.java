import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    System.out.println("Guess a number between 0 through 10");
    int num = sc.nextInt();

    int upperbound = 10;
    int int_random = rand.nextInt(upperbound);

System.out.println("The computer generated:"+int_random+". Your number was:"+num);
if (int_random == num) {
    System.out.println("Congrats! You guessed the right number!");
    }

}
}
