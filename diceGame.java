import java.util.Random;
import java.util.Scanner;

class DiceRoll {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random rand = new Random();

        int player1 = 0;
        int player2 = 0;
        int turn = 1;

        System.out.println("welkome til spillet: ");

        System.out.println("tryk på enter");
        s.nextLine();

        System.out.println("indtast dit navn player1");
        String navn1 = s.nextLine();

        System.out.println("indtast dit navn player 2");
        String navn2 = s.nextLine();

        while (player1 < 40 && player2 < 40) {
            System.out.println("det er player" + turn + " s tur");

            System.out.println("det er dit tur tryk på enter");
            s.nextLine();

            int dice1 = rand.nextInt(6) + 1;
            System.out.println("du har scoret: " + dice1);
            // programmet vælger et tilfældige tal som er melle 1 og 6

            int dice2 = rand.nextInt(6) + 1;
            System.out.println("du har scoret: " + dice2);
            // programmet vælger et tilfældige tal som er melle 1 og 6

            int sum = dice1 + dice2;

            // System.out.println("summet er: " + sum);

            if (!(dice1 == 6 && dice2 == 6)) {
                if (turn == 1) {
                    if (dice1 == 1 && dice2 == 1) {
                        sum = 0; // nulstiller pointerne.
                        System.out.println("du har mistede alt dit pointer");
                        turn = 2;
                    } else {
                        turn = 2;
                    }
                    player1 += sum; // summer pointerne.
                    System.out.println(" du har: " + player1 + "pionte");
                } else {
                    if (dice1 == 1 && dice2 == 1) {
                        sum = 0; // nulstiller pionterne.
                        System.out.println("du har mistede alt dit pointer");
                        turn = 1;
                    } else {
                        turn = 1;
                    }
                    player2 += sum;
                    System.out.println("du har: " + player2 + " pionte");
                }

            }
            if (player1 >= 40) {
                System.out.println("player1 er vundet " + navn1);
            } else if (player2 >= 40) {
                System.out.println("player2 er vundet " + navn2);
            } // udråber vineren.

        }
        s.close();
    }
}