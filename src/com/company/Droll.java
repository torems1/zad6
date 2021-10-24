package com.company;

import java.util.Random;

public class Droll {
    private final int min=1;
    private final int max=6;
    private final int diff=max-min;
    public int roll(){
        int i;
        Random random=new Random();
        i=random.nextInt(diff+1);
        i+=min;
        return i;
    }
}
