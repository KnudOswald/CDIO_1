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
            System.out.println("det er " + turn + "s tur");
            System.out.println("det er dit tur");
            s.nextLine();

            int dice1 = rand.nextInt(6) + 1;
            System.out.println("du har scoret: " + dice1);
            int dice2 = rand.nextInt(6) + 1;
            System.out.println("du har scoret: " + dice2);
            int sum = dice1 + dice2;

            System.out.println("summet er: " + sum);

            if (dice1 != dice2) {
                if (turn == 1) {
                    turn = 2;
                } else {
                    turn = 1;
                }
            }

        }
        s.close();
    }

}
