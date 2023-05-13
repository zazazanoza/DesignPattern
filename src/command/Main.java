package command;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Integer N = 10;
        Random random = new Random();
        Hatsukaze hatsukaze = new Hatsukaze();
        God god = new God();

        Integer gameCount = 1;
        Integer sleepCount = 1;
        for (int i = 0; i < N; i++) {
            boolean rand = random.nextBoolean();
            if (rand) {
                god.addCommand(new PlayGame(gameCount, hatsukaze));
                gameCount++;
            } else {
                god.addCommand(new Sleep(sleepCount, hatsukaze));
                sleepCount++;
            }
        }

        god.execute();

        System.out.println();
        god.undoCommand();
        god.undoCommand();
        System.out.println();

        god.execute();

    }

}
