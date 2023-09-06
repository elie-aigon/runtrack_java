
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> notes = new ArrayList<>();

    Student(String StartName,List<Integer> StartNotes) {
        name = StartName;
        notes.addAll(StartNotes);
    }
    public void addGrade(int newNote) {
        notes.add(newNote);
        System.out.println("Notes : " + notes);
    }
    public void higherGrade() {
        Collections.sort(notes); System.out.println("Note la plus élevée : " + notes.get(0));
    }
    public void lowerGrade() {
        Collections.sort(notes); System.out.println("Note la moins élevée : " + notes.get(notes.size() - 1));
    }
    public void moyenne() {
        int x = 0;
        for (int i : notes) {
            x += i;
        }
        System.out.println("Moyenne : " + (double) (x/notes.size()));

    }
}
