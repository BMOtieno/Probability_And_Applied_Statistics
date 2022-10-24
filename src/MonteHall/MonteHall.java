package MonteHall;

import java.util.Random;

public class MonteHall {
    public static void runMonty() {

        Random rng = new Random();
        int trials = 10000;

        System.out.println("Player never changes the door.");
        int wins = 0;
        for (int i = 1; i <= trials; i++) {
            int prize_door = rng.nextInt(3);
            int contestant_door = rng.nextInt(3);

            if (contestant_door == prize_door)
                wins++;
        }

        System.out.println("Total Wins out of "+trials+": "+wins);
        System.out.println("Percent win: "+(double)wins/trials);

        System.out.println("");
        System.out.println("Player always changes the door.");
        wins = 0;
        for (int i = 1; i <= trials; i++) {
            int prize_door = rng.nextInt(3);
            int contestant_door = rng.nextInt(3);

            // Here, we randomly look for doors until
            // we find one that that is wrong, yet still
            // wasn't picked by the contestant.
            int wrong_door = prize_door;
            while (wrong_door == prize_door ||
                    wrong_door == contestant_door) {
                wrong_door = rng.nextInt(3);
            }

            int alternate_door = 3 - (contestant_door + wrong_door);

            // Always switch doors!
            if (alternate_door == prize_door)
                wins++;
        }

        System.out.println("Total Wins out of "+trials+": "+wins);
        System.out.println("Percent win: "+ (double)wins/trials);
    }

    public static void main(String[] args) {
        runMonty();
    }
}
