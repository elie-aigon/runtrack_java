package Jour04.Job05;

public class ComptThread extends Thread{
    public long run(long starter, long finisher) {
        while (starter < finisher){
            starter ++;
        }
        return starter;
    }
}
