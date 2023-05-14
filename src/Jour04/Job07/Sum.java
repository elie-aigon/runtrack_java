package Jour04.Job07;

public class Sum extends Thread{
    private int result;
    final private int[] listNumbers;

    public Sum(int[] listNumbers){
        this.listNumbers = listNumbers;
    }
    @Override
    public void run(){
        result = 0;
        for (int i : listNumbers) {
            result += i;
        }
    }
    public int getter(){
        return result;
    }
}

