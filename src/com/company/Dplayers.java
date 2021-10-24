package com.company;

import java.util.Scanner;

public class Dplayers {
    private int maxP;
    public int setPlayers(){
        System.out.println("Enter count players");
        Scanner scanner=new Scanner(System.in);
        maxP=scanner.nextInt();
        return maxP;
    }
    private int numT;
    public int setDiceT(){
        System.out.println("Enter count throw");
        Scanner scanner=new Scanner(System.in);
        numT=scanner.nextInt();
        return numT;
    }


}
