import java.util.Random;

public class Dé {
    private int nbFaces;
    Dé(int nbFaceInit) {
        nbFaces = nbFaceInit;
    }
    public int lancerDé() {
        return new Random().nextInt(nbFaces) + 1;
    }
}
