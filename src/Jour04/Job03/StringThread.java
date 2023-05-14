package Jour04.Job03;

import java.util.Random;

public class StringThread extends Thread{
    private String StringFraction = "";
    public void run(long len) {
        Random random = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < len; i++){
            StringFraction += characters.charAt(random.nextInt(characters.length()));
        }
    }
    public String getString(){
        return StringFraction;
    }
}
