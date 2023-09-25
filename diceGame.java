import java.util.Random;
import java.util.Scanner;

class diceRoll {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random rand = new Random();

        int player1 = 0;
        int player2 = 0;
        int turn = 1;

        System.out.println("welkome til spillet: ");

        System.out.println("tryk på enter");
        s.nextLine();

        while (player1 < 40 && player2 < 40) {
            System.out.println("det er player" + turn + "s tur");

            System.out.println("det er dit tur tryk på enter");
            s.nextLine();

            int dice1 = rand.nextInt(6) + 1;
            System.out.println("du har scoret: " + dice1);

            int dice2 = rand.nextInt(6) + 1;
            System.out.println("du har scoret: " + dice2);

            int sum = dice1 + dice2;

            System.out.println("summet er: " + sum);

            if (!(dice1 == 6 && dice2 == 6)) {
                if (turn == 1) {
                    turn = 2;
                    player1 += sum;
                    System.out.println(" du har: " + player1 + "pionte");
                } else {
                    turn = 1;
                    player2 += sum;
                    System.out.println("du har: " + player2 + "pionte");
                }

            }
            if (dice1 == 1 && dice2 == 1) {
                if (turn == 1) {
                    player1 = 0;
                    System.out.println("du har mistede alt dit pointer");
                } else {
                    player2 = 0;
                    System.out.println("du har mistede alt dit pointer.");
                }
            }
            if (player1 >= 40) {
                System.out.println("player1 er vundet");
            } else if (player2 >= 40) {
                System.out.println("player2 er vundet");
            }

        }
        s.close();
    }

}
