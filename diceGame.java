import java.util.Random;
import java.util.Scanner;


//Skal laves med en Array 
class diceRoll {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    //Terning terning = new Terning();

    System.out.println("Navn første spiller");
    players spiller1 = new players(scanner.nextLine());

    System.out.println("Navn anden spiller");
    players spiller2 = new players(scanner.nextLine());


    }
}
