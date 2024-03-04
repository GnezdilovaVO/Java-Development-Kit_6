package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MontyHall {
    private BehindTheScenes bts;
//    private int countGames = 100;
    private int countGames = 1000;
    private List<StringBuilder> statistic = new ArrayList<>(100);
    private int countWin, countLose = 0;

    public MontyHall() {
        start();
        System.out.println("Проигрышей: " +countLose);
        System.out.println("Побед: " +countWin);

    }

    private void start(){
        for (int i = 0; i < countGames; i++) {
            bts = new BehindTheScenes(new Random().nextInt(1, 3));
            bts.setNumberDoorPlayer(new Random().nextInt(1,3));
            System.out.println("Игрок выбрал дверь " + bts.numberDoorPlayer);
            bts.setNumberDoorLeading(open());
            System.out.println("Ведущий выбрал дверь " + bts.getNumberDoorLeading());
            bts.setNumberDoorPlayer(finish());
            System.out.println("Игрок выбирает финишный раз " + bts.getNumberDoorPlayer());
            if (bts.getNumberDoorPlayer() == bts.getNumberDoorPrize()){
                System.out.println("Выйграл игрок!");
                countWin++;
            } else {
                System.out.println("Игрок проиграл");
                countLose++;
            }
            StringBuilder sb = new StringBuilder();
            if (bts.getNumberDoorPrize() == bts.getNumberDoorPlayer()) {
                sb.append(i);
                sb.append(" win");
                statistic.add(sb);
            } else {
                sb.append(i);
                sb.append(" lose");
                statistic.add(sb);
            }

        }
        System.out.println(statistic);
    }
    private int open(){
        if (bts.getNumberDoorPlayer() == bts.getNumberDoorPrize() && bts.getNumberDoorPlayer() == 3) return 1;
        else if (bts.getNumberDoorPlayer() == bts.getNumberDoorPrize() && bts.getNumberDoorPlayer() != 3) {
            return (3 - bts.getNumberDoorPlayer());

        }
        return (6 - (bts.getNumberDoorPlayer() + bts.getNumberDoorPrize()));

    }
    private int finish(){
        if (bts.getNumberDoorPlayer() == bts.getNumberDoorPrize()){
            return bts.getNumberDoorPlayer();
        }
        return 6 - (bts.getNumberDoorPlayer() + bts.getNumberDoorPrize());
    }


}
