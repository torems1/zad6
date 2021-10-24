package com.company;

import java.util.Arrays;

public class Main {1

    public static void main(String[] args) {
        Dplayers dplayers = new Dplayers();
        Droll droll = new Droll();
        int playern = dplayers.setPlayers();
        int players[] = new int[playern];
        int throwh = dplayers.setDiceT();
        int summ[] = new int[playern];
        int us = 0;
        Arrays.fill(players, us++);
        Arrays.fill(summ, 0);
        System.out.println("You player 1");
        int max = 0;
        int mN = 0;
        int temp = 0;
        int tempP = 0;
        for (int l = 0; l < 7; l++) {
            System.out.println("++++++++++\nRound - " + (l + 1) + "\n++++++++++");
            {
                for (int i = mN; i < playern; i++) {
                    System.out.println("player - " + (i + 1) + "");
                    for (int j = 0; j < throwh; j++) {
                        summ[i] += droll.roll();
                        System.out.println(summ[i]);
                    }
                }
                for (int i = 0; i < mN; i++) {
                    System.out.println("player - " + (i + 1) + "");
                    for (int j = 0; j < throwh; j++) {
                        summ[i] += droll.roll();
                        System.out.println(summ[i]);
                    }
                }
            }
            for (int j = 0; j < playern; j++) {
                if (summ[j] > max) {
                    max = summ[j];
                    mN = j;
                }
            }
        }
    }
}