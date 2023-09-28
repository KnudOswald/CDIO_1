import java.util.Random;
import java.util.Scanner;

class DiceRoll {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random rand = new Random();

        int player1 = 0;
        int player2 = 0;
        int turn = 1;

        System.out.println("Velkommen til spillet: ");

        System.out.println("Tryk Enter");
        s.nextLine();

        System.out.println("Første spiller indtast navn");
        String navn1 = s.nextLine();

        System.out.println("Anden spiller indtast navn");
        String navn2 = s.nextLine();
        // String til at skifte navn ved værd tur
        String spillerTur = navn1;

        while (player1 < 40 && player2 < 40) {
            System.out.println("Det er " + spillerTur + "s tur");

            System.out.println("Tryk på enter");
            s.nextLine();

            int dice1 = rand.nextInt(6) + 1;
            System.out.println("Du har fået: " + dice1);
            // programmet vælger et tilfældige tal som er melle 1 og 6

            int dice2 = rand.nextInt(6) + 1;
            System.out.println("Du har fået: " + dice2);
            // programmet vælger et tilfældige tal som er melle 1 og 6

            int sum = dice1 + dice2;

            // System.out.println("summet er: " + sum);

            if (!(dice1 == 6 && dice2 == 6)) {
                if (turn == 1) {
                    if (dice1 == 1 && dice2 == 1) {
                        sum = 0; // nulstiller pointerne.
                        System.out.println("Du har mistede alle dine point");
                        turn = 2;
                    } else {
                        turn = 2;
                    }
                    player1 += sum; // summer pointerne.
                    System.out.println("Du har nu: " + player1 + " piont" + "\n");
                } else {
                    if (dice1 == 1 && dice2 == 1) {
                        sum = 0; // nulstiller pionterne.
                        System.out.println("Du har mistede alle dine point");
                        turn = 1;
                    } else {
                        player2 += sum;
                        turn = 1;
                    }
                    player2 += sum;
                    System.out.println("Du har nu: " + player2 + " pionts" + "\n");
                }
            }
            // det der gør at den skifter navn ved tur skifte hver gang
            if (spillerTur.equals(navn1)) {
                spillerTur = navn2;
            } else {
                spillerTur = navn1;
            }
            if (player1 >= 40) {
                System.out.println("Vinderne er: " + navn1);
            } else if (player2 >= 40) {
                System.out.println("Vinderen er: " + navn2);
            } // udråber vineren.

        }
        s.close();
    }
}